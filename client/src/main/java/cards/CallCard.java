package cards;

import db.IDataBase;
import interfaceProgram.EffectShadow;
import interfaceProgram.EffectStyle;
import interfaceProgram.ICards;
import javafx.scene.layout.VBox;
import texts.ExamTextPS;
import texts.ExamTextToBe;
import texts.WordsText;

class CallCard implements ICards, IDataBase
{
    private double w = WIDTH_SIZE/8;
    private double h = HEIGHT_SIZE/18;

    VBox getCallCards(){
        rus.setLayoutX(WIDTH_SIZE/18);
        rus.setLayoutY(HEIGHT_SIZE/1.25);
        rus.setEffect(EffectShadow.getShadow());
        rus.setStyle(EffectStyle.getStyleButton10());
        rus.setOnAction(event -> {
            eng.setStyle(EffectStyle.getStyleButtonDefault10());
            rus.setStyle(EffectStyle.getStyleButton10());
        });
        rus.setPrefSize(WIDTH_SIZE/15, HEIGHT_SIZE/20);
        eng.setLayoutX(WIDTH_SIZE/7);
        eng.setLayoutY(HEIGHT_SIZE/1.25);
        eng.setEffect(EffectShadow.getShadow());
        eng.setOnAction(event -> {
            rus.setStyle(EffectStyle.getStyleButtonDefault10());
            eng.setStyle(EffectStyle.getStyleButton10());
        });
        eng.setPrefSize(WIDTH_SIZE/15, HEIGHT_SIZE/20);
        eng.setStyle(EffectStyle.getStyleButtonDefault10());
        rus.setToggleGroup(group);
        eng.setToggleGroup(group);
        rus.setSelected(true);

        ROOT_PANE.getChildren().addAll(rus, eng);

        CALL_CARDS.setLayoutX(WIDTH_SIZE/14);
        CALL_CARDS.setLayoutY(HEIGHT_SIZE/5);
        CALL_CARDS.setSpacing(HEIGHT_SIZE/50);
        CALL_CARDS.setEffect(EffectShadow.getShadow());
        examPS.setStyle(EffectStyle.getStyleButtonDefault12());
        examToBe.setStyle(EffectStyle.getStyleButtonDefault12());
        word.setStyle(EffectStyle.getStyleButtonDefault12());

        getSettingsButton();

        examPS.setOnAction(event -> {
            OutputCard outputCard = new OutputCard();
//            outputCard.deleteHistory();
            ROOT_PANE.getChildren().remove(next);
            ROOT_PANE.getChildren().remove(translation);
            ROOT_PANE.getChildren().remove(mix);
            examPS.setStyle(EffectStyle.getStyleButton12());
            examToBe.setStyle(EffectStyle.getStyleButtonDefault12());
            range.setStyle(EffectStyle.getStyleButtonDefault10());
            word.setStyle(EffectStyle.getStyleButtonDefault12());
            outputCard.getOutputCard(699, new ExamTextPS());
            ROOT_PANE.getChildren().addAll(next, mix, translation);
        });
        examToBe.setOnAction(event -> {
            OutputCard outputCard = new OutputCard();
            outputCard.deleteHistory();
            examPS.setStyle(EffectStyle.getStyleButtonDefault12());
            examToBe.setStyle(EffectStyle.getStyleButton12());
            range.setStyle(EffectStyle.getStyleButtonDefault10());
            word.setStyle(EffectStyle.getStyleButtonDefault12());
            ROOT_PANE.getChildren().remove(next);
            ROOT_PANE.getChildren().remove(translation);
            ROOT_PANE.getChildren().remove(mix);
            outputCard.getOutputCard(399, new ExamTextToBe());
            ROOT_PANE.getChildren().addAll(next, mix, translation);
        });
        word.setOnAction(event -> {
            OutputCard outputCard = new OutputCard();
            outputCard.deleteHistory();
            ROOT_PANE.getChildren().remove(next);
            ROOT_PANE.getChildren().remove(translation);
            ROOT_PANE.getChildren().remove(mix);
            examPS.setStyle(EffectStyle.getStyleButtonDefault12());
            examToBe.setStyle(EffectStyle.getStyleButtonDefault12());
            range.setStyle(EffectStyle.getStyleButtonDefault10());
            word.setStyle(EffectStyle.getStyleButton12());
            outputCard.getOutputCard(1038, new WordsText());
            ROOT_PANE.getChildren().addAll(next, mix, translation);
        });
        range.setOnAction(event -> {
            OutputCard outputCard = new OutputCard();
            outputCard.deleteHistory();
            ROOT_PANE.getChildren().remove(next);
            ROOT_PANE.getChildren().remove(translation);
            ROOT_PANE.getChildren().remove(mix);
            examPS.setStyle(EffectStyle.getStyleButtonDefault12());
            examToBe.setStyle(EffectStyle.getStyleButtonDefault12());
            word.setStyle(EffectStyle.getStyleButtonDefault12());
            range.setStyle(EffectStyle.getStyleButton10());

//            RangeWords rangeWords = new RangeWords();
//            rangeWords.addRangeTable();

            T t = new T(5, 10);
            t.getOutputCard();

            ROOT_PANE.getChildren().addAll(next, mix, translation);
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
