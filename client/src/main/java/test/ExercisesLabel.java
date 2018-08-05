package test;

import interfaceProgram.RootExercises2;
import interfaceProgram.RootWindows;
import javafx.scene.control.Label;
import test.IExercises;

public class ExercisesLabel implements RootWindows
{
    private RootExercises2 root = new RootExercises2();

    private Label[] text;
    private int START;

    public ExercisesLabel(Label[] text, int START) {
        this.text = text;
        this.START = START;
    }

    public void getEnRu(String ENRU, IExercises iExercises){
        if (ENRU.equals("EN")) {
                getColumnLab(text, START, "EN", iExercises);
        } else if (ENRU.equals("RU")){
                getColumnLab(text, START, "RU", iExercises);

        }
    }

    private void getColumnLab(Label[] list, int START, String lang, IExercises iExercises){
        for (int i = 0; i < list.length; i++) {
            list[i] = new Label();
            list[i].setText(iExercises.methodExercise(i, START, lang));

//            int finalI = i;
            list[i].setOnMouseClicked(event -> {
//                if (list[finalI].getText().equals(iExercises.methodExercise(finalI, START_CLOSE, set))){
//                    list[finalI].setText(iExercises.methodExercise(finalI, START_CLOSE, get));
//                    list[finalI].setTextFill(Color.GREEN);
//                } else {
//                    list[finalI].setText(iExercises.methodExercise(finalI, START_CLOSE, set));
//                    list[finalI].setTextFill(Color.BLACK);
//                }
            });
            root.getPaneExercises().getChildren().addAll(list);
        }
    }
}
