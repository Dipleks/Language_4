package interfaceProgram;

import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public interface ICards extends RootWindows
{
    Button next = new Button("Далее"); //следюущее предложение без перевода и проверки
    Button translation = new Button("Перевод"); //перевод

    VBox CALL_CARDS = new VBox();
    Button examPS = new Button("Present Simple");
    Button examToBe = new Button("Form \"to be\"");
    Button word = new Button("Слова");

    StackPane tablePane = new StackPane();
    Label COUNTER = new Label();
}