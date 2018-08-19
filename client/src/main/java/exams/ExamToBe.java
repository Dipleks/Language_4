package exams;

import interfaceProgram.IRoot;
import patterns.Callable;

public class ExamToBe implements Callable, IRoot
{
    @Override
    public void getList() {
        Invocation invocation1 = new Invocation();
        Invocation invocation2 = new Invocation();
        Invocation invocation3 = new Invocation();
        Invocation invocation4 = new Invocation();

        invocationPane.setSpacing(WIDTH_SIZE/65);
        invocationPane.setLayoutX(WIDTH_SIZE/12);
        invocationPane.setLayoutY(HEIGHT_SIZE/6);
        invocationPane.getChildren().addAll(
                invocation1.getInvocation("Часть 1", 0, new FormToBe()),
                invocation2.getInvocation("Часть 2", 100, new FormToBe()),
                invocation3.getInvocation("Часть 3", 200, new FormToBe()),
                invocation4.getInvocation("Часть 4", 300, new FormToBe())
        );

        SettingsExamsList settingsExamsList = new SettingsExamsList();
        settingsExamsList.settings();
    }
}
