package interfaceProgram;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Screen;
import javafx.stage.Stage;

public interface RootWindows
{
    Stage WINDOW = new Stage();
    Screen SCREEN = Screen.getPrimary();
    double WIDTH_SIZE = SCREEN.getBounds().getWidth();
    double HEIGHT_SIZE = SCREEN.getBounds().getHeight();
    Group ROOT_PANE = new Group();
    Scene SCENE_ROOT = new Scene(ROOT_PANE, WIDTH_SIZE*0.95, HEIGHT_SIZE*0.95);

    ToggleGroup group = new ToggleGroup();
    ToggleButton rus = new ToggleButton("Русский"); //вывод карточек на русском языке
    ToggleButton eng = new ToggleButton("English"); // вывод карточек на английском языке

    Label title = new Label(); //рандомный текст
    VBox invocationPane = new VBox();
    Button backward = new Button("Назад");

    default void getPane(String header){
        Stage stage = new Stage();
        StackPane stackPane = new StackPane();
        Scene scene = new Scene(stackPane, WIDTH_SIZE/4, HEIGHT_SIZE/4);
        Label label = new Label(header);
        label.setEffect(EffectShadow.getShadow());
        label.setStyle(EffectStyle.getStyleLabel());
        stackPane.getChildren().add(label);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.setTitle("Предупреждение");
        stage.show();
    }
}
