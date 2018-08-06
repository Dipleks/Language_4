package interfaceProgram;

import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;

public interface IRoot extends RootWindows
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

    VBox paneForm = new VBox(); //панель с кнопками Present Simple, Form To Be
    VBox paneSubMenu = new VBox(); //панель с кнопками подменю
    Rectangle rectangle = new Rectangle(); //прямогугольная область для подмению
    TextField examText = new TextField(); //текстовое поле для проверки контрольных
    Label textLanguage = new Label(); //текстовое поле в контрольных показывающее последний перевод
}
