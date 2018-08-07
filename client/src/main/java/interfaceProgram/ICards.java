package interfaceProgram;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;

public interface ICards extends RootWindows
{
    ToggleGroup group = new ToggleGroup();
    ToggleButton rus = new ToggleButton("Русский"); //вывод карточек на русском языке
    ToggleButton eng = new ToggleButton("English"); // вывод карточек на английском языке

    Button next = new Button("Далее"); //следюущее предложение без перевода и проверки
    Button translation = new Button("Перевод"); //перевод

    Label title = new Label(); //рандомный текст

    Label yes = new Label("Верно");
    Label no = new Label("Не верно");
    Label yesOutput = new Label();
    Label noOutput = new Label();
}
