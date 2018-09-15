package interfaceProgram;

import javafx.geometry.Orientation;
import javafx.scene.control.Separator;

public class SeparatorExercises implements RootWindows {

    private Separator separatorExercises = new Separator(Orientation.VERTICAL);

    public void getSeparator(){
        separatorExercises.setLayoutX(WIDTH_SIZE/4);
        separatorExercises.setLayoutY(HEIGHT_SIZE/7);
        separatorExercises.setPrefHeight(HEIGHT_SIZE/1.4);
        ROOT_PANE.getChildren().addAll(separatorExercises);
    }
}
