package test;

import javafx.scene.control.Label;
import test.ExercisesLabel;

public class Add
{
    private ExercisesLabel[] exercisesLabel = new ExercisesLabel[4];

    // вызвать его кнопкой Утверждения
    public void getText(){
            exercisesLabel[0] = new ExercisesLabel(new Label[40], 0);
            exercisesLabel[1] = new ExercisesLabel(new Label[40], 40);
            exercisesLabel[2] = new ExercisesLabel(new Label[40], 80);
            exercisesLabel[3] = new ExercisesLabel(new Label[40], 120);
    };
}
