package exercises;

import interfaceProgram.EffectShadow;
import interfaceProgram.EffectStyle;
import interfaceProgram.IRootExercises;
import interfaceProgram.SeparatorExercises;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.HBox;
import menu.ClearDisplay;
import menu.MenuBarEngRus;

public class Exercises implements IRootExercises
{
    public void getExercises(){
        getExercise();
    }

    private void getExercise() {

        SeparatorExercises separator = new SeparatorExercises();
        separator.getSeparator();

        getExerciseAppPS();

    }

    // Вызов Утверждений PS
    private void getExerciseAppPS(){
        Invocation invocation1 = new Invocation();
        Invocation invocation2 = new Invocation();
        Invocation invocation3 = new Invocation();
        Invocation invocation4 = new Invocation();
        Invocation invocation5 = new Invocation();
        Invocation invocation6 = new Invocation();
        Invocation invocation7 = new Invocation();


        invocationPane.setSpacing(WIDTH_SIZE/65);
        invocationPane.setLayoutX(WIDTH_SIZE/12);
        invocationPane.setLayoutY(HEIGHT_SIZE/6);
        invocationPane.getChildren().addAll(
                invocation1.getInvocation("Exercises 1", new Label[31], 0, new FormPS()),
                invocation2.getInvocation("Exercises 2", new Label[27], 31, new FormPS()),
                invocation3.getInvocation("Exercises 3", new Label[24], 58, new FormPS()),
                invocation4.getInvocation("Exercises 4", new Label[27], 82, new FormPS()),
                invocation5.getInvocation("Exercises 5", new Label[20], 109, new FormPS()),
                invocation6.getInvocation("Exercises 6", new Label[30], 129, new FormPS()),
                invocation7.getInvocation("Exercises 7", new Label[34], 159, new FormPS())
        );

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

        lang.setStyle(EffectStyle.getStyleLabel());
        paneLanguageV.setLayoutX(WIDTH_SIZE/18);
        paneLanguageV.setLayoutY(HEIGHT_SIZE/1.3);
        paneLanguageV.setAlignment(Pos.CENTER);
        paneLanguage.setSpacing(HEIGHT_SIZE/60);
        paneLanguageV.setSpacing(WIDTH_SIZE/90);

        paneLanguage.getChildren().addAll(rus, eng);
        paneLanguageV.getChildren().addAll(lang, paneLanguage);

        backward.setStyle(EffectStyle.getStyleButton());
        backward.setEffect(EffectShadow.getShadow());
        backward.setPrefSize(WIDTH_SIZE/12, HEIGHT_SIZE/20);
        backward.setLayoutX(WIDTH_SIZE/3.7);
        backward.setLayoutY(HEIGHT_SIZE/8);

        ROOT_PANE.getChildren().addAll(exercisesPane, invocationPane, paneLanguageV, backward);
    }
}
