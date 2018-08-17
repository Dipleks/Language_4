package words;

import exercises.Callable;
import interfaceProgram.IRoot;
import javafx.scene.control.Label;

public class OutputWords implements Callable, IRoot
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
                invocation1.getInvocation("1 - 130", new Label[130], 0, new ListWords()),
                invocation2.getInvocation("131 - 260", new Label[130], 130, new ListWords()),
                invocation3.getInvocation("261 - 390", new Label[130], 260, new ListWords()),
                invocation4.getInvocation("391 - 520", new Label[130], 390, new ListWords()),
                invocation5.getInvocation("521 - 650", new Label[130], 520, new ListWords()),
                invocation6.getInvocation("651 - 780", new Label[130], 650, new ListWords()),
                invocation7.getInvocation("781 - 910", new Label[130], 780, new ListWords()),
                invocation8.getInvocation("911 - 1039", new Label[129], 910, new ListWords())
        );
        SettingsList settingsList = new SettingsList();
        settingsList.settings();
    }
}
