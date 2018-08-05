package exerciseT;

import exercises.ExerciseText;
import interfaceProgram.*;
import javafx.scene.control.Label;
import menu.ClearDisplay;

class Submenu extends Text
{
    private RootExercises rootExercises = new RootExercises();
    private SeparatorExercises sep = new SeparatorExercises();
    private ExerciseText exerciseText = new ExerciseText();

    void getAppPS(){
        Sentence sentence1 = new Sentence();
        Sentence sentence2 = new Sentence();

        sentence1.getText(1).setOnAction(e -> {
//            clear();
            ClearDisplay.clearMethodExercises();
            sep.getSeparator();
            addText(new Label[5], 0, exerciseText.getPsFileRu(), exerciseText.getPsFileEn());
            ROOT_PANE.getChildren().addAll(rootExercises.getMenuAppNegQues());

        });
        sentence2.getText(2).setOnAction(e -> {
//            clear();
            ClearDisplay.clearMethodExercises();
            sep.getSeparator();
            addText(new Label[5], 6, exerciseText.getPsFileRu(), exerciseText.getPsFileEn());
            ROOT_PANE.getChildren().addAll(rootExercises.getMenuAppNegQues());
        });

        rootExercises.getMenuAppNegQues().setSpacing(20);
        rootExercises.getMenuAppNegQues().setLayoutX(WIDTH_SIZE/12);
        rootExercises.getMenuAppNegQues().setLayoutY(HEIGHT_SIZE/6);
        rootExercises.getMenuAppNegQues().getChildren().addAll(sentence1.getText(1), sentence2.getText(2));

        ROOT_PANE.getChildren().addAll(rootExercises.getMenuAppNegQues());

    }


}
