package cards;

import interfaceProgram.EffectShadow;
import interfaceProgram.EffectStyle;
import interfaceProgram.ICards;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

class CallCard implements ICards
{
    private double w = WIDTH_SIZE/8;
    private double h = HEIGHT_SIZE/18;

    VBox getCallCards(){
        rus.setLayoutX(WIDTH_SIZE/18);
        rus.setLayoutY(HEIGHT_SIZE/1.25);
        rus.setStyle(EffectStyle.getStyleButton10());
        rus.setOnAction(event -> {
            eng.setStyle(EffectStyle.getStyleButtonDefault10());
            rus.setStyle(EffectStyle.getStyleButton10());
        });
        rus.setPrefSize(WIDTH_SIZE/15, HEIGHT_SIZE/20);
        eng.setLayoutX(WIDTH_SIZE/7);
        eng.setLayoutY(HEIGHT_SIZE/1.25);
        eng.setOnAction(event -> {
            rus.setStyle(EffectStyle.getStyleButtonDefault10());
            eng.setStyle(EffectStyle.getStyleButton10());
        });
        eng.setPrefSize(WIDTH_SIZE/15, HEIGHT_SIZE/20);
        eng.setStyle(EffectStyle.getStyleButtonDefault10());
        rus.setToggleGroup(group);
        eng.setToggleGroup(group);
        rus.setSelected(true);

        label.setLayoutX(WIDTH_SIZE/2);
        label.setLayoutY(HEIGHT_SIZE/2);
        ROOT_PANE.getChildren().add(label);

        ROOT_PANE.getChildren().addAll(rus, eng);

        CALL_CARDS.setLayoutX(WIDTH_SIZE/12);
        CALL_CARDS.setLayoutY(HEIGHT_SIZE/5);
        CALL_CARDS.setSpacing(HEIGHT_SIZE/50);
        CALL_CARDS.setEffect(EffectShadow.getShadow());
        examPS.setStyle(EffectStyle.getStyleButtonDefault12());
        examToBe.setStyle(EffectStyle.getStyleButtonDefault12());
        word.setStyle(EffectStyle.getStyleButtonDefault12());

        getSettingsButton();

        examPS.setOnAction(event -> {
            ROOT_PANE.getChildren().remove(next);
            ROOT_PANE.getChildren().remove(translation);
            examPS.setStyle(EffectStyle.getStyleButton12());
            examToBe.setStyle(EffectStyle.getStyleButtonDefault12());
            word.setStyle(EffectStyle.getStyleButtonDefault12());
            Change change = new Change();
            change.getNext(0, 699, new OutputCardExamPS());
            change.getTranslation();
            ROOT_PANE.getChildren().addAll(next, translation);
        });
        examToBe.setOnAction(event -> {
            examPS.setStyle(EffectStyle.getStyleButtonDefault12());
            examToBe.setStyle(EffectStyle.getStyleButton12());
            word.setStyle(EffectStyle.getStyleButtonDefault12());
            ROOT_PANE.getChildren().remove(next);
            ROOT_PANE.getChildren().remove(translation);
            Change change = new Change();
            change.getNext(0,399, new OutputCardExamToBe());
            change.getTranslation();
            ROOT_PANE.getChildren().addAll(next, translation);
        });
        word.setOnAction(event -> {
            ROOT_PANE.getChildren().remove(next);
            ROOT_PANE.getChildren().remove(translation);
            examPS.setStyle(EffectStyle.getStyleButtonDefault12());
            examToBe.setStyle(EffectStyle.getStyleButtonDefault12());
            word.setStyle(EffectStyle.getStyleButton12());
            Change change = new Change();
            change.getNext(0, 422, new OutputCardWords());
            change.getTranslation();
            ROOT_PANE.getChildren().addAll(next, translation);
        });
        CALL_CARDS.getChildren().addAll(examPS, examToBe, word);
        ROOT_PANE.getChildren().add(CALL_CARDS);
        return CALL_CARDS;
    }

    private void getSettingsButton(){
        examPS.setPrefSize(w, h);
        examToBe.setPrefSize(w, h);
        word.setPrefSize(w, h);
    }
}
