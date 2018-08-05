package interfaceProgram;

import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public interface IRootExercises extends RootWindows
{
    VBox suggestionPane = new VBox();
    ScrollPane exercisesPane = new ScrollPane();

    VBox invocationPane = new VBox();
    HBox languagePane = new HBox();

    ToggleButton rus = new ToggleButton("Русский");
    ToggleButton eng = new ToggleButton("English");
    ToggleGroup group = new ToggleGroup();
    HBox paneLanguage = new HBox();
    VBox paneLanguageV = new VBox();
    Label lang = new Label("Выберите язык");
    Label title = new Label();

    Button backward = new Button("Назад");
}
