package cards;

import interfaceProgram.EffectShadow;
import interfaceProgram.EffectStyle;
import interfaceProgram.ICards;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import patterns.Exception;
import texts.WordsText;
import words.ListWords;
import words.Words;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Invoc implements ICards
{
    private int number;
    private Button call = new Button();
    private final String released = "-fx-color: #e6e6e6; -fx-font: bold italic 10pt Georgia; -fx-focus-color: GREEN;";
    private final String pressed = "-fx-color: #cccccc; -fx-font: bold italic 10pt Georgia; -fx-focus-color: GREEN;";
    private final String pressedCol = "-fx-color: #fdd2a9; -fx-font: bold italic 10pt Georgia; -fx-focus-color: GREEN;";
    private WordsText wordsText = new WordsText();

    Button getOutputCardT(String name, String[] engl, String[] rusl, int value){

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        for (int i = 0; i < engl.length; i++) {
            engl[i] = wordsText.getEnglish().get(value + i);
            list1.add(i, engl[i]);
        }
        for (int i = 0; i < rusl.length; i++) {
            rusl[i] = wordsText.getRussia().get(value + i);
            list2.add(i, rusl[i]);
        }
        Collections.shuffle(list1);
        Collections.shuffle(list2);

        getStyle();
        call.setText(name);
        call.setStyle(released);
        call.setPrefSize(WIDTH_SIZE/10, HEIGHT_SIZE/20);
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
                ROOT_PANE.getChildren().remove(title);
                ROOT_PANE.getChildren().remove(tablePane);
                ROOT_PANE.getChildren().remove(COUNTER);

                if (rus.isSelected()){
                    title.setText(list2.get(number));
                }
                if (eng.isSelected()){
                    title.setText(list1.get(number));
                }

                number++;
                COUNTER.setText("Пройдено карточек - " + number);
                ROOT_PANE.getChildren().add(tablePane);
                ROOT_PANE.getChildren().add(title);
                ROOT_PANE.getChildren().add(COUNTER);

            });
            rus.setOnAction(event1 -> {
                number = 0;
                ROOT_PANE.getChildren().remove(COUNTER);
                COUNTER.setText("Пройдено карточек - " + number);
                ROOT_PANE.getChildren().add(COUNTER);
            });
            eng.setOnAction(event1 -> {
                number = 0;
                ROOT_PANE.getChildren().remove(COUNTER);
                COUNTER.setText("Пройдено карточек - " + number);
                ROOT_PANE.getChildren().add(COUNTER);
            });
                History history = new History();
                history.getHistory();
            ROOT_PANE.getChildren().addAll(next, translation);
        });
        return call;
    }

    private void getStyle(){
        translation.setLayoutX(WIDTH_SIZE/1.4);
        translation.setLayoutY(HEIGHT_SIZE/4);
        translation.setStyle(EffectStyle.getStyleButtonDefault10());
        translation.setEffect(EffectShadow.getShadow());
        translation.setOnMousePressed(event -> translation.setStyle(EffectStyle.getStyleButton10()));
        translation.setOnMouseReleased(event -> translation.setStyle(EffectStyle.getStyleButtonDefault10()));
        translation.setPrefSize(WIDTH_SIZE/12, HEIGHT_SIZE/25);

        title.setLayoutX(WIDTH_SIZE/2.5);
        title.setLayoutY(HEIGHT_SIZE/6);
        title.setPrefWidth(WIDTH_SIZE/2.5);
        title.setWrapText(true);
        title.setAlignment(Pos.CENTER);
        title.setStyle(EffectStyle.getStyleLabel() /*+ "-fx-border-color: RED;"*/);
        title.setEffect(EffectShadow.getShadow());

        next.setLayoutX(WIDTH_SIZE/2.5);
        next.setLayoutY(HEIGHT_SIZE/4);
        next.setStyle(EffectStyle.getStyleButtonDefault10());
        next.setOnMousePressed(event -> next.setStyle(EffectStyle.getStyleButton10()));
        next.setOnMouseReleased(event -> next.setStyle(EffectStyle.getStyleButtonDefault10()));
        next.setEffect(EffectShadow.getShadow());
        next.setPrefSize(WIDTH_SIZE/12, HEIGHT_SIZE/25);

//        mix.setLayoutX(WIDTH_SIZE/1.8);
//        mix.setLayoutY(HEIGHT_SIZE/4);
//        mix.setStyle(EffectStyle.getStyleButtonDefault10());
//        mix.setOnMousePressed(event -> mix.setStyle(EffectStyle.getStyleButton10()));
//        mix.setOnMouseReleased(event -> mix.setStyle(EffectStyle.getStyleButtonDefault10()));
//        mix.setEffect(EffectShadow.getShadow());
//        mix.setPrefSize(WIDTH_SIZE/12, HEIGHT_SIZE/25);

        COUNTER.setLayoutX(WIDTH_SIZE/2.7);
        COUNTER.setLayoutY(HEIGHT_SIZE/10);
        COUNTER.setStyle(EffectStyle.getStyleLabelColor());
        COUNTER.setEffect(EffectShadow.getShadow());
        COUNTER.setTextFill(Color.DARKRED);
    }
}