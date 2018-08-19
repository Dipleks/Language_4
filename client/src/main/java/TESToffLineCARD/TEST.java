package TESToffLineCARD;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.*;

public class TEST extends Application {
    // Тестируем назависую выборку кард от БД (для off-line режима)

    private List<String> m1 = new ArrayList<>();
    private List<String> m2 = new ArrayList<>();
    private Map<String, String> m3 = new HashMap<>();
    private Set<String> strings = new HashSet<>();
    private Label texts = new Label();
    private int random = 4;
    private String str;


    @Override
    public void start(Stage primaryStage) throws Exception {

        Group group = new Group();
        VBox vBox = new VBox();
        Button button = new Button("Press");
        Button button2 = new Button("перемешать");
        Scene scene = new Scene(group, 800, 700);

        Collections.shuffle(getM1());
        button.setOnAction(event -> {
            vBox.getChildren().remove(texts);
            try {
                texts.setText(m1.get(random));
                texts.setOnMouseClicked(event1 -> {
                    texts.setText(getM3().get(texts.getText()));
                });
                random--;
            } catch (Exception e){
                Stage stage = new Stage();
                Group group1 = new Group();
                Scene scene1 = new Scene(group1, 200, 80);

                stage.initModality(Modality.APPLICATION_MODAL);
                group1.getChildren().addAll(new Label("круг законичился"));
                stage.setScene(scene1);
                stage.show();
                random = 4;
            }
            vBox.getChildren().add(texts);

        });
        button2.setOnAction(event -> {
            Collections.shuffle(getM1());
        });

        vBox.setSpacing(10);
        vBox.setLayoutX(30);
        vBox.setLayoutY(50);
        vBox.getChildren().addAll(button, button2);

        group.getChildren().add(vBox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private List<String> getM1(){
        m1.add(0, "Test1");
        m1.add(1, "Test2");
        m1.add(2, "Test3");
        m1.add(3, "Test4");
        m1.add(4, "Test5");
        return m1;
    }
    private List<String> getM2(){
        m2.add(0, "rus1");
        m2.add(1, "rus2");
        m2.add(2, "rus3");
        m2.add(3, "rus4");
        m2.add(4, "rus5");
        return m2;
    }
    private Map<String, String> getM3(){
        m3.put("Test1", "rus1");
        m3.put("Test2", "rus2");
        m3.put("Test3", "rus3");
        m3.put("Test4", "rus4");
        m3.put("Test5", "rus5");
        return m3;
    }
}
