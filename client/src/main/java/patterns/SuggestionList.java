package patterns;

import contMenu.ContMenu;
import interfaceProgram.EffectFont;
import interfaceProgram.IRoot;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;

// SuggestionList - список предложений
class SuggestionList implements IRoot {

    private ContMenu contMenu = new ContMenu();

    // list - ячейки для предложений
    // value - номер предложения с которого нужно начать добавление в list
    void getList(Label[] list, int value, Assignable assignable) {
        for (int i = 0; i < list.length; i++) {
            list[i] = new Label();
            list[i].setWrapText(true);
            list[i].setFont(EffectFont.getFontText());
            list[i].setAlignment(Pos.TOP_CENTER);
            list[i].setTextFill(Color.BLACK);
            int finalI = i;

            if (rus.isSelected()){
                list[i].setText(assignable.getAssignment(value, i, "RU"));
                list[i].setOnMouseClicked(event -> {
                    if (event.getButton() == MouseButton.PRIMARY){
                        if (list[finalI].getText().equals(assignable.getAssignment(value, finalI, "RU"))){
                            list[finalI].setText(assignable.getAssignment(value, finalI, "EN"));
                            list[finalI].setTextFill(Color.LIMEGREEN);
                        } else if (list[finalI].getText().equals(assignable.getAssignment(value, finalI, "EN"))){
                            list[finalI].setText(assignable.getAssignment(value, finalI, "RU"));
                            list[finalI].setTextFill(Color.BLACK);
                        }
                    }
                });
            }
            if (eng.isSelected()){
                list[i].setText(assignable.getAssignment(value, i, "EN"));
                list[i].setOnMouseClicked(event -> {
                    if (event.getButton() == MouseButton.PRIMARY){
                        if (list[finalI].getText().equals(assignable.getAssignment(value, finalI, "EN"))){
                            list[finalI].setText(assignable.getAssignment(value, finalI, "RU"));
                            list[finalI].setTextFill(Color.LIMEGREEN);
                        } else if (list[finalI].getText().equals(assignable.getAssignment(value, finalI, "RU"))){
                            list[finalI].setText(assignable.getAssignment(value, finalI, "EN"));
                            list[finalI].setTextFill(Color.BLACK);
                        }
                    }
                });
            }

            // Контекстное меню:
            contMenu.contMenu(list[i], value + i);

        }
        suggestionPane.getChildren().addAll(list);
    }
}