package patterns;

import interfaceProgram.EffectFont;
import interfaceProgram.IRoot;
import javafx.geometry.Pos;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.paint.Color;

// SuggestionList - список предложений
class SuggestionList implements IRoot
{
    // list - ячейки для предложений
    // value - номер предложения с которого нужно начать добавление в list
    void getList(Label[] list, int value, Assignable assignable)
    {
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
                    if (list[finalI].getText().equals(assignable.getAssignment(value, finalI, "RU"))){
                        list[finalI].setText(assignable.getAssignment(value, finalI, "EN"));
                        list[finalI].setTextFill(Color.LIMEGREEN);
                    } else if (list[finalI].getText().equals(assignable.getAssignment(value, finalI, "EN"))){
                        list[finalI].setText(assignable.getAssignment(value, finalI, "RU"));
                        list[finalI].setTextFill(Color.BLACK);

                    }
                });
            }
            if (eng.isSelected()){
                list[i].setText(assignable.getAssignment(value, i, "EN"));
                list[i].setOnMouseClicked(event -> {
                    if (list[finalI].getText().equals(assignable.getAssignment(value, finalI, "EN"))){
                        list[finalI].setText(assignable.getAssignment(value, finalI, "RU"));
                        list[finalI].setTextFill(Color.LIMEGREEN);
                    } else if (list[finalI].getText().equals(assignable.getAssignment(value, finalI, "RU"))){
                        list[finalI].setText(assignable.getAssignment(value, finalI, "EN"));
                        list[finalI].setTextFill(Color.BLACK);

                    }
                });
            }

            ContextMenu subContext = new ContextMenu();
            Menu selected = new Menu("В избранное");
            MenuItem ps = new MenuItem("Present Simple");
            MenuItem tobe = new MenuItem("Form \"to be\"");
            MenuItem words = new MenuItem("Слова");

            ps.setDisable(true);
            tobe.setDisable(true);
            words.setDisable(true);

            ps.setOnAction(event -> {
                System.out.println(list[finalI].getText());
            });

            tobe.setOnAction(event -> {
                System.out.println(list[finalI].getText());
            });
            words.setOnAction(event -> {
                System.out.println(list[finalI].getText());
            });

            selected.getItems().addAll(ps, tobe, words);
            subContext.getItems().addAll(selected);

            list[i].setOnContextMenuRequested(event -> {
                subContext.show(list[finalI], event.getScreenX(), event.getScreenY());
            });

        }
        suggestionPane.getChildren().addAll(list);
    }
}
