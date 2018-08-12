package interfaceProgram;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Separator;
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
}
