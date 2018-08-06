package menu;

import interfaceProgram.ClockDisplay;
import interfaceProgram.IRoot;
import interfaceProgram.RootWindows;

public class ClearDisplay implements RootWindows, IRoot
{
    // Полная зачистка главного окна:
    public static void clearMethod() {
        suggestionPane.getChildren().clear();
        invocationPane.getChildren().clear();
        languagePane.getChildren().clear();
        paneLanguage.getChildren().clear();
        paneLanguageV.getChildren().clear();
        paneForm.getChildren().clear();
        paneSubMenu.getChildren().clear();
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
