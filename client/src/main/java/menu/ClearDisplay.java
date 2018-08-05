package menu;

import interfaceProgram.ClockDisplay;
import interfaceProgram.RootWindows;

public class ClearDisplay implements RootWindows
{
    // Полная зачистка главного окна:
    public static void clearMethod() {
        ROOT_PANE.getChildren().clear();
        ClockDisplay.clock();
        MenuBarEngRus menuBarEngRus = new MenuBarEngRus();
        menuBarEngRus.getMenu();
    }

    // Очистка заданий
    public static void clearMethodExercises() {
        ROOT_PANE.getChildren().clear();
        ClockDisplay.clock();
        MenuBarEngRus menuBarEngRus = new MenuBarEngRus();
        menuBarEngRus.getMenu();
    }


}
