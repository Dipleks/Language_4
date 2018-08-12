package exercises;

import interfaceProgram.EffectShadow;
import interfaceProgram.EffectStyle;
import interfaceProgram.IRoot;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

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
    Button getInvocation(String name, Label[] list, int value, Assignable assignable){
        rus.setStyle(pressedCol);
        rus.setPrefSize(WIDTH_SIZE/14, HEIGHT_SIZE/25);
        rus.setEffect(EffectShadow.getShadow());
        rus.setToggleGroup(group);
        rus.setSelected(true);

        eng.setStyle(released);
        eng.setPrefSize(WIDTH_SIZE/14, HEIGHT_SIZE/25);
        eng.setEffect(EffectShadow.getShadow());
        eng.setToggleGroup(group);

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
            suggestionList.getList(list, value, assignable);
            ROOT_PANE.getChildren().remove(title);
            title.setText(call.getText());
            title.setStyle(EffectStyle.getStyleLabel());
            title.setLayoutX(WIDTH_SIZE/1.5);
            title.setLayoutY(HEIGHT_SIZE/7);
            title.setEffect(EffectShadow.getShadow());

            rus.setOnAction(e -> {
                eng.setStyle(released);
                rus.setStyle(pressedCol);
                suggestionPane.getChildren().clear();
                languagePane.getChildren().clear();
                suggestionList.getList(list, value, assignable);
            });
            eng.setOnAction(e -> {
                rus.setStyle(released);
                eng.setStyle(pressedCol);
                suggestionPane.getChildren().clear();
                languagePane.getChildren().clear();
                suggestionList.getList(list, value, assignable);
            });
            ROOT_PANE.getChildren().addAll(title);
            if (!rus.isSelected() && !eng.isSelected()) {
                Exception exceptionExercises = new Exception();
                exceptionExercises.exception("Выберите язык!");
            }
        });
        return call;
    }
}
