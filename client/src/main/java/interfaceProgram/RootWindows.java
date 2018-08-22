package interfaceProgram;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
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

}
