package words;

import interfaceProgram.EffectShadow;
import interfaceProgram.EffectStyle;
import interfaceProgram.IRoot;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

class Exception implements IRoot
{
    void exception(String str){
        Stage stage = new Stage();
        VBox vBox = new VBox();
        Label label = new Label(str);
        label.setStyle(EffectStyle.getStyleLabel());
        label.setEffect(EffectShadow.getShadow());
        Button button = new Button("Закрыть");
        button.setStyle(EffectStyle.getStyleButtonDefault10());
        button.setEffect(EffectShadow.getShadow());
        button.setOnAction(event1 -> stage.close());
        button.setPrefSize(WIDTH_SIZE/15, HEIGHT_SIZE/30);

        vBox.setSpacing(HEIGHT_SIZE/40);
        vBox.setAlignment(Pos.CENTER);
        vBox.getChildren().addAll(label, button);
        Scene scene = new Scene(vBox, WIDTH_SIZE/3, HEIGHT_SIZE/3.5);
        stage.setScene(scene);
        stage.setTitle("Ошибка!");
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
    }
}
