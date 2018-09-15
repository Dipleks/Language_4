package words;

import interfaceProgram.IRoot;
import javafx.scene.control.Label;
import patterns.Callable;
import patterns.Invocation;

public class OutputWords implements Callable, IRoot {

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
        Invocation invocation9 = new Invocation();
        Invocation invocation10 = new Invocation();

        invocationPane.setSpacing(HEIGHT_SIZE/80);
        invocationPane.setLayoutX(WIDTH_SIZE/11);
        invocationPane.setLayoutY(HEIGHT_SIZE/6);
        invocationPane.getChildren().addAll(
                invocation1.getInvocation("1 - 100", new Label[100], 0, null, new ListWords()),
                invocation2.getInvocation("101 - 200", new Label[100], 100, null, new ListWords()),
                invocation3.getInvocation("201 - 300", new Label[100], 200, null, new ListWords()),
                invocation4.getInvocation("301 - 400", new Label[100], 300, null, new ListWords()),
                invocation5.getInvocation("401 - 500", new Label[100], 400, null, new ListWords()),
                invocation6.getInvocation("501 - 600", new Label[100], 500, null, new ListWords()),
                invocation7.getInvocation("601 - 700", new Label[100], 600, null, new ListWords()),
                invocation8.getInvocation("701 - 800", new Label[100], 700, null, new ListWords()),
                invocation9.getInvocation("801 - 900", new Label[100], 800, null, new ListWords()),
                invocation10.getInvocation("901 - 1000", new Label[100], 900, null, new ListWords())
        );
        SettingsList settingsList = new SettingsList();
        settingsList.settings();
    }
}