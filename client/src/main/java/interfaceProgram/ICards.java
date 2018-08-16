package interfaceProgram;

import cards.HistoryTable;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import java.util.HashMap;
import java.util.HashSet;

public interface ICards extends RootWindows
{
    ToggleGroup group = new ToggleGroup();
    ToggleButton rus = new ToggleButton("Русский"); //вывод карточек на русском языке
    ToggleButton eng = new ToggleButton("English"); // вывод карточек на английском языке

    Button next = new Button("Далее"); //следюущее предложение без перевода и проверки
    Button translation = new Button("Перевод"); //перевод

    Label title = new Label(); //рандомный текст

    VBox CALL_CARDS = new VBox();
    Button examPS = new Button("Present Simple");
    Button examToBe = new Button("Form \"to be\"");
    Button word = new Button("Слова");

    StackPane tablePane = new StackPane();

    Label titleRange = new Label("Задать ограничение для слов");
    TextField MIN = new TextField();
    TextField MAX = new TextField();
    Button range = new Button("Выбрать диапазон"); // выбрать диапазон значений
}
