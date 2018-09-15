package exercises;

import interfaceProgram.ILink;
import interfaceProgram.IRoot;
import javafx.scene.control.Label;
import patterns.Callable;
import patterns.Invocation;

public class OutputQuesPS implements Callable, IRoot, ILink {

    @Override
    public void getList() {
        Invocation invocation1 = new Invocation();
        Invocation invocation2 = new Invocation();
        Invocation invocation3 = new Invocation();
        Invocation invocation4 = new Invocation();
        Invocation invocation5 = new Invocation();
        Invocation invocation6 = new Invocation();

        invocationPane.setSpacing(HEIGHT_SIZE/80);
        invocationPane.setLayoutX(WIDTH_SIZE/11);
        invocationPane.setLayoutY(HEIGHT_SIZE/6);
        invocationPane.getChildren().addAll(
                invocation1.getInvocation("Задание 1", new Label[35], 312, ques_ps_1, new FormPS()),
                invocation2.getInvocation("Задание 2", new Label[29], 347, ques_ps_2, new FormPS()),
                invocation3.getInvocation("Задание 3", new Label[19], 376, ques_ps_3, new FormPS()),
                invocation4.getInvocation("Задание 4", new Label[38], 395, ques_ps_4, new FormPS()),
                invocation5.getInvocation("Задание 5", new Label[54], 433, ques_ps_5, new FormPS()),
                invocation6.getInvocation("Задание 6", new Label[29], 487, ques_ps_6, new FormPS())
        );
        SettingsList settingsExercisesList = new SettingsList();
        settingsExercisesList.settings();
    }
}
