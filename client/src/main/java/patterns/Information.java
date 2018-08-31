package patterns;

import interfaceProgram.EffectShadow;
import interfaceProgram.EffectStyle;
import interfaceProgram.IRoot;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.web.WebView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Information implements IRoot
{
    public void getInfo(String url, String name, String click, String selected, String look, String play)
    {
        CLICK_TEXT.setText(click);
        SELECTED_LANGUAGE.setText(selected);
        LOOK_YOUTUBE.setText(look);
        PLAY_LIST.setText(play);

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

        PANE_INFO.getChildren().addAll(INFORMATION, CLICK_TEXT, SELECTED_LANGUAGE, LOOK_YOUTUBE, getVideo(url, name), PLAY_LIST);
        ROOT_PANE.getChildren().add(PANE_INFO);
        if (url == null)
        {
            ROOT_PANE.getChildren().remove(PANE_INFO);
        }
    }

    private Label getVideo(String url, String name)
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
}
