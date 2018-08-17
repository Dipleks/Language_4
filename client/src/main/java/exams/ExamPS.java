package exams;

import interfaceProgram.IRoot;
import patterns.Callable;

public class ExamPS implements Callable, IRoot
{
    @Override
    public void getList() {
        Invocation invocation1 = new Invocation();
        Invocation invocation2 = new Invocation();
        Invocation invocation3 = new Invocation();
        Invocation invocation4 = new Invocation();
        Invocation invocation5 = new Invocation();
        Invocation invocation6 = new Invocation();
        Invocation invocation7 = new Invocation();


        invocationPane.setSpacing(WIDTH_SIZE/65);
        invocationPane.setLayoutX(WIDTH_SIZE/12);
        invocationPane.setLayoutY(HEIGHT_SIZE/6);
        invocationPane.getChildren().addAll(
                invocation1.getInvocation("Часть 1", 0, new FormPS()),
                invocation2.getInvocation("Часть 2", 100, new FormPS()),
                invocation3.getInvocation("Часть 3", 200, new FormPS()),
                invocation4.getInvocation("Часть 4", 300, new FormPS()),
                invocation5.getInvocation("Часть 5", 400, new FormPS()),
                invocation6.getInvocation("Часть 6", 500, new FormPS()),
                invocation7.getInvocation("Часть 7", 600, new FormPS())
        );
        SettingsExamsList settingsExamsList = new SettingsExamsList();
        settingsExamsList.settings();
    }
}
