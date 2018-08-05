package exercises;

import interfaceProgram.EffectFont;
import interfaceProgram.EffectShadow;
import interfaceProgram.EffectStyle;
import interfaceProgram.IRootExercises;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

// Invocation - вызов. Класс создает новую кнопку котороая помещается в
// массив кнопок который добавляется в окно для вызова соответствующего
// списка предложений
class Invocation implements IRootExercises
{
    private Button call = new Button();
    private SuggestionList suggestionList = new SuggestionList();

    // name - имя кнопки
    Button getInvocation(String name, Label[] list, int value, Assignable assignable){
        rus.setStyle("-fx-color: #fdd2a9; -fx-font: bold italic 10pt Georgia;");
        rus.setPrefSize(WIDTH_SIZE/14, HEIGHT_SIZE/25);
        rus.setEffect(EffectShadow.getShadow());
        rus.setToggleGroup(group);
        rus.setSelected(true);

        eng.setStyle("-fx-color: #e6e6e6; -fx-font: bold italic 10pt Georgia;");
        eng.setPrefSize(WIDTH_SIZE/14, HEIGHT_SIZE/25);
        eng.setEffect(EffectShadow.getShadow());
        eng.setToggleGroup(group);

        call.setText(name);
        call.setStyle("-fx-color: #e6e6e6; -fx-font: bold italic 10pt Georgia;");
        call.setPrefSize(WIDTH_SIZE/10, HEIGHT_SIZE/20);
        call.setEffect(EffectShadow.getShadow());
        call.setOnMousePressed(event -> call.setStyle("-fx-color: #cccccc; -fx-font: bold italic 10pt Georgia;"));
        call.setOnMouseReleased(event -> call.setStyle("-fx-color: #e6e6e6; -fx-font: bold italic 10pt Georgia;"));
        call.setOnAction(event -> {
            suggestionPane.getChildren().clear();
            languagePane.getChildren().clear();
            suggestionList.getList(list, value, assignable);
            ROOT_PANE.getChildren().remove(title);
            title.setText("Test " + call.getText());
            title.setStyle(EffectStyle.getStyleLabel());
            title.setLayoutX(WIDTH_SIZE/2.1);
            title.setLayoutY(HEIGHT_SIZE/7);
            title.setEffect(EffectShadow.getShadow());

            rus.setOnAction(e -> {
                eng.setStyle("-fx-color: #e6e6e6; -fx-font: bold italic 10pt Georgia;");
                rus.setStyle("-fx-color: #fdd2a9; -fx-font: bold italic 10pt Georgia;");
                suggestionPane.getChildren().clear();
                languagePane.getChildren().clear();
                suggestionList.getList(list, value, assignable);
            });
            eng.setOnAction(e -> {
                rus.setStyle("-fx-color: #e6e6e6; -fx-font: bold italic 10pt Georgia;");
                eng.setStyle("-fx-color: #fdd2a9; -fx-font: bold italic 10pt Georgia;");
                suggestionPane.getChildren().clear();
                languagePane.getChildren().clear();
                suggestionList.getList(list, value, assignable);
            });
            ROOT_PANE.getChildren().addAll(title);
        });
        return call;
    }
}
