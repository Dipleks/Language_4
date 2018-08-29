package exams;

import interfaceProgram.EffectFont;
import interfaceProgram.IRoot;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import patterns.Assignable;

/**
 * Класс со списком предложений.
 * Имеет значение: <b>list</b>
 * @author Загороднев Д.М.
 */
class SuggestionList implements IRoot
{
    /** Фиксированный список заданий */
    private Label[] list = new Label[100];

    /**
     * Функция получения заданий.
     * @param value номер задания с которого начинается запись в список.
     * @param assignable вызываемая форма для контрольной.
     */
    void getList(int value, Assignable assignable)
    {
        for (int i = 0; i < 100; i++)
        {
            int finalI = i;
            list[i] = new Label();
            list[i].setWrapText(true);
            list[i].setFont(EffectFont.getFontText());
            list[i].setAlignment(Pos.CENTER);
            list[i].setTextFill(Color.BLACK);
            list[i].setText(assignable.getAssignment(value, i, "RU"));

            list[i].setOnMouseClicked(event ->
            {
                if (examText.getText().equalsIgnoreCase(assignable.getAssignment(value, finalI, "EN")))
                {
                    list[finalI].setText(assignable.getAssignment(value, finalI, "EN"));
                    list[finalI].setTextFill(Color.LIMEGREEN);
                    textLanguage.setTextFill(Color.LIMEGREEN);

                } else if (examText.getText().equals("")) {

                    getPane("Введите текст!");

                } else {

                    list[finalI].setText(assignable.getAssignment(value, finalI, "RU"));
                    list[finalI].setTextFill(Color.RED);
                    textLanguage.setTextFill(Color.RED);
                }

                textLanguage.setText(examText.getText());
                examText.clear();
            });
        }
        suggestionPane.getChildren().addAll(list);
    }
}