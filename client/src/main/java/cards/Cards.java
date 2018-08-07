package cards;

import interfaceProgram.ICards;
import interfaceProgram.SeparatorExercises;

public class Cards implements ICards
{
    public void getCards(){
        getCard();
    }

    private void getCard(){
        SeparatorExercises separatorExercises = new SeparatorExercises();
        separatorExercises.getSeparator();

        Change change = new Change();
        change.getNext();
        change.getTranslation();
        rus.setLayoutX(50);
        rus.setLayoutY(100);
        eng.setLayoutY(100);
        eng.setLayoutX(100);
        rus.setToggleGroup(group);
        eng.setToggleGroup(group);
        rus.setSelected(true);
        ROOT_PANE.getChildren().addAll(next, translation, rus, eng);
    }
}
