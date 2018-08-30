package patterns;

import interfaceProgram.*;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.web.WebView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import texts.ITexts;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// Invocation - вызов. Класс создает новую кнопку котороая помещается в
// массив кнопок который добавляется в окно для вызова соответствующего
// списка предложений
public class Invocation implements IRoot, ICards, ILink
{
    private int number;
    private Button call = new Button();
    private SuggestionList suggestionList = new SuggestionList();
    private final String released = "-fx-color: #e6e6e6; -fx-font: bold italic 10pt Georgia; -fx-focus-color: GREEN;";
    private final String pressed = "-fx-color: #cccccc; -fx-font: bold italic 10pt Georgia; -fx-focus-color: GREEN;";
    private final String pressedCol = "-fx-color: #fdd2a9; -fx-font: bold italic 10pt Georgia; -fx-focus-color: GREEN;";

    // кнопка задания
    public Button getInvocation(String name, Label[] list, int value, String url, Assignable assignable)
    {
        rus.setStyle(pressedCol);
        rus.setPrefSize(WIDTH_SIZE/14, HEIGHT_SIZE/25);
        rus.setEffect(EffectShadow.getShadow());
        rus.setToggleGroup(group);
        rus.setSelected(true);

        eng.setStyle(released);
        eng.setPrefSize(WIDTH_SIZE/14, HEIGHT_SIZE/25);
        eng.setEffect(EffectShadow.getShadow());
        eng.setToggleGroup(group);

        call.setText(name);
        call.setStyle(released);
        call.setPrefSize(WIDTH_SIZE/10, HEIGHT_SIZE/20);
        call.setEffect(EffectShadow.getShadow());
        call.setOnMouseEntered(event -> call.setStyle(pressedCol));
        call.setOnMouseExited(event -> call.setStyle(released));
        call.setOnMousePressed(event -> call.setStyle(pressed));
        call.setOnMouseReleased(event -> call.setStyle(released));
        call.setOnAction(event ->
        {
            PANE_INFO.getChildren().clear();
            ROOT_PANE.getChildren().remove(PANE_INFO);
            CLICK_TEXT.setPrefWidth(WIDTH_SIZE/7);
            CLICK_TEXT.setWrapText(true);
            SELECTED_LANGUAGE.setPrefWidth(WIDTH_SIZE/7);
            SELECTED_LANGUAGE.setWrapText(true);
            LOOK_YOUTUBE.setPrefWidth(WIDTH_SIZE/7);
            LOOK_YOUTUBE.setWrapText(true);
            PLAY_LIST.setPrefWidth(WIDTH_SIZE/7);
            PLAY_LIST.setWrapText(true);
            PANE_INFO.setSpacing(HEIGHT_SIZE/60);
            PANE_INFO.setAlignment(Pos.CENTER);
            PANE_INFO.setLayoutX(WIDTH_SIZE/1.23);
            PANE_INFO.setLayoutY(HEIGHT_SIZE/4);
            PANE_INFO.setEffect(EffectShadow.getShadow());
            PANE_INFO.setStyle(EffectStyle.getStyleLabel12());
            INFORMATION.setStyle(EffectStyle.getStyleLabel16());

            PANE_INFO.getChildren().addAll(INFORMATION, CLICK_TEXT, SELECTED_LANGUAGE, LOOK_YOUTUBE, getVideo(call.getText(), url), PLAY_LIST);
            ROOT_PANE.getChildren().add(PANE_INFO);
            if (url == null)
            {
                ROOT_PANE.getChildren().remove(PANE_INFO);
            }

            suggestionPane.getChildren().clear();
            languagePane.getChildren().clear();
            suggestionList.getList(list, value, assignable);
            ROOT_PANE.getChildren().remove(title);
            title.setText(call.getText());
            title.setStyle(EffectStyle.getStyleLabel14());
            title.setLayoutX(WIDTH_SIZE/1.5);
            title.setLayoutY(HEIGHT_SIZE/7);
            title.setEffect(EffectShadow.getShadow());

            rus.setOnAction(e -> {
                eng.setStyle(released);
                rus.setStyle(pressedCol);
                suggestionPane.getChildren().clear();
                languagePane.getChildren().clear();
                suggestionList.getList(list, value, assignable);
            });
            eng.setOnAction(e -> {
                rus.setStyle(released);
                eng.setStyle(pressedCol);
                suggestionPane.getChildren().clear();
                languagePane.getChildren().clear();
                suggestionList.getList(list, value, assignable);
            });
            ROOT_PANE.getChildren().addAll(title);
            if (!rus.isSelected() && !eng.isSelected()) {
                getPane("Круг закончен!");
            }
        });
        return call;
    }

