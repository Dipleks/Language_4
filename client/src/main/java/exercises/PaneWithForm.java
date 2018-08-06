package exercises;

import interfaceProgram.EffectShadow;
import interfaceProgram.IRoot;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

class PaneWithForm implements IRoot
{
    private Button ps = new Button("Present Simple");
    private Button tobe = new Button("Form to be");
    private final String released = "-fx-color: #e6e6e6; -fx-font: bold italic 12pt Georgia; -fx-focus-color: GREEN;";
    private final String pressed = "-fx-color: #fdd2a9; -fx-font: bold italic 12pt Georgia; -fx-focus-color: GREEN;";

    protected VBox getPaneForm(){
//        ROOT_PANE.getChildren().add(paneSubMenu);
        ps.setPrefSize(WIDTH_SIZE/8, HEIGHT_SIZE/18);
        ps.setStyle(released);
        ps.setEffect(EffectShadow.getShadow());
        ps.setOnMouseEntered(event -> ps.setStyle(pressed));
        ps.setOnMouseExited(event -> ps.setStyle(released));
        ps.setOnAction(event -> {
            ps.setStyle(pressed);
            tobe.setStyle(released);
            paneSubMenu.getChildren().clear();
            ROOT_PANE.getChildren().remove(rectangle);
            ROOT_PANE.getChildren().remove(paneSubMenu);

            SubMenu subMenuApp = new SubMenu();
            SubMenu subMenuNeg = new SubMenu();
            SubMenu subMenuQues = new SubMenu();

            addRectangle(4.65, 4.48);

            paneSubMenu.setLayoutX(WIDTH_SIZE/4.4);
            paneSubMenu.setLayoutY(HEIGHT_SIZE/4.2);
            paneSubMenu.setSpacing(HEIGHT_SIZE/60);
            paneSubMenu.getChildren().addAll(
                    subMenuApp.getSubMenu("Утверждения", new AppPS()),
                    subMenuNeg.getSubMenu("Отрицания", new NegPS()),
                    subMenuQues.getSubMenu("Вопросы", new QuesPS()));
        });
        tobe.setPrefSize(WIDTH_SIZE/8, HEIGHT_SIZE/18);
        tobe.setStyle(released);
        tobe.setEffect(EffectShadow.getShadow());
        tobe.setOnMouseEntered(event -> tobe.setStyle(pressed));
        tobe.setOnMouseExited(event -> tobe.setStyle(released));
        tobe.setOnAction(event -> {
            tobe.setStyle(pressed);
            ps.setStyle(released);
            paneSubMenu.getChildren().clear();
            ROOT_PANE.getChildren().remove(rectangle);
            ROOT_PANE.getChildren().remove(paneSubMenu);

            addRectangle(4.65, 3.35);

            SubMenu subMenuApp = new SubMenu();
            SubMenu subMenuNeg = new SubMenu();
            SubMenu subMenuQues = new SubMenu();

            paneSubMenu.setLayoutX(WIDTH_SIZE/4.4);
            paneSubMenu.setLayoutY(HEIGHT_SIZE/3.2);
            paneSubMenu.setSpacing(HEIGHT_SIZE/60);
            paneSubMenu.getChildren().addAll(
                    subMenuApp.getSubMenu("Утверждения", new AppToBe()),
                    subMenuNeg.getSubMenu("Отрицания", new NegToBe()),
                    subMenuQues.getSubMenu("Вопросы", new QuesToBe())
            );
        });

        paneForm.setLayoutX(WIDTH_SIZE/12);
        paneForm.setLayoutY(HEIGHT_SIZE/5);
        paneForm.setSpacing(HEIGHT_SIZE/25);
        paneForm.getChildren().addAll(ps, tobe);
        ROOT_PANE.getChildren().add(paneForm);
        return paneForm;
    }

    // Добавляем прямоугольник
    private void addRectangle(double x, double y){
        rectangle.setWidth(WIDTH_SIZE/8);
        rectangle.setHeight(HEIGHT_SIZE/5);
        rectangle.setArcHeight(20);
        rectangle.setArcWidth(20);
        rectangle.setStroke(Color.BLACK);
        rectangle.setEffect(EffectShadow.getShadow());
        rectangle.setFill(Color.rgb(169, 169, 169, 0.7));
        rectangle.setLayoutX(WIDTH_SIZE/x);
        rectangle.setLayoutY(HEIGHT_SIZE/y);

        ROOT_PANE.getChildren().addAll(rectangle, paneSubMenu);
    }
}