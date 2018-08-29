package exams;

import interfaceProgram.IRoot;
import patterns.Callable;

/**
 * Класс вызова Контрольных To Be.
 * @author Загороднев Д.М.
 */
public class ExamToBe implements Callable, IRoot
{
    /**
     * Функция получения меню навигации по Контрольным To Be
     */
    @Override
    public void getList()
    {
        Invocation invocation1 = new Invocation();
        Invocation invocation2 = new Invocation();
        Invocation invocation3 = new Invocation();
        Invocation invocation4 = new Invocation();
        Invocation invocation5 = new Invocation();
        Invocation invocation6 = new Invocation();
        Invocation invocation7 = new Invocation();
        Invocation invocation8 = new Invocation();

        invocationPane.setSpacing(WIDTH_SIZE/65);
        invocationPane.setLayoutX(WIDTH_SIZE/12);
        invocationPane.setLayoutY(HEIGHT_SIZE/6);
        invocationPane.getChildren().addAll(
                invocation1.getInvocation("Часть 1", 0, new FormToBe()),
                invocation2.getInvocation("Часть 2", 100, new FormToBe()),
                invocation3.getInvocation("Часть 3", 200, new FormToBe()),
                invocation4.getInvocation("Часть 4", 300, new FormToBe()),
                invocation5.getInvocation("Часть 5", 400, new FormToBe()),
                invocation6.getInvocation("Часть 6", 500, new FormToBe()),
                invocation7.getInvocation("Часть 7", 600, new FormToBe()),
                invocation8.getInvocation("Часть 8", 700, new FormToBe())
        );
        SettingsExamsList settingsExamsList = new SettingsExamsList();
        settingsExamsList.settings();
    }
}