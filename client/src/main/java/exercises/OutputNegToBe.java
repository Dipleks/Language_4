package exercises;

import interfaceProgram.ILink;
import interfaceProgram.IRoot;
import javafx.scene.control.Label;
import patterns.Callable;
import patterns.Invocation;

public class OutputNegToBe implements Callable, IRoot, ILink {

    @Override
    public void getList() {
        Invocation invocation1 = new Invocation();

        invocationPane.setSpacing(HEIGHT_SIZE/80);
        invocationPane.setLayoutX(WIDTH_SIZE/11);
        invocationPane.setLayoutY(HEIGHT_SIZE/6);
        invocationPane.getChildren().addAll(
                invocation1.getInvocation("Задание 1", new Label[40], 188, neg_tobe_1, new FormToBe())
        );
        SettingsList settingsExercisesList = new SettingsList();
        settingsExercisesList.settings();
    }
}
