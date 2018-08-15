package interfaceProgram;

import db.UpdateTable;
import javafx.application.Application;
import javafx.stage.Stage;
import menu.MenuBarEngRus;

public class Language_4 extends Application implements RootWindows
{
    private MenuBarEngRus menuBarEngRus = new MenuBarEngRus();
    private Rule rule = new Rule();

    @Override
    public void init() {
        UpdateTable updateTable = new UpdateTable();
        updateTable.deleteUpdateCard();
        updateTable.deleteUpdateExamPS();
        updateTable.deleteUpdateExamToBe();
    }

    @Override
    public void start(Stage primaryStage) {

        menuBarEngRus.getMenu();
        ClockDisplay.clock();
        ROOT_PANE.getChildren().addAll(rule.getCollectionRules());

        WINDOW.setTitle("Learn English");
        WINDOW.setMaximized(true); //устанавливаем размер окна на весь экран
        WINDOW.setScene(SCENE_ROOT);
        WINDOW.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
