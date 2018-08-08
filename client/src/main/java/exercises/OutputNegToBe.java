package exercises;

import interfaceProgram.IRoot;
import javafx.scene.control.Label;

public class OutputNegToBe implements CallableExercises, IRoot
{
    @Override
    public void getListExercises() {
        Invocation invocation1 = new Invocation();

        invocationPane.setSpacing(WIDTH_SIZE/65);
        invocationPane.setLayoutX(WIDTH_SIZE/12);
        invocationPane.setLayoutY(HEIGHT_SIZE/6);
        invocationPane.getChildren().addAll(
                invocation1.getInvocation("Задание 1", new Label[40], 188, new FormToBe())
        );
        SettingsList settingsExercisesList = new SettingsList();
        settingsExercisesList.settings();
    }
}
