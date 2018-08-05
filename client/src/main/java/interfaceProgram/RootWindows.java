package interfaceProgram;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Screen;
import javafx.stage.Stage;

public interface RootWindows
{
    Stage WINDOW = new Stage();
    Screen SCREEN = Screen.getPrimary();
    double WIDTH_SIZE = SCREEN.getBounds().getWidth();
    double HEIGHT_SIZE = SCREEN.getBounds().getHeight();
    ScrollPane SCROLL_PANE = new ScrollPane();
    Group ROOT_PANE = new Group();
    Scene SCENE_ROOT = new Scene(ROOT_PANE, WIDTH_SIZE*0.95, HEIGHT_SIZE*0.95);

    ScrollPane PRESENT_SIMPLE = new ScrollPane();
    ScrollPane TO_BE = new ScrollPane();
    ScrollPane MY_WORDS = new ScrollPane();
    ScrollPane EXAM_PS = new ScrollPane();
    ScrollPane EXAM_TO_BE = new ScrollPane();
    ScrollPane TEXT_EASY = new ScrollPane();
    ScrollPane TEXT_AVERAGE = new ScrollPane();
    ScrollPane TEXT_DIFFICULT = new ScrollPane();
    ScrollPane SETTINGS = new ScrollPane();
    ScrollPane ABOUT = new ScrollPane();
}
