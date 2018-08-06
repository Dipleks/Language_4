package exams;

import interfaceProgram.EffectShadow;
import interfaceProgram.EffectStyle;
import interfaceProgram.IRoot;
import javafx.scene.control.Button;

// Invocation - вызов. Класс создает новую кнопку котороая помещается в
// массив кнопок который добавляется в окно для вызова соответствующего
// списка предложений
class Invocation implements IRoot
{
    private Button call = new Button();
    private SuggestionList suggestionList = new SuggestionList();
    private final String released = "-fx-color: #e6e6e6; -fx-font: bold italic 10pt Georgia; -fx-focus-color: GREEN;";
    private final String pressed = "-fx-color: #cccccc; -fx-font: bold italic 10pt Georgia; -fx-focus-color: GREEN;";
    private final String pressedCol = "-fx-color: #fdd2a9; -fx-font: bold italic 10pt Georgia; -fx-focus-color: GREEN;";

    // name - имя кнопки
    Button getInvocation(String name, int value, Assignable assignable){
        call.setText(name);
        call.setStyle(released);
        call.setPrefSize(WIDTH_SIZE/10, HEIGHT_SIZE/20);
        call.setEffect(EffectShadow.getShadow());
        call.setOnMouseEntered(event -> call.setStyle(pressedCol));
        call.setOnMouseExited(event -> call.setStyle(released));
        call.setOnMousePressed(event -> call.setStyle(pressed));
        call.setOnMouseReleased(event -> call.setStyle(released));
        call.setOnAction(event -> {
            suggestionPane.getChildren().clear();
            languagePane.getChildren().clear();
            suggestionList.getList(value, assignable);
            ROOT_PANE.getChildren().remove(title);
            title.setText(call.getText());
            title.setStyle(EffectStyle.getStyleLabel());
            title.setLayoutX(WIDTH_SIZE/1.5);
            title.setLayoutY(HEIGHT_SIZE/7);
            title.setEffect(EffectShadow.getShadow());

            ROOT_PANE.getChildren().addAll(title);
        });
        return call;
    }
}