    private Label getVideo(String name, String url)
    {
        Stage web = new Stage();
        Group group = new Group();
        WebView webview = new WebView();
        Scene scene = new Scene(group, WIDTH_SIZE/1.2, HEIGHT_SIZE/1.2, Color.GREY);

        NAME_WEB.setText(name);
        NAME_WEB.setTextFill(Color.LIMEGREEN);
        NAME_WEB.setStyle(EffectStyle.getStyleLabel12());

        NAME_WEB.setOnMouseClicked(event1 ->
        {
            webview.setPrefSize(WIDTH_SIZE/1.5, HEIGHT_SIZE/1.5);
            webview.getEngine().load(url);
            web.setScene(scene);
            web.show();
        });

        webview.setLayoutX(20);
        webview.setLayoutY(30);

        Button button = new Button("Закрыть видео");
        button.setStyle(EffectStyle.getStyleButtonDefault12());
        button.setLayoutX(scene.getWidth()/1.15);
        button.setLayoutY(scene.getHeight()/4);
        button.setOnAction(event1 -> {
            webview.getEngine().load(null);
            web.close();
        });

        group.getChildren().addAll(webview, button);

        web.initModality(Modality.APPLICATION_MODAL);
        web.initStyle(StageStyle.TRANSPARENT);

        return NAME_WEB;
    }

    // кнопка в картачках
    public Button getOutputCard(String name, int value, ITexts iTexts)
    {
        ROOT_PANE.getChildren().remove(rus);
        ROOT_PANE.getChildren().remove(eng);
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        String[] engText = new String[100];
        String[] rusText = new String[100];

        for (int i = 0; i < engText.length; i++) {
            engText[i] = iTexts.getEnglish().get(value + i);
            list1.add(i, engText[i]);
        }
        for (int i = 0; i < rusText.length; i++) {
            rusText[i] = iTexts.getRussia().get(value + i);
            list2.add(i, rusText[i]);
        }
        Collections.shuffle(list1);
        Collections.shuffle(list2);

        getStyle();

        call.setText(name);
        call.setStyle(released);
        call.setPrefSize(WIDTH_SIZE/12, HEIGHT_SIZE/25);
        call.setEffect(EffectShadow.getShadow());
        call.setOnMouseEntered(event -> call.setStyle(pressedCol));
        call.setOnMouseExited(event -> call.setStyle(released));
        call.setOnMousePressed(event -> call.setStyle(pressed));
        call.setOnMouseReleased(event -> call.setStyle(released));
        call.setOnAction(event -> {
            number = 0;
            ROOT_PANE.getChildren().remove(next);
            ROOT_PANE.getChildren().remove(translation);
            next.setOnAction(event1 -> {
                try {
                    ROOT_PANE.getChildren().remove(title);
                    ROOT_PANE.getChildren().remove(tablePane);
                    ROOT_PANE.getChildren().remove(COUNTER);
                    ROOT_PANE.getChildren().remove(TITLE);

                    if (rus.isSelected()) {
                        title.setText(list2.get(number));
                        translation.setOnAction(e -> {
                            Collection<Integer> c = iTexts.getRussia().keySet();
                            String str = title.getText();
                            for (Integer key : c) {
                                String obj = iTexts.getRussia().get(key);
                                if (str.equals(obj)) {
                                    title.setText(iTexts.getEnglish().get(key));
                                }
                            }
                        });
                    }
                    if (eng.isSelected()) {
                        title.setText(list1.get(number));
                        translation.setOnAction(e -> {
                            Collection<Integer> c = iTexts.getEnglish().keySet();
                            String str = title.getText();
                            for (Integer key : c) {
                                String obj = iTexts.getEnglish().get(key);
                                if (str.equals(obj)) {
                                    title.setText(iTexts.getRussia().get(key));
                                }
                            }
                        });
                    }
                    if (!rus.isSelected() & !eng.isSelected()) {
                        eng.setStyle(released);
                        rus.setStyle(released);
                        getPane("Выберите язык");
                    }
                    number++;
                    COUNTER.setText("Пройдено карточек - " + number);
                    TITLE.setText("Диапазон: " + call.getText());
                    ROOT_PANE.getChildren().add(tablePane);
                    ROOT_PANE.getChildren().add(title);
                    ROOT_PANE.getChildren().add(COUNTER);
                    ROOT_PANE.getChildren().add(TITLE);
                } catch (IndexOutOfBoundsException e){
                    number = 0;
                    getPane("Круг закончен!");
                }
            });
            rus.setOnAction(event1 -> {
                eng.setStyle(EffectStyle.getStyleButtonDefault10());
                rus.setStyle(EffectStyle.getStyleButton10());
                number = 0;
                ROOT_PANE.getChildren().remove(COUNTER);
                ROOT_PANE.getChildren().remove(TITLE);
                COUNTER.setText("Пройдено карточек - " + number);
                TITLE.setText("Диапазон: " + call.getText());
                ROOT_PANE.getChildren().add(COUNTER);
                ROOT_PANE.getChildren().add(TITLE);
            });
            eng.setOnAction(event1 -> {
                rus.setStyle(EffectStyle.getStyleButtonDefault10());
                eng.setStyle(EffectStyle.getStyleButton10());
                number = 0;
                ROOT_PANE.getChildren().remove(COUNTER);
                ROOT_PANE.getChildren().remove(TITLE);
                COUNTER.setText("Пройдено карточек - " + number);
                TITLE.setText("Диапазон: " + call.getText());
                ROOT_PANE.getChildren().add(COUNTER);
                ROOT_PANE.getChildren().add(TITLE);
            });
            ROOT_PANE.getChildren().addAll(next, translation);
        });

        ROOT_PANE.getChildren().addAll(rus, eng);
        return call;
    }

