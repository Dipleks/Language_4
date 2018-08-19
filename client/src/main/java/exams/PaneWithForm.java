package exams;

import interfaceProgram.EffectShadow;
import interfaceProgram.EffectStyle;
import interfaceProgram.IRoot;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

class PaneWithForm implements IRoot
{
    private Button ps = new Button("Контрольная PS");
    private Button tobe = new Button("Контрольная \"TO BE\"");
    private final String released = "-fx-color: #e6e6e6; -fx-font: bold italic 12pt Georgia; -fx-focus-color: GREEN;";
    private final String pressed = "-fx-color: #fdd2a9; -fx-font: bold italic 12pt Georgia; -fx-focus-color: GREEN;";

    VBox getPaneForm(){
        examText.setLayoutX(WIDTH_SIZE/2.7);
        examText.setLayoutY(HEIGHT_SIZE/7);
        examText.setPrefWidth(WIDTH_SIZE/3.5);
        examText.setEffect(EffectShadow.getShadow());
        examText.setPromptText("Введите текст и нажмите на предложение для проверки...");
        textLanguage.setLayoutX(WIDTH_SIZE/2.3);
        textLanguage.setLayoutY(HEIGHT_SIZE/15);
        textLanguage.setPrefWidth(WIDTH_SIZE/2);
        textLanguage.setAlignment(Pos.CENTER_RIGHT);
        textLanguage.setStyle(EffectStyle.getStyleLabel());
//        textLanguage.setStyle("-fx-border-color: RED");
        textLanguage.setEffect(EffectShadow.getShadow());
//        ROOT_PANE.getChildren().add(paneSubMenu);
        ps.setPrefSize(WIDTH_SIZE/6, HEIGHT_SIZE/18);
        ps.setStyle(released);
        ps.setEffect(EffectShadow.getShadow());
        ps.setOnMouseEntered(event -> ps.setStyle(pressed));
        ps.setOnMouseExited(event -> ps.setStyle(released));
        ps.setOnAction(event -> {
            ps.setStyle(pressed);
            tobe.setStyle(released);
            paneForm.getChildren().clear();
            ROOT_PANE.getChildren().remove(examText);
            ROOT_PANE.getChildren().remove(textLanguage);
            ExamPS examPS = new ExamPS();
            examPS.getList();
            ROOT_PANE.getChildren().add(examText);
            ROOT_PANE.getChildren().add(textLanguage);
        });
        tobe.setPrefSize(WIDTH_SIZE/6, HEIGHT_SIZE/18);
        tobe.setStyle(released);
        tobe.setEffect(EffectShadow.getShadow());
        tobe.setOnMouseEntered(event -> tobe.setStyle(pressed));
        tobe.setOnMouseExited(event -> tobe.setStyle(released));
        tobe.setOnAction(event -> {
            tobe.setStyle(pressed);
            ps.setStyle(released);
            paneForm.getChildren().clear();
            ROOT_PANE.getChildren().remove(examText);
            ROOT_PANE.getChildren().remove(textLanguage);
            ExamToBe examToBe = new ExamToBe();
            examToBe.getList();
            ROOT_PANE.getChildren().addAll(examText, textLanguage);
        });

        paneForm.setLayoutX(WIDTH_SIZE/16);
        paneForm.setLayoutY(HEIGHT_SIZE/5);
        paneForm.setSpacing(HEIGHT_SIZE/25);
        paneForm.getChildren().addAll(ps, tobe);
        ROOT_PANE.getChildren().add(paneForm);
        return paneForm;
    }
}