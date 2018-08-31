package exercises;

import interfaceProgram.ILink;
import interfaceProgram.IRoot;
import javafx.scene.control.Label;
import patterns.Callable;
import patterns.Invocation;

public class OutputNegPS implements Callable, IRoot, ILink
{
    @Override
    public void getList() {
        Invocation invocation1 = new Invocation();
        Invocation invocation2 = new Invocation();
        Invocation invocation3 = new Invocation();

        invocationPane.setSpacing(HEIGHT_SIZE/80);
        invocationPane.setLayoutX(WIDTH_SIZE/11);
        invocationPane.setLayoutY(HEIGHT_SIZE/6);
        invocationPane.getChildren().addAll(
                invocation1.getInvocation("Задание 1", new Label[41], 193, neg_ps_1, new FormPS()),
                invocation2.getInvocation("Задание 2", new Label[22], 234, neg_ps_2, new FormPS()),
                invocation3.getInvocation("Задание 3", new Label[22], 290, neg_ps_3, new FormPS())
        );
        SettingsList settingsExercisesList = new SettingsList();
        settingsExercisesList.settings();
    }
}
