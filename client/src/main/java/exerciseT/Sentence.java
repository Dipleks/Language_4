package exerciseT;

import interfaceProgram.EffectShadow;
import interfaceProgram.RootExercises;
import interfaceProgram.RootWindows;
import javafx.scene.control.Button;

class Sentence implements RootWindows
{
    private RootExercises root = new RootExercises();
    private Button control = new Button();

    Button getText(int i){

        control.setText("Задание " + i);
        control.setStyle(root.getStylePS());
        control.setPrefSize(WIDTH_SIZE/10, HEIGHT_SIZE/20);
        control.setEffect(EffectShadow.getShadow());
        control.setOnMousePressed(event -> control.setStyle("-fx-color: #cccccc; -fx-font: bold italic 10pt Georgia;"));
        control.setOnMouseReleased(event -> control.setStyle("-fx-color: #e6e6e6; -fx-font: bold italic 10pt Georgia;"));
        return control;
    }
}
