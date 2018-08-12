package exams;

import interfaceProgram.IRoot;
import interfaceProgram.SeparatorExercises;

public class Exams implements IRoot
{
    private PaneWithForm paneWithForm = new PaneWithForm();

    public void getExams(){
        getExam();
    }

    private void getExam() {

        SeparatorExercises separator = new SeparatorExercises();
        separator.getSeparator();

        paneWithForm.getPaneForm();

    }
}
