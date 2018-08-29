package exams;

import interfaceProgram.IRoot;
import interfaceProgram.SeparatorExercises;

/**
 * Класс вызывающий меню навигации по контрольным.
 * Имеет свойство: <b>paneWithForm</b>
 * @author Загороднев Д.М.
 */
public class Exams implements IRoot
{

    /** Панель вызова контрольных */
    private PaneWithForm paneWithForm = new PaneWithForm();

    /**
     * Функция вызывающая метод вызова Контрольных.
     */
    public void getExams()
    {
        getExam();
    }

    /**
     * Функия получения меню вызова Контрольных.
     */
    private void getExam()
    {
        SeparatorExercises separator = new SeparatorExercises();
        separator.getSeparator();
        paneWithForm.getPaneForm();
    }
}