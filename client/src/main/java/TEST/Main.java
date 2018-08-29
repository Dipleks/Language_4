package TEST;

import com.sun.deploy.uitoolkit.impl.fx.HostServicesFactory;
import com.sun.javafx.application.HostServicesDelegate;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.SceneBuilder;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        HostServicesDelegate hostServices = HostServicesFactory.getInstance(this);
        getHostServices().showDocument("http://www.ya.ru");

        WebView webview = new WebView();
        webview.getEngine().load(
                "https://www.youtube.com/watch?v=WGROZc8gHxk"
        );
        webview.setPrefSize(640, 390);

        primaryStage.setScene(new Scene(webview));
        primaryStage.show();
    }


}
