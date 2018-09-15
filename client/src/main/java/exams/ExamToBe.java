package exams;

import interfaceProgram.ILink;
import interfaceProgram.IRoot;
import patterns.Callable;

/**
 * Класс вызова Контрольных To Be.
 * @author Загороднев Д.М.
 */
public class ExamToBe implements Callable, IRoot, ILink {

    /**
     * Функция получения меню навигации по Контрольным To Be
     */
    @Override
    public void getList() {
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
                invocation1.getInvocation("Часть 1", 0, tests_tobe_1, new FormToBe()),
                invocation2.getInvocation("Часть 2", 100, tests_tobe_2, new FormToBe()),
                invocation3.getInvocation("Часть 3", 200, tests_tobe_3, new FormToBe()),
                invocation4.getInvocation("Часть 4", 300, tests_tobe_4, new FormToBe()),
                invocation5.getInvocation("Часть 5", 400, tests_tobe_5, new FormToBe()),
                invocation6.getInvocation("Часть 6", 500, tests_tobe_6, new FormToBe()),
                invocation7.getInvocation("Часть 7", 600, tests_tobe_7, new FormToBe()),
                invocation8.getInvocation("Часть 8", 700, tests_tobe_8, new FormToBe())
        );
        SettingsExamsList settingsExamsList = new SettingsExamsList();
        settingsExamsList.settings();
    }
}