package test_server_client;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class TestClient extends Application
{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group group = new Group();
        VBox vBox = new VBox();
        Scene scene = new Scene(group, 700, 500);
        vBox.setSpacing(15);
        vBox.setAlignment(Pos.CENTER);
        Label label = new Label();

        System.out.println("1");
        try(Socket socket = new Socket()){
            socket.connect(new InetSocketAddress(InetAddress.getLocalHost(), 8189), 2000);
            Scanner scanner = new Scanner(socket.getInputStream());
            while (scanner.hasNextLine()){
                label.setText(scanner.nextLine());
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("2");

        vBox.getChildren().addAll(label);

        group.getChildren().add(vBox);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
