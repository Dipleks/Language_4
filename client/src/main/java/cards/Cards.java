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

        CallCard callCard = new CallCard();
        callCard.getCallCards();

        RangeWords rangeWords = new RangeWords();
        rangeWords.removeRange();
        rangeWords.getRange();

    }
}
