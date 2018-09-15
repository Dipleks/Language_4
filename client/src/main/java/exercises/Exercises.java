package exercises;

import interfaceProgram.IRoot;
import interfaceProgram.SeparatorExercises;

public class Exercises implements IRoot {

    private PaneWithForm paneWithForm = new PaneWithForm();

    public void getExercises(){
        getExercise();
    }

    private void getExercise() {
        SeparatorExercises separator = new SeparatorExercises();
        separator.getSeparator();
        paneWithForm.getPaneForm();
    }
}