    private void getStyle(){
        translation.setLayoutX(WIDTH_SIZE/1.4);
        translation.setLayoutY(HEIGHT_SIZE/2);
        translation.setStyle(EffectStyle.getStyleButtonDefault10());
        translation.setEffect(EffectShadow.getShadow());
        translation.setOnMousePressed(event -> translation.setStyle(EffectStyle.getStyleButton10()));
        translation.setOnMouseReleased(event -> translation.setStyle(EffectStyle.getStyleButtonDefault10()));
        translation.setPrefSize(WIDTH_SIZE/12, HEIGHT_SIZE/25);

        title.setLayoutX(WIDTH_SIZE/2.5);
        title.setLayoutY(HEIGHT_SIZE/2.3);
        title.setPrefWidth(WIDTH_SIZE/2.5);
        title.setWrapText(true);
        title.setAlignment(Pos.CENTER);
        title.setStyle(EffectStyle.getStyleLabel14() /*+ "-fx-border-color: RED;"*/);
        title.setEffect(EffectShadow.getShadow());

        next.setLayoutX(WIDTH_SIZE/2.5);
        next.setLayoutY(HEIGHT_SIZE/2);
        next.setStyle(EffectStyle.getStyleButtonDefault10());
        next.setOnMousePressed(event -> next.setStyle(EffectStyle.getStyleButton10()));
        next.setOnMouseReleased(event -> next.setStyle(EffectStyle.getStyleButtonDefault10()));
        next.setEffect(EffectShadow.getShadow());
        next.setPrefSize(WIDTH_SIZE/12, HEIGHT_SIZE/25);

        COUNTER.setLayoutX(WIDTH_SIZE/2.7);
        COUNTER.setLayoutY(HEIGHT_SIZE/3);
        COUNTER.setStyle(EffectStyle.getStyleLabelColor());
        COUNTER.setEffect(EffectShadow.getShadow());
        COUNTER.setTextFill(Color.DARKRED);

        TITLE.setLayoutX(WIDTH_SIZE/1.4);
        TITLE.setLayoutY(HEIGHT_SIZE/3);
        TITLE.setStyle(EffectStyle.getStyleLabelColor());
        TITLE.setEffect(EffectShadow.getShadow());
        TITLE.setTextFill(Color.DARKRED);
    }
}
