package exercises;

import interfaceProgram.ILink;
import interfaceProgram.IRoot;
import javafx.scene.control.Label;
import patterns.Callable;
import patterns.Invocation;

public class OutputAppPS implements Callable, IRoot, ILink
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
        Invocation invocation8 = new Invocation();

        invocationPane.setSpacing(WIDTH_SIZE/65);
        invocationPane.setLayoutX(WIDTH_SIZE/12);
        invocationPane.setLayoutY(HEIGHT_SIZE/6);
        invocationPane.getChildren().addAll(
                invocation1.getInvocation("Задание 1", new Label[31], 0, app_ps_1, new FormPS()),
                invocation2.getInvocation("Задание 2", new Label[27], 31, app_ps_2, new FormPS()),
                invocation3.getInvocation("Задание 3", new Label[24], 58, app_ps_3, new FormPS()),
                invocation4.getInvocation("Задание 4", new Label[27], 82, app_ps_4, new FormPS()),
                invocation5.getInvocation("Задание 5", new Label[20], 109, app_ps_5, new FormPS()),
                invocation6.getInvocation("Задание 6", new Label[30], 129, app_ps_6, new FormPS()),
                invocation7.getInvocation("Задание 7", new Label[34], 159, app_ps_7, new FormPS()),
                invocation8.getInvocation("Задание 8", new Label[34], 256, app_ps_8, new FormPS())
        );
        SettingsList settingsExercisesList = new SettingsList();
        settingsExercisesList.settings();
    }
}