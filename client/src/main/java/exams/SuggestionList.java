package exams;

import interfaceProgram.EffectFont;
import interfaceProgram.IRoot;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import patterns.Assignable;
import patterns.Exception;

// SuggestionList - список предложений
class SuggestionList implements IRoot
{
    private Label[] list = new Label[100];
    // value - номер предложения с которого нужно начать добавление в list
    void getList(int value, Assignable assignable){
        for (int i = 0; i < 100; i++) {
            list[i] = new Label();
            list[i].setWrapText(true);
            list[i].setFont(EffectFont.getFontText());
            list[i].setAlignment(Pos.CENTER);
            list[i].setTextFill(Color.BLACK);
            int finalI = i;

            list[i].setText(assignable.getAssignment(value, i, "RU"));
            list[i].setOnMouseClicked(event -> {
                if (examText.getText().equalsIgnoreCase(assignable.getAssignment(value, finalI, "EN"))){
                    list[finalI].setText(assignable.getAssignment(value, finalI, "EN"));
                    list[finalI].setTextFill(Color.LIMEGREEN);
                    textLanguage.setTextFill(Color.LIMEGREEN);
                } else if (examText.getText().equals("")){
                    Exception exception = new Exception();
                    exception.exception("Введите текст!");
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
