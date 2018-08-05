package exerciseT;

import interfaceProgram.EffectFont;
import interfaceProgram.EffectShadow;
import interfaceProgram.RootExercises;
import interfaceProgram.RootWindows;
import javafx.geometry.Pos;
import javafx.scene.control.Label;

import java.util.Map;

class Text implements RootWindows
{
    private RootExercises rootExercises = new RootExercises();

    void addText(Label[] text, int next, Map<Integer, String> exercisesRu, Map<Integer, String> exercisesEn){

        rootExercises.getExercisesText().getChildren().clear();

        for (int j = 0; j < text.length; j++) {
            text[j] = new Label(exercisesRu.get(j + next));
            text[j].setWrapText(true);
            text[j].setFont(EffectFont.getFontText());
            text[j].setAlignment(Pos.TOP_CENTER);
            int finalJ = j;
            text[j].setOnMouseClicked(event -> {
                if (text[finalJ].getText().equals(exercisesRu.get(finalJ))){
                    text[finalJ].setText(exercisesEn.get(finalJ));
                    System.out.println(text[finalJ].getText());
                } else if (text[finalJ].getText().equals(exercisesEn.get(finalJ))){
                    text[finalJ].setText(exercisesRu.get(finalJ));
                    System.out.println(text[finalJ].getText());
                }
            });

//            System.out.println(text[j].getText());
        }

        ROOT_PANE.getChildren().addAll(rootExercises.getMenuAppNegQues());

        rootExercises.getExercisesText().setPrefWidth(WIDTH_SIZE/2.05);
        rootExercises.getExercisesText().setAlignment(Pos.CENTER);
        rootExercises.getExercisesText().setSpacing(HEIGHT_SIZE/80);
        rootExercises.getExercisesText().setStyle("-fx-border-color: RED");
        rootExercises.getExercisesText().getChildren().addAll(text);

        rootExercises.getTextPane().setLayoutX(WIDTH_SIZE/3.5);
        rootExercises.getTextPane().setLayoutY(HEIGHT_SIZE/5);
//            rootExercises.getTextPane().setStyle("-fx-border-color: RED");
        rootExercises.getTextPane().setPrefSize(WIDTH_SIZE/2, HEIGHT_SIZE/1.5);
        rootExercises.getTextPane().setEffect(EffectShadow.getShadow());
        rootExercises.getTextPane().setContent(rootExercises.getExercisesText());

        ROOT_PANE.getChildren().addAll(rootExercises.getTextPane());
    }
}
