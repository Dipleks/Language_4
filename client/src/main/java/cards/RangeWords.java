package cards;

import db.IDataBase;
import db.UpdateTable;
import interfaceProgram.EffectShadow;
import interfaceProgram.EffectStyle;
import interfaceProgram.ICards;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class RangeWords implements ICards, IDataBase
{
    private VBox group = new VBox();
    private HBox minMax = new HBox();

    void getRange(){
        range.setPrefSize(WIDTH_SIZE/8, HEIGHT_SIZE/18);
        range.setStyle(EffectStyle.getStyleButtonDefault10());

        group.setLayoutX(WIDTH_SIZE/18);
        group.setLayoutY(HEIGHT_SIZE/1.8);
        group.setStyle(EffectStyle.getStyleButtonDefault10());
        group.setEffect(EffectShadow.getShadow());
        group.setAlignment(Pos.CENTER);
        group.setSpacing(HEIGHT_SIZE/40);

        MIN.setPromptText("от 1");
        MIN.setPrefWidth(WIDTH_SIZE/15);
        MAX.setPromptText("до 1039");
        MAX.setPrefWidth(WIDTH_SIZE/15);


        minMax.setSpacing(WIDTH_SIZE/40);
        minMax.getChildren().addAll(MIN, MAX);
        group.getChildren().addAll(titleRange, titleRange2, minMax, range);
        ROOT_PANE.getChildren().addAll(group);
    }

    void removeRange(){
        minMax.getChildren().clear();
        group.getChildren().clear();
        ROOT_PANE.getChildren().remove(group);
    }

    void addRangeTable(){

        int min = Integer.parseInt(MIN.getText());
        int max = Integer.parseInt(MAX.getText());

        UpdateTable updateTable = new UpdateTable();
        updateTable.deleteUpdateWordsRange(min, max);
    }
}
