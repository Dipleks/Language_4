package exercises;

import interfaceProgram.ILink;
import interfaceProgram.IRoot;
import javafx.scene.control.Label;
import patterns.Callable;
import patterns.Invocation;

public class OutputAppToBe implements Callable, IRoot, ILink
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
                invocation1.getInvocation("Задание 1", new Label[43], 0, app_tobe_1, new FormToBe()),
                invocation2.getInvocation("Задание 2", new Label[58], 43, app_tobe_2, new FormToBe()),
                invocation3.getInvocation("Задание 3", new Label[36], 101, app_tobe_3, new FormToBe()),
                invocation4.getInvocation("Задание 4", new Label[51], 137, app_tobe_4, new FormToBe())
        );

        SettingsList settingsExercisesList = new SettingsList();
        settingsExercisesList.settings();
    }
}
