package exercisesT;

import interfaceProgram.EffectShadow;
import interfaceProgram.EffectStyle;
import interfaceProgram.RootExercises2;
import interfaceProgram.RootWindows;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.util.Map;

public class ButPane implements RootWindows
{
    private Button[] exercisesBut;
    private int next;

    public ButPane(Button[] exercisesBut, int next) {
        this.exercisesBut = exercisesBut;
        this.next = next;
    }

    private Button rus = new Button("Русский");
    private Button eng = new Button("English");
    private Button backward = new Button("Назад");

    private VBox paneBut = new VBox();
    private HBox paneRuEn = new HBox();
    private ScrollPane scrollPaneExercises = new ScrollPane();
    private RootExercises2 root = new RootExercises2();

    public void getPane(Label[] text, Map<Integer, String> textRu, Map<Integer, String> textEn){
        getPaneB(text, textRu, textEn);
    }

    private void getPaneB(Label[] text, Map<Integer, String> textRu, Map<Integer, String> textEn){

        translation(text, textRu, textEn);

        for (int i = 0; i < exercisesBut.length; i++) {
            exercisesBut[i] = new Button("Задание " +(i+1));
            exercisesBut[i].setStyle(EffectStyle.getStyleButton());
            exercisesBut[i].setPrefSize(WIDTH_SIZE/10, HEIGHT_SIZE/20);
            exercisesBut[i].setEffect(EffectShadow.getShadow());
            int finalI = i;
            exercisesBut[i].setOnMousePressed(event -> exercisesBut[finalI].setStyle("-fx-color: #cccccc; -fx-font: bold italic 10pt Georgia;"));
            exercisesBut[i].setOnMouseReleased(event -> exercisesBut[finalI].setStyle("-fx-color: #e6e6e6; -fx-font: bold italic 10pt Georgia;"));
            exercisesBut[i].setOnAction(event -> {
                root.getPaneExercises().getChildren().clear();
                for (int j = 0; j < text.length; j++) {
                    text[j] = new Label(textRu.get(j+next));

                }

            });
        }
        paneBut.setSpacing(20);
        paneBut.setLayoutX(WIDTH_SIZE/12);
        paneBut.setLayoutY(HEIGHT_SIZE/6);
        paneBut.getChildren().addAll(exercisesBut);

        scrollPaneExercises.setLayoutX(WIDTH_SIZE/3.5);
        scrollPaneExercises.setLayoutY(HEIGHT_SIZE/5);
//            scrollPaneExercises.setStyle("-fx-border-color: RED");
        scrollPaneExercises.setPrefSize(WIDTH_SIZE/2, HEIGHT_SIZE/1.5);
        scrollPaneExercises.setEffect(EffectShadow.getShadow());
        scrollPaneExercises.setContent(root.getPaneExercises());
        paneRuEn.getChildren().addAll(rus, eng);
        ROOT_PANE.getChildren().addAll(paneBut, paneRuEn, backward, scrollPaneExercises);
    }

    private void translation(Label[] text, Map<Integer, String> textRu, Map<Integer, String> textEn){
        rus.setOnAction(event -> {
            root.getPaneExercises().getChildren().clear();
            for (int i = 0; i < text.length; i++) {
                text[i] = new Label(textRu.get(i+next));
            }
            root.getPaneExercises().getChildren().addAll(text);
        });
        eng.setOnAction(event -> {
            root.getPaneExercises().getChildren().clear();
            for (int i = 0; i < text.length; i++) {
                text[i] = new Label(textEn.get(i+next));
            }
            root.getPaneExercises().getChildren().addAll(text);
        });
    }
}
