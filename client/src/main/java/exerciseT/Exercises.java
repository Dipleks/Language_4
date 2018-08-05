package exerciseT;

import interfaceProgram.*;
import javafx.geometry.Pos;
import javafx.scene.paint.Color;
import menu.ClearDisplay;

public class Exercises implements RootWindows
{
    private RootExercises rootExercises = new RootExercises();
    private SeparatorExercises sep = new SeparatorExercises();

    // Получим окно с заданиями
    public void getExercises(){
        addRootPaneExercises();
    }

    private void addRootPaneExercises(){

        rootExercises.getNameTextExercises().setFont(EffectFont.getFontTitle());
        rootExercises.getNameTextExercises().setLayoutX(WIDTH_SIZE/2.5);
        rootExercises.getNameTextExercises().setLayoutY(HEIGHT_SIZE/8);

        getStyle();

        // Меню Present Simple
        rootExercises.getMenuPresentSimple().setEffect(EffectShadow.getShadow());
        rootExercises.getMenuPresentSimple().setPrefSize(WIDTH_SIZE/8, HEIGHT_SIZE/13);
        rootExercises.getMenuPresentSimple().setStyle(rootExercises.getStyleMouseReleased());
        rootExercises.getMenuPresentSimple().setOnMousePressed(event ->
                rootExercises.getMenuPresentSimple().setStyle(rootExercises.getStyleOnMousePressed())
        );
        rootExercises.getMenuPresentSimple().setOnMouseReleased(event ->
                rootExercises.getMenuPresentSimple().setStyle(rootExercises.getStyleMouseReleased()));
        rootExercises.getMenuPresentSimple().setOnAction(event -> {
            clear();

            rootExercises.getNameTextExercises().setText(rootExercises.getMenuPresentSimple().getText());

            rootExercises.getRectangle().setX(WIDTH_SIZE/5.1);
            rootExercises.getRectangle().setY(HEIGHT_SIZE/4.2);
            rootExercises.getContMenuPS().getChildren().addAll(rootExercises.getAppPS(), rootExercises.getNegPS(),
                    rootExercises.getQuesPS());
            addRectangle();
        });

        // Утверждения PS
        rootExercises.getAppPS().setOnAction(event -> {
            ClearDisplay.clearMethodExercises();
            sep.getSeparator();
//            submenu.getAppPS();
        });

        // Отрицания PS
//        exercisesResizable.addButtonsCall(rootExercises.getNegPS(), rootExercises.getCallExercisesNegPS(), "PS");

        // Вопросы PS
//        exercisesResizable.addButtonsCall(rootExercises.getQuesPS(), rootExercises.getCallExercisesQuesPS(), "PS");

        // Меню to be
        rootExercises.getMenuFormToBe().setEffect(EffectShadow.getShadow());
        rootExercises.getMenuFormToBe().setStyle(rootExercises.getStyleMouseReleased());
        rootExercises.getMenuFormToBe().setPrefSize(WIDTH_SIZE/8, HEIGHT_SIZE/13);
        rootExercises.getMenuFormToBe().setOnMousePressed(event ->
                rootExercises.getMenuFormToBe().setStyle(rootExercises.getStyleOnMousePressed())
        );
        rootExercises.getMenuFormToBe().setOnMouseReleased(event ->
                rootExercises.getMenuFormToBe().setStyle(rootExercises.getStyleMouseReleased()));
        rootExercises.getMenuFormToBe().setOnAction(event -> {
            clear();

            rootExercises.getNameTextExercises().setText(rootExercises.getMenuFormToBe().getText());

            rootExercises.getRectangle().setX(WIDTH_SIZE/5.1);
            rootExercises.getRectangle().setY(HEIGHT_SIZE/3.1);
            rootExercises.getContMenuToBe().getChildren().addAll(rootExercises.getAppToBe(), rootExercises.getNegToBe(),
                    rootExercises.getQuesToBe());
            addRectangle();
        });

        // Утверждения tobe

        // Отрицания tobe

        // Вопросы tobe

        // Разделитель
        sep.getSeparator();

        // Объединение меню в одну панель
        rootExercises.getGroupSplit().setLayoutX(WIDTH_SIZE/15);
        rootExercises.getGroupSplit().setLayoutY(HEIGHT_SIZE/5);
        rootExercises.getGroupSplit().setSpacing(20);
        rootExercises.getGroupSplit().setAlignment(Pos.CENTER_LEFT);
        rootExercises.getGroupSplit().setMaxHeight(HEIGHT_SIZE/7);
//        rootExercises.getGroupSplit().setStyle("-fx-border-color: RED");
        rootExercises.getGroupSplit().getChildren().addAll(rootExercises.getMenuPresentSimple(),
                rootExercises.getMenuFormToBe());

        ROOT_PANE.getChildren().addAll(rootExercises.getGroupSplit(), rootExercises.getSeparatorExercises());
    }
    private void getStyle(){
        rootExercises.getAppPS().setStyle(rootExercises.getStylePS());
        rootExercises.getAppPS().setPrefSize(WIDTH_SIZE/10, HEIGHT_SIZE/20);
        rootExercises.getNegPS().setStyle(rootExercises.getStylePS());
        rootExercises.getNegPS().setPrefSize(WIDTH_SIZE/10, HEIGHT_SIZE/20);
        rootExercises.getQuesPS().setStyle(rootExercises.getStylePS());
        rootExercises.getQuesPS().setPrefSize(WIDTH_SIZE/10, HEIGHT_SIZE/20);
    }

    // Добавляем прямоугольник
    private void addRectangle(){
        rootExercises.getRectangle().setWidth(WIDTH_SIZE/8);
        rootExercises.getRectangle().setHeight(HEIGHT_SIZE/5);
        rootExercises.getRectangle().setArcHeight(20);
        rootExercises.getRectangle().setArcWidth(20);
        rootExercises.getRectangle().setStroke(Color.BLACK);
        rootExercises.getRectangle().setEffect(EffectShadow.getShadow());
        rootExercises.getRectangle().setFill(Color.rgb(169, 169, 169, 0.7));

        rootExercises.getContMenuPS().setSpacing(10);
        rootExercises.getContMenuPS().setAlignment(Pos.CENTER);
        rootExercises.getContMenuPS().setLayoutX(WIDTH_SIZE/4.8);
        rootExercises.getContMenuPS().setLayoutY(HEIGHT_SIZE/4);

        rootExercises.getContMenuToBe().setSpacing(10);
        rootExercises.getContMenuToBe().setAlignment(Pos.CENTER);
        rootExercises.getContMenuToBe().setLayoutX(WIDTH_SIZE/4.8);
        rootExercises.getContMenuToBe().setLayoutY(HEIGHT_SIZE/3);

        ROOT_PANE.getChildren().addAll(rootExercises.getRectangle(), rootExercises.getContMenuPS(),
                rootExercises.getContMenuToBe());
    }

    private void clear(){
        rootExercises.getContMenuPS().getChildren().clear();
        rootExercises.getContMenuToBe().getChildren().clear();
        rootExercises.getExercisesText().getChildren().clear();
        ROOT_PANE.getChildren().removeAll(rootExercises.getRectangle(), rootExercises.getContMenuPS(),
                rootExercises.getContMenuToBe(), rootExercises.getTextPane(), rootExercises.getExercisesText());
    }

}
