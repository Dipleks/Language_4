package cards;

import db.IDataBase;
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
import patterns.Invocation;

class CallCard implements ICards, IDataBase
{
    private double w = WIDTH_SIZE/8;
    private double h = HEIGHT_SIZE/18;
    private Label lang = new Label("Выберите язык");

    VBox getCallCards(){

        getSettings();

        examPS.setOnAction(event -> {
            remove();
            examPS.setStyle(EffectStyle.getStyleButton12());
            examToBe.setStyle(EffectStyle.getStyleButtonDefault12());
            word.setStyle(EffectStyle.getStyleButtonDefault12());
            Invocation invocation1 = new Invocation();
            Invocation invocation2 = new Invocation();
            Invocation invocation3 = new Invocation();
            Invocation invocation4 = new Invocation();
            Invocation invocation5 = new Invocation();
            Invocation invocation6 = new Invocation();
            Invocation invocation7 = new Invocation();
            invocationPane.getChildren().addAll(
                    invocation1.getOutputCard("1 - 100", 0, new ExamTextPS()),
                    invocation2.getOutputCard("101 - 200",100, new ExamTextPS()),
                    invocation3.getOutputCard("201 - 300", 200, new ExamTextPS()),
                    invocation4.getOutputCard("301 - 400", 300, new ExamTextPS()),
                    invocation5.getOutputCard("401 - 500", 400, new ExamTextPS()),
                    invocation6.getOutputCard("501 - 600", 500, new ExamTextPS()),
                    invocation7.getOutputCard("601 - 700", 600, new ExamTextPS())
            );

        });
        examToBe.setOnAction(event -> {
            remove();
            examPS.setStyle(EffectStyle.getStyleButtonDefault12());
            examToBe.setStyle(EffectStyle.getStyleButton12());
            word.setStyle(EffectStyle.getStyleButtonDefault12());
            Invocation invocation1 = new Invocation();
            Invocation invocation2 = new Invocation();
            Invocation invocation3 = new Invocation();
            Invocation invocation4 = new Invocation();
            Invocation invocation5 = new Invocation();
            Invocation invocation6 = new Invocation();

            invocationPane.getChildren().addAll(
                    invocation1.getOutputCard("1 - 100", 0, new ExamTextToBe()),
                    invocation2.getOutputCard("101 - 200", 100, new ExamTextToBe()),
                    invocation3.getOutputCard("201 - 300", 200, new ExamTextToBe()),
                    invocation4.getOutputCard("301 - 400", 300, new ExamTextToBe()),
                    invocation5.getOutputCard("401 - 500", 400, new ExamTextToBe()),
                    invocation6.getOutputCard("501 - 600", 500, new ExamTextToBe())
            );

        });
        word.setOnAction(event -> {
            remove();
            examPS.setStyle(EffectStyle.getStyleButtonDefault12());
            examToBe.setStyle(EffectStyle.getStyleButtonDefault12());
            word.setStyle(EffectStyle.getStyleButton12());
            Invocation invocation1 = new Invocation();
            Invocation invocation2 = new Invocation();
            Invocation invocation3 = new Invocation();
            Invocation invocation4 = new Invocation();
            Invocation invocation5 = new Invocation();
            Invocation invocation6 = new Invocation();
            Invocation invocation7 = new Invocation();
            Invocation invocation8 = new Invocation();
            Invocation invocation9 = new Invocation();
            Invocation invocation10 = new Invocation();

            invocationPane.getChildren().addAll(
                    invocation1.getOutputCard("1 - 100", 0, new WordsText()),
                    invocation2.getOutputCard("101 - 200", 100, new WordsText()),
                    invocation3.getOutputCard("201 - 300", 200, new WordsText()),
                    invocation4.getOutputCard("301 - 400", 300, new WordsText()),
                    invocation5.getOutputCard("401 - 500", 400, new WordsText()),
                    invocation6.getOutputCard("501 - 600", 500, new WordsText()),
                    invocation7.getOutputCard("601 - 700", 600, new WordsText()),
                    invocation8.getOutputCard("701 - 800", 700, new WordsText()),
                    invocation9.getOutputCard("801 - 900", 800, new WordsText()),
                    invocation10.getOutputCard("901 - 1000", 900, new WordsText())
            );
        });
        CALL_CARDS.getChildren().addAll(examPS, examToBe, word);
        ROOT_PANE.getChildren().add(CALL_CARDS);
        return CALL_CARDS;
    }

    private void getSettings(){
        examPS.setPrefSize(w, h);
        examToBe.setPrefSize(w, h);
        word.setPrefSize(w, h);

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

        lang.setStyle(EffectStyle.getStyleLabel());
        lang.setEffect(EffectShadow.getShadow());
        lang.setLayoutX(WIDTH_SIZE/11);
        lang.setLayoutY(HEIGHT_SIZE/1.31);

        ROOT_PANE.getChildren().addAll(rus, eng, lang);

        CALL_CARDS.setLayoutX(WIDTH_SIZE/14);
        CALL_CARDS.setLayoutY(HEIGHT_SIZE/5);
        CALL_CARDS.setSpacing(HEIGHT_SIZE/50);
        CALL_CARDS.setEffect(EffectShadow.getShadow());
        examPS.setStyle(EffectStyle.getStyleButtonDefault12());
        examToBe.setStyle(EffectStyle.getStyleButtonDefault12());
        word.setStyle(EffectStyle.getStyleButtonDefault12());

        invocationPane.setSpacing(WIDTH_SIZE/90);
        invocationPane.setLayoutX(WIDTH_SIZE/11);
        invocationPane.setLayoutY(HEIGHT_SIZE/6.2);

        final String released = "-fx-color: #e6e6e6; -fx-font: bold italic 10pt Georgia; -fx-focus-color: GREEN;";
        final String pressed = "-fx-color: #fdd2a9; -fx-font: bold italic 10pt Georgia; -fx-focus-color: GREEN;";
        backward.setStyle(EffectStyle.getStyleButtonDefault10());
        backward.setEffect(EffectShadow.getShadow());
        backward.setPrefSize(WIDTH_SIZE/14, HEIGHT_SIZE/25);
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
    }
    private void remove(){
        ROOT_PANE.getChildren().remove(next);
        ROOT_PANE.getChildren().remove(translation);
        ROOT_PANE.getChildren().remove(CALL_CARDS);
    }
}