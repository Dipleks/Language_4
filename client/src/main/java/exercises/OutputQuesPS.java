package exercises;

import interfaceProgram.IRoot;
import javafx.scene.control.Label;

public class OutputQuesPS implements CallableExercises, IRoot
{
    @Override
    public void getListExercises() {
        Invocation invocation1 = new Invocation();
        Invocation invocation2 = new Invocation();
        Invocation invocation3 = new Invocation();
        Invocation invocation4 = new Invocation();
        Invocation invocation5 = new Invocation();
        Invocation invocation6 = new Invocation();

        invocationPane.setSpacing(WIDTH_SIZE/65);
        invocationPane.setLayoutX(WIDTH_SIZE/12);
        invocationPane.setLayoutY(HEIGHT_SIZE/6);
        invocationPane.getChildren().addAll(
                invocation1.getInvocation("Задание 1", new Label[35], 312, new FormPS()),
                invocation2.getInvocation("Задание 2", new Label[29], 347, new FormPS()),
                invocation3.getInvocation("Задание 4", new Label[19], 376, new FormPS()),
                invocation4.getInvocation("Задание 5", new Label[38], 395, new FormPS()),
                invocation5.getInvocation("Задание 6", new Label[54], 433, new FormPS()),
                invocation6.getInvocation("Задание 7", new Label[29], 487, new FormPS())
        );
        SettingsList settingsExercisesList = new SettingsList();
        settingsExercisesList.settings();
    }
}
