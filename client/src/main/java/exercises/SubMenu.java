package exercises;

import interfaceProgram.EffectStyle;
import interfaceProgram.IRoot;
import javafx.scene.control.Button;

class SubMenu implements IRoot
{
    private final String released = "-fx-color: #e6e6e6; -fx-font: bold italic 10pt Georgia; -fx-focus-color: GREEN;";
    private final String pressed = "-fx-color: #fdd2a9; -fx-font: bold italic 10pt Georgia; -fx-focus-color: GREEN;";
    Button getSubMenu(String title, CallableExercises list){
        Button subMenu = new Button(title);
        subMenu.setStyle(EffectStyle.getStyleButtonDefault10());
        subMenu.setPrefSize(WIDTH_SIZE/10, HEIGHT_SIZE/22);
        subMenu.setOnMouseEntered(event -> subMenu.setStyle(pressed));
        subMenu.setOnMouseExited(event -> subMenu.setStyle(released));
        subMenu.setOnAction(event -> {
            list.getListExercises();
            paneSubMenu.getChildren().clear();
            paneForm.getChildren().clear();
            ROOT_PANE.getChildren().remove(rectangle);
            ROOT_PANE.getChildren().remove(paneSubMenu);
        });
        return subMenu;
    }
}
