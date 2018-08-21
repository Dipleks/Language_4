package cards;

import db.IDataBase;
import exams.Exams;
import interfaceProgram.EffectShadow;
import interfaceProgram.EffectStyle;
import interfaceProgram.ICards;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import menu.ClearDisplay;
import menu.MenuBarEngRus;
import texts.ExamTextPS;
import texts.ExamTextToBe;
import texts.WordsText;
import words.ListWords;

import static interfaceProgram.IRoot.invocationPane;

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
            ROOT_PANE.getChildren().remove(range);
            ROOT_PANE.getChildren().remove(CALL_CARDS);
            examPS.setStyle(EffectStyle.getStyleButtonDefault12());
            examToBe.setStyle(EffectStyle.getStyleButtonDefault12());
            word.setStyle(EffectStyle.getStyleButtonDefault12());
            range.setStyle(EffectStyle.getStyleButton10());

//            RangeWords rangeWords = new RangeWords();
//            rangeWords.addRangeTable();

            Invoc invoc1 = new Invoc();
            Invoc invoc2 = new Invoc();
            Invoc invoc3 = new Invoc();
            Invoc invoc4 = new Invoc();
            Invoc invoc5 = new Invoc();
            Invoc invoc6 = new Invoc();
            Invoc invoc7 = new Invoc();
            Invoc invoc8 = new Invoc();
            invocationPane.setSpacing(WIDTH_SIZE/65);
            invocationPane.setLayoutX(WIDTH_SIZE/12);
            invocationPane.setLayoutY(HEIGHT_SIZE/6);
            invocationPane.getChildren().addAll(
                    invoc1.getOutputCardT("1 - 130",  new String[130], new String[130],0),
                    invoc2.getOutputCardT("131 - 260", new String[130], new String[130], 130),
                    invoc3.getOutputCardT("261 - 390", new String[130], new String[130], 260),
                    invoc4.getOutputCardT("391 - 520", new String[130], new String[130], 390),
                    invoc5.getOutputCardT("521 - 650", new String[130], new String[130], 520),
                    invoc6.getOutputCardT("651 - 780", new String[130], new String[130], 650),
                    invoc7.getOutputCardT("781 - 910", new String[130], new String[130], 780),
                    invoc8.getOutputCardT("911 - 1039", new String[129], new String[130], 910)
            );
            final String released = "-fx-color: #e6e6e6; -fx-font: bold italic 10pt Georgia; -fx-focus-color: GREEN;";
            final String pressed = "-fx-color: #fdd2a9; -fx-font: bold italic 10pt Georgia; -fx-focus-color: GREEN;";
            backward.setStyle(EffectStyle.getStyleButtonDefault10());
            backward.setEffect(EffectShadow.getShadow());
            backward.setPrefSize(WIDTH_SIZE/12, HEIGHT_SIZE/20);
            backward.setLayoutX(WIDTH_SIZE/3.7);
            backward.setLayoutY(HEIGHT_SIZE/8);
            backward.setOnMouseEntered(event1 -> backward.setStyle(pressed));
            backward.setOnMouseExited(event1 -> backward.setStyle(released));
            backward.setOnAction(event1 -> {
                ClearDisplay.clearMethod();
                MenuBarEngRus menuBarEngRus = new MenuBarEngRus();
                menuBarEngRus.getMenu();
                Cards cards = new Cards();
                cards.getCards();
            });
            ROOT_PANE.getChildren().addAll(invocationPane, backward);
        });
        CALL_CARDS.getChildren().addAll(examPS, examToBe, word, range);
        ROOT_PANE.getChildren().add(CALL_CARDS);
        return CALL_CARDS;
    }

    private void getSettingsButton(){
        examPS.setPrefSize(w, h);
        examToBe.setPrefSize(w, h);
        word.setPrefSize(w, h);
    }
}
