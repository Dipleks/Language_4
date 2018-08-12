package test_server_client.my_test_work;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class T extends Application implements IT
{
    @Override
    public void start(Stage primaryStage) throws Exception {
        Group group = new Group();
        VBox vBox = new VBox();

        b.setOnAction(event -> {
            try {
                Socket socket = new Socket("localhost", 4444);
                Scanner scanner = new Scanner(socket.getInputStream(), "UTF-8");
                DataOutputStream oos = new DataOutputStream(socket.getOutputStream());
                oos.writeUTF("PS");

                Map<Integer, String> m = new HashMap<>();
                for (int i = 0; scanner.hasNextLine(); i++){
                    String l = scanner.nextLine();
                    m.put(i, l);
                }
                for (int i = 0; i < 10; i++) {
                    ls[i] = new Label(m.get(i));
                    System.out.println((i+1) + " " + ls[i].getText());
                }
                l1.setText(m.get(0));
                l2.setText(m.get(1));

                scanner.close();
                socket.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
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
