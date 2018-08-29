package exams;

import interfaceProgram.EffectShadow;
import interfaceProgram.EffectStyle;
import interfaceProgram.IRoot;
import javafx.geometry.Pos;
import menu.ClearDisplay;
import menu.MenuBarEngRus;

/**
 * Класс с настройками листа контрольных.
 * Имеет значения: <b>released</b>, <b>pressed</b>.
 * @author Загороднев Д.М.
 */
class SettingsExamsList implements IRoot
{
    /** Стиль кнопки в отпущеном состоянии */
    private final String released = "-fx-color: #e6e6e6; -fx-font: bold italic 10pt Georgia; -fx-focus-color: GREEN;";

    /** Стиль кнопки в нажатом состоянии */
    private final String pressed = "-fx-color: #fdd2a9; -fx-font: bold italic 10pt Georgia; -fx-focus-color: GREEN;";

    /**
     * Функция настроек.
     */
    void settings()
    {
        suggestionPane.setPrefWidth(WIDTH_SIZE/2.05);
        suggestionPane.setAlignment(Pos.CENTER);
        suggestionPane.setSpacing(HEIGHT_SIZE/80);

        exercisesPane.setLayoutX(WIDTH_SIZE/3.5);
        exercisesPane.setLayoutY(HEIGHT_SIZE/5);
        exercisesPane.setPrefSize(WIDTH_SIZE/2, HEIGHT_SIZE/1.5);
        exercisesPane.setEffect(EffectShadow.getShadow());
        exercisesPane.setContent(suggestionPane);

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
            Exams addExerciseExam = new Exams();
            addExerciseExam.getExams();
        });
        ROOT_PANE.getChildren().addAll(exercisesPane, invocationPane, paneLanguageV, backward);
    }
}
