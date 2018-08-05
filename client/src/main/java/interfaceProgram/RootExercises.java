package interfaceProgram;

import javafx.geometry.Orientation;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;

public class RootExercises
{
    private VBox groupSplit = new VBox();
    private VBox contMenuPS = new VBox();
    private VBox contMenuToBe = new VBox();
    private Separator SeparatorExercises = new Separator(Orientation.VERTICAL);

    private Button menuPresentSimple = new Button("Present Simple");
    private Button appPS = new Button("Утверждения");
    private Button negPS = new Button("Отрицания");
    private Button quesPS = new Button("Вопросы");

    private Button menuFormToBe = new Button("Form 'to be'");
    private Button appToBe= new Button("Утверждения");
    private Button negToBe = new Button("Отрицания");
    private Button quesToBe = new Button("Вопросы");

    private String styleMouseReleased = "-fx-color: #e6e6e6; -fx-font: bold italic 12pt Georgia; " +
            "-fx-border-color: linear-gradient(#e6e6e6, #cccccc);";
    private String styleOnMousePressed = "-fx-color: #cccccc; -fx-font: bold italic 12pt Georgia; " +
            "-fx-border-color: linear-gradient(#cccccc, #b3b3b3);";
    private String stylePS = "-fx-color: #e6e6e6; -fx-font: bold italic 10pt Georgia; " +
            "-fx-background-color: linear-gradient(#e6e6e6, #cccccc);";

    private Rectangle rectangle = new Rectangle();

    private VBox menuAppNegQues = new VBox();
    private VBox exercisesText = new VBox();
    private ScrollPane textPane = new ScrollPane();
    private StackPane rootPane = new StackPane();
    private Button backward = new Button("Назад");
    private Button[] callExercisesAppPS = new Button[7];
    private Button[] callExercisesNegPS = new Button[4];
    private Button[] callExercisesQuesPS = new Button[6];
    private Button[] callExercisesAppToBe = new Button[4];
    private Button[] callExercisesNegToBe = new Button[1];
    private Button[] callExercisesQuesToBe = new Button[4];
    private Label nameTextExercises = new Label();

    private ToggleGroup group = new ToggleGroup();
    private ToggleButton engClick = new ToggleButton("English");
    private ToggleButton rusClick = new ToggleButton("Русский");
    private HBox menuRusEng = new HBox();
    private Label language = new Label("Выберите язык");

    public StackPane getRootPane() {
        return rootPane;
    }

    public Label getLanguage() {
        return language;
    }

    public ToggleGroup getGroup() {
        return group;
    }

    public ToggleButton getRusClick() {
        return rusClick;
    }

    public ToggleButton getEngClick() {
        return engClick;
    }

    public HBox getMenuRusEng() {
        return menuRusEng;
    }

    public Label getNameTextExercises() {
        return nameTextExercises;
    }

    public VBox getMenuAppNegQues() {
        return menuAppNegQues;
    }

    public VBox getExercisesText() {
        return exercisesText;
    }

    public ScrollPane getTextPane() {
        return textPane;
    }

    public Button[] getCallExercisesAppPS() {
        return callExercisesAppPS;
    }

    public Button[] getCallExercisesNegPS() {
        return callExercisesNegPS;
    }

    public Button[] getCallExercisesQuesPS() {
        return callExercisesQuesPS;
    }

    public Button[] getCallExercisesAppToBe() {
        return callExercisesAppToBe;
    }

    public Button[] getCallExercisesNegToBe() {
        return callExercisesNegToBe;
    }

    public Button[] getCallExercisesQuesToBe() {
        return callExercisesQuesToBe;
    }

    public Button getBackward() {
        return backward;
    }

    public VBox getContMenuPS() {
        return contMenuPS;
    }

    public VBox getContMenuToBe() {
        return contMenuToBe;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public VBox getGroupSplit() {
        return groupSplit;
    }

    public Separator getSeparatorExercises() {
        return SeparatorExercises;
    }

    public Button getMenuPresentSimple() {
        return menuPresentSimple;
    }

    public Button getMenuFormToBe() {
        return menuFormToBe;
    }

    public Button getAppPS() {
        return appPS;
    }

    public Button getNegPS() {
        return negPS;
    }

    public Button getQuesPS() {
        return quesPS;
    }

    public Button getAppToBe() {
        return appToBe;
    }

    public Button getNegToBe() {
        return negToBe;
    }

    public Button getQuesToBe() {
        return quesToBe;
    }

    public String getStyleMouseReleased() {
        return styleMouseReleased;
    }

    public String getStyleOnMousePressed() {
        return styleOnMousePressed;
    }

    public String getStylePS() {
        return stylePS;
    }
}
