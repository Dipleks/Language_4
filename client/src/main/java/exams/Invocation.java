package exams;

import interfaceProgram.EffectShadow;
import interfaceProgram.EffectStyle;
import interfaceProgram.ILink;
import interfaceProgram.IRoot;
import javafx.scene.control.Button;
import patterns.Assignable;

/**
 * Класс вызова задания на контрольную работу.
 * Имеет значения: <b>call</b>, <b>suggestionList</b>, <b>released</b>, <b>pressed</b>, <b>pressedCol</b>
 * @author Загороднев Д.М.
 */
class Invocation implements IRoot, ILink
{
    /** Кнопка вызова заданий */
    private Button call = new Button();

    /** Список заданий */
    private SuggestionList suggestionList = new SuggestionList();

    /** Стиль кнопки в отпущеном состоянии */
    private final String released = "-fx-color: #e6e6e6; -fx-font: bold italic 10pt Georgia; -fx-focus-color: GREEN;";

    /** Стиль кнопки в нажатом состоянии */
    private final String pressed = "-fx-color: #cccccc; -fx-font: bold italic 10pt Georgia; -fx-focus-color: GREEN;";

    /** Стиль кнопки при наведении */
    private final String pressedCol = "-fx-color: #fdd2a9; -fx-font: bold italic 10pt Georgia; -fx-focus-color: GREEN;";

    /**
     * Функция вызова заданий.
     * @param name имя кнопки;
     * @param value номер вызываего задания;
     * @param assignable вызываемая форма для контрольной;
     * @return возвращает кнопку навигации контрольных работ.
     */
    Button getInvocation(String name, int value, Assignable assignable)
    {
        call.setText(name);
        call.setStyle(released);
        call.setPrefSize(WIDTH_SIZE/10, HEIGHT_SIZE/20);
        call.setEffect(EffectShadow.getShadow());

        call.setOnMouseEntered(event -> call.setStyle(pressedCol));
        call.setOnMouseExited(event -> call.setStyle(released));
        call.setOnMousePressed(event -> call.setStyle(pressed));
        call.setOnMouseReleased(event -> call.setStyle(released));

        call.setOnAction(event ->
        {
            suggestionPane.getChildren().clear();
            languagePane.getChildren().clear();
            suggestionList.getList(value, assignable);
            ROOT_PANE.getChildren().remove(title);
            title.setText(call.getText());
            title.setStyle(EffectStyle.getStyleLabel14());
            title.setLayoutX(WIDTH_SIZE/1.5);
            title.setLayoutY(HEIGHT_SIZE/7);
            title.setEffect(EffectShadow.getShadow());

            ROOT_PANE.getChildren().addAll(title);
        });
        return call;
    }
}
