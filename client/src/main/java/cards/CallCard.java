package cards;

import db.IDataBase;
import interfaceProgram.EffectShadow;
import interfaceProgram.EffectStyle;
import interfaceProgram.ICards;
import javafx.scene.layout.VBox;

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
            outputCard.deleteHistory();
            ROOT_PANE.getChildren().remove(next);
            ROOT_PANE.getChildren().remove(translation);
            examPS.setStyle(EffectStyle.getStyleButton12());
            examToBe.setStyle(EffectStyle.getStyleButtonDefault12());
            range.setStyle(EffectStyle.getStyleButtonDefault10());
            word.setStyle(EffectStyle.getStyleButtonDefault12());
            Change change = new Change();
            change.getNext(new OutputCardExamPS(), "exam_cards_ps");
            change.getTranslation();
            ROOT_PANE.getChildren().addAll(next, translation);
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
            Change change = new Change();
            change.getNext(new OutputCardExamToBe(), "exam_cards_to_be");
            change.getTranslation();
            ROOT_PANE.getChildren().addAll(next, translation);
        });
        word.setOnAction(event -> {
            OutputCard outputCard = new OutputCard();
            outputCard.deleteHistory();
            ROOT_PANE.getChildren().remove(next);
            ROOT_PANE.getChildren().remove(translation);
            examPS.setStyle(EffectStyle.getStyleButtonDefault12());
            examToBe.setStyle(EffectStyle.getStyleButtonDefault12());
            range.setStyle(EffectStyle.getStyleButtonDefault10());
            word.setStyle(EffectStyle.getStyleButton12());
            Change change = new Change();
            change.getNext(new OutputCardWords(), "words");
            change.getTranslation();
            ROOT_PANE.getChildren().addAll(next, translation);
        });
        range.setOnAction(event -> {
            OutputCard outputCard = new OutputCard();
            outputCard.deleteHistory();
            ROOT_PANE.getChildren().remove(next);
            ROOT_PANE.getChildren().remove(translation);
            examPS.setStyle(EffectStyle.getStyleButtonDefault12());
            examToBe.setStyle(EffectStyle.getStyleButtonDefault12());
            word.setStyle(EffectStyle.getStyleButtonDefault12());
            range.setStyle(EffectStyle.getStyleButton10());

            RangeWords rangeWords = new RangeWords();
            rangeWords.addRangeTable();

            Change change = new Change();
            change.getNext(new OutputCardWords(), "words_range");
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
