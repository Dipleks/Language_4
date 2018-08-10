package test_server_client.test.my_test_3;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import test_server_client.my_test_work.IT;

public class T extends Application implements IT
{
    @Override
    public void start(Stage primaryStage) throws Exception {
        Group group = new Group();
        VBox vBox = new VBox();

        b.setOnAction(event -> {
        });

        vBox.setSpacing(20);
        vBox.getChildren().addAll(l1, l2);
        group.getChildren().addAll(vBox, b);
        Scene scene = new Scene(group, 700, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
