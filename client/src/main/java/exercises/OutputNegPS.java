package exercises;

import interfaceProgram.IRoot;
import javafx.scene.control.Label;

public class OutputNegPS implements CallableExercises, IRoot
{
    @Override
    public void getListExercises() {
        Invocation invocation1 = new Invocation();
        Invocation invocation2 = new Invocation();
        Invocation invocation3 = new Invocation();

        invocationPane.setSpacing(WIDTH_SIZE/65);
        invocationPane.setLayoutX(WIDTH_SIZE/12);
        invocationPane.setLayoutY(HEIGHT_SIZE/6);
        invocationPane.getChildren().addAll(
                invocation1.getInvocation("Задание 1", new Label[41], 193, new FormPS()),
                invocation2.getInvocation("Задание 2", new Label[22], 234, new FormPS()),
                invocation3.getInvocation("Задание 3", new Label[22], 290, new FormPS())
        );
        SettingsList settingsExercisesList = new SettingsList();
        settingsExercisesList.settings();
    }
}
