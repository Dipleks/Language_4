package interfaceProgram;

public class SeparatorExercises implements RootWindows
{
    private RootExercises rootExercises = new RootExercises();

    public void getSeparator(){
        rootExercises.getSeparatorExercises().setLayoutX(WIDTH_SIZE/4);
        rootExercises.getSeparatorExercises().setLayoutY(HEIGHT_SIZE/7);
        rootExercises.getSeparatorExercises().setPrefHeight(HEIGHT_SIZE/1.4);
        ROOT_PANE.getChildren().addAll(rootExercises.getSeparatorExercises());
    }
}
