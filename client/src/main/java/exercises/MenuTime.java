package exercises;

import interfaceProgram.EffectShadow;
import interfaceProgram.EffectStyle;
import interfaceProgram.RootWindows;
import interfaceProgram.SeparatorExercises;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import menu.ClearDisplay;

public class MenuTime implements RootWindows
{
    private Button menuPresentSimple = new Button("Present Simple");
    private Button appPS = new Button("Утверждения");
    private Button negPS = new Button("Отрицания");
    private Button quesPS = new Button("Вопросы");
    private Button menuFormToBe = new Button("Form 'to be'");
    private Button appToBe= new Button("Утверждения");
    private Button negToBe = new Button("Отрицания");
    private Button quesToBe = new Button("Вопросы");
    private VBox group = new VBox();
    private SeparatorExercises separator = new SeparatorExercises();
    private Rectangle rectangle = new Rectangle();
    private VBox contMenuPS = new VBox();
    private VBox contMenuToBe = new VBox();

    void getMenuTime(){

        separator.getSeparator();

        // Меню Present Simple
        menuPresentSimple.setEffect(EffectShadow.getShadow());
        menuPresentSimple.setPrefSize(WIDTH_SIZE/8, HEIGHT_SIZE/13);
        menuPresentSimple.setStyle(EffectStyle.getStyleMouseReleased());
        menuPresentSimple.setOnMousePressed(event ->
                menuPresentSimple.setStyle(EffectStyle.getStyleOnMousePressed())
        );
        menuPresentSimple.setOnMouseReleased(event ->
                menuPresentSimple.setStyle(EffectStyle.getStyleMouseReleased()));
        menuPresentSimple.setOnAction(event -> {
            clear();
            getStylePS();
            rectangle.setX(WIDTH_SIZE/5.1);
            rectangle.setY(HEIGHT_SIZE/4.2);
            contMenuPS.getChildren().addAll(appPS, negPS, quesPS);
            addRectangle();
        });

        // Меню TO BE
        menuFormToBe.setEffect(EffectShadow.getShadow());
        menuFormToBe.setStyle(EffectStyle.getStyleMouseReleased());
        menuFormToBe.setPrefSize(WIDTH_SIZE/8, HEIGHT_SIZE/13);
        menuFormToBe.setOnMousePressed(event ->
                menuFormToBe.setStyle(EffectStyle.getStyleOnMousePressed())
        );
        menuFormToBe.setOnMouseReleased(event ->
                menuFormToBe.setStyle(EffectStyle.getStyleMouseReleased()));
        menuFormToBe.setOnAction(event -> {
            clear();
            getStyleToBe();
            rectangle.setX(WIDTH_SIZE/5.1);
            rectangle.setY(HEIGHT_SIZE/4.2);
            contMenuPS.getChildren().addAll(appToBe, negToBe, quesToBe);
            addRectangle();
        });

        // Объединение меню в одну панель
        group.setLayoutX(WIDTH_SIZE/15);
        group.setLayoutY(HEIGHT_SIZE/5);
        group.setSpacing(20);
        group.setAlignment(Pos.CENTER_LEFT);
        group.setMaxHeight(HEIGHT_SIZE/7);
//        group.setStyle("-fx-border-color: RED");
        group.getChildren().addAll(menuPresentSimple, menuFormToBe);

        ROOT_PANE.getChildren().addAll(group);
    }

    private void clear(){
        ClearDisplay.clearMethodExercises();
        ROOT_PANE.getChildren().addAll(group);
    }

    // Добавляем прямоугольник
    private void addRectangle(){
        rectangle.setWidth(WIDTH_SIZE/8);
        rectangle.setHeight(HEIGHT_SIZE/5);
        rectangle.setArcHeight(20);
        rectangle.setArcWidth(20);
        rectangle.setStroke(Color.BLACK);
        rectangle.setEffect(EffectShadow.getShadow());
        rectangle.setFill(Color.rgb(169, 169, 169, 0.7));

        contMenuPS.setSpacing(10);
        contMenuPS.setAlignment(Pos.CENTER);
        contMenuPS.setLayoutX(WIDTH_SIZE/4.8);
        contMenuPS.setLayoutY(HEIGHT_SIZE/4);

        contMenuToBe.setSpacing(10);
        contMenuToBe.setAlignment(Pos.CENTER);
        contMenuToBe.setLayoutX(WIDTH_SIZE/4.8);
        contMenuToBe.setLayoutY(HEIGHT_SIZE/3);

        ROOT_PANE.getChildren().addAll(rectangle, contMenuPS,
                contMenuToBe);
    }

    private void getStylePS(){
        appPS.setStyle(EffectStyle.getStyleButton());
        appPS.setPrefSize(WIDTH_SIZE/10, HEIGHT_SIZE/20);
        negPS.setStyle(EffectStyle.getStyleButton());
        negPS.setPrefSize(WIDTH_SIZE/10, HEIGHT_SIZE/20);
        quesPS.setStyle(EffectStyle.getStyleButton());
        quesPS.setPrefSize(WIDTH_SIZE/10, HEIGHT_SIZE/20);
    }
    private void getStyleToBe(){
        appToBe.setStyle(EffectStyle.getStyleButton());
        appToBe.setPrefSize(WIDTH_SIZE/10, HEIGHT_SIZE/20);
        negToBe.setStyle(EffectStyle.getStyleButton());
        negToBe.setPrefSize(WIDTH_SIZE/10, HEIGHT_SIZE/20);
        quesToBe.setStyle(EffectStyle.getStyleButton());
        quesToBe.setPrefSize(WIDTH_SIZE/10, HEIGHT_SIZE/20);
    }
}
