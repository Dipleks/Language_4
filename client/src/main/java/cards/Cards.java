package cards;

import interfaceProgram.ICards;
import interfaceProgram.SeparatorExercises;


/**
 * Класс вызывающий область работы с карточками.
 * @author Загороднев Д.М.
 */
public class Cards implements ICards {

    /**
     * Функция вызова метода работы с карточками.
     */
    public void getCards() {
        getCard();
    }

    /**
     * Функция вызова панели выбора карточек.
     */
    private void getCard() {
        SeparatorExercises separatorExercises = new SeparatorExercises();
        separatorExercises.getSeparator();

        CallCard callCard = new CallCard();
        callCard.getCallCards();
    }
}
