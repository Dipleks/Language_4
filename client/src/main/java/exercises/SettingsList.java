package exercises;

import interfaceProgram.EffectShadow;
import interfaceProgram.EffectStyle;
import interfaceProgram.IRoot;
import javafx.geometry.Pos;
import menu.ClearDisplay;
import menu.MenuBarEngRus;

class SettingsList implements IRoot {

    private final String released = "-fx-color: #e6e6e6; -fx-font: bold italic 10pt Georgia; -fx-focus-color: GREEN;";
    private final String pressed = "-fx-color: #fdd2a9; -fx-font: bold italic 10pt Georgia; -fx-focus-color: GREEN;";

    void settings(){
        suggestionPane.setPrefWidth(WIDTH_SIZE/2.05);
        suggestionPane.setAlignment(Pos.CENTER);
        suggestionPane.setSpacing(HEIGHT_SIZE/80);

        exercisesPane.setLayoutX(WIDTH_SIZE/3.5);
        exercisesPane.setLayoutY(HEIGHT_SIZE/5);
        exercisesPane.setPrefSize(WIDTH_SIZE/2, HEIGHT_SIZE/1.5);
        exercisesPane.setEffect(EffectShadow.getShadow());
        exercisesPane.setContent(suggestionPane);

        lang.setStyle(EffectStyle.getStyleLabel14());
        lang.setEffect(EffectShadow.getShadow());
        paneLanguageV.setLayoutX(WIDTH_SIZE/18);
        paneLanguageV.setLayoutY(HEIGHT_SIZE/1.3);
        paneLanguageV.setAlignment(Pos.CENTER);
        paneLanguage.setSpacing(HEIGHT_SIZE/60);
        paneLanguageV.setSpacing(WIDTH_SIZE/90);

        paneLanguage.getChildren().addAll(rus, eng);
        paneLanguageV.getChildren().addAll(lang, paneLanguage);

        backward.setStyle(EffectStyle.getStyleButtonDefault10());
        backward.setEffect(EffectShadow.getShadow());
        backward.setPrefSize(WIDTH_SIZE/12, HEIGHT_SIZE/20);
        backward.setLayoutX(WIDTH_SIZE/3.7);
        backward.setLayoutY(HEIGHT_SIZE/8);
        backward.setOnMouseEntered(event -> backward.setStyle(pressed));
        backward.setOnMouseExited(event -> backward.setStyle(released));
        backward.setOnAction(event -> {
            ClearDisplay.clearMethod();
            MenuBarEngRus menuBarEngRus = new MenuBarEngRus();
            menuBarEngRus.getMenu();
            Exercises addExerciseExam = new Exercises();
            addExerciseExam.getExercises();
        });
        ROOT_PANE.getChildren().addAll(exercisesPane, invocationPane, paneLanguageV, backward);
    }
}