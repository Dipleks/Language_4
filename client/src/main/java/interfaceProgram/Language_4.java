package interfaceProgram;

import interfaceProgram.ClockDisplay;
import interfaceProgram.RootWindows;
import javafx.application.Application;
import javafx.stage.Stage;
import menu.MenuBarEngRus;

public class Language_4 extends Application implements RootWindows
{
    private MenuBarEngRus menuBarEngRus = new MenuBarEngRus();

    @Override
    public void start(Stage primaryStage) {

        menuBarEngRus.getMenu();
        ClockDisplay.clock();
        ROOT_PANE.getChildren().addAll();

        WINDOW.setTitle("language_4");
        WINDOW.setMaximized(true); //устанавливаем размер окна на весь экран
        WINDOW.setScene(SCENE_ROOT);
        WINDOW.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
