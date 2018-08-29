package interfaceProgram;

import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;

public interface IRoot extends RootWindows
{
    VBox suggestionPane = new VBox();
    ScrollPane exercisesPane = new ScrollPane();

    HBox languagePane = new HBox();
    HBox paneLanguage = new HBox();
    VBox paneLanguageV = new VBox();
    Label lang = new Label("Выберите язык");

    VBox paneForm = new VBox(); //панель с кнопками Present Simple, Form To Be
    VBox paneSubMenu = new VBox(); //панель с кнопками подменю
    Rectangle rectangle = new Rectangle(); //прямогугольная область для подмению
    TextField examText = new TextField(); //текстовое поле для проверки контрольных
    Label textLanguage = new Label(); //текстовое поле в контрольных показывающее последний перевод

    Label INFORMATION = new Label("ИНФОРМАЦИЯ");
    Label CLICK_TEXT = new Label("1. Нажмите на предложение для перевода");
    Label SELECTED_LANGUAGE = new Label("2. Выберите язык задания");
    Label LOOC_YOUTUBE = new Label("3. Посмотреть урок на YOUTUBE:");
}