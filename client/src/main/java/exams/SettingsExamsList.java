package exams;

import interfaceProgram.EffectShadow;
import interfaceProgram.EffectStyle;
import interfaceProgram.IRoot;
import javafx.geometry.Pos;
import menu.ClearDisplay;
import menu.MenuBarEngRus;

public class SettingsExamsList implements IRoot
{
    private final String released = "-fx-color: #e6e6e6; -fx-font: bold italic 10pt Georgia; -fx-focus-color: GREEN;";
    private final String pressed = "-fx-color: #fdd2a9; -fx-font: bold italic 10pt Georgia; -fx-focus-color: GREEN;";

    void settings(){
        suggestionPane.setPrefWidth(WIDTH_SIZE/2.05);
        suggestionPane.setAlignment(Pos.CENTER);
        suggestionPane.setSpacing(HEIGHT_SIZE/80);
//        suggestionPane.setStyle("-fx-border-color: RED");

        exercisesPane.setLayoutX(WIDTH_SIZE/3.5);
        exercisesPane.setLayoutY(HEIGHT_SIZE/5);
//        exercisesPane.setStyle("-fx-border-color: RED");
        exercisesPane.setPrefSize(WIDTH_SIZE/2, HEIGHT_SIZE/1.5);
        exercisesPane.setEffect(EffectShadow.getShadow());
        exercisesPane.setContent(suggestionPane);

        backward.setStyle(EffectStyle.getStyleButton());
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
            Exams addExerciseExam = new Exams();
            addExerciseExam.getExams();
        });

        ROOT_PANE.getChildren().addAll(exercisesPane, invocationPane, paneLanguageV, backward);
    }
}
