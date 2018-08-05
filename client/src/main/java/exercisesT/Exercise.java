package exercisesT;

import interfaceProgram.RootWindows;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import test.ExerciseText;

public class Exercise implements RootWindows
{
    public void getExercises(){
        getExercise();
    }

    private void getExercise(){
        ExerciseText exerciseText = new ExerciseText();
        ButPane butPane = new ButPane(new Button[4], 0);
        butPane.getPane(new Label[4], exerciseText.getPsFileRu(), exerciseText.getPsFileEn());
    }
}
