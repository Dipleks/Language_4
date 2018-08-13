package cards;

import db.IDataBase;
import interfaceProgram.EffectShadow;
import interfaceProgram.EffectStyle;
import interfaceProgram.ICards;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.*;

class History implements ICards, IDataBase
{
    void getHistory(){
        tablePane.setLayoutX(WIDTH_SIZE/3);
        tablePane.setLayoutY(HEIGHT_SIZE/2.7);
        tablePane.setEffect(EffectShadow.getShadow());
        tablePane.setPrefSize(WIDTH_SIZE/1.9, HEIGHT_SIZE/2.5);
        tablePane.setStyle("-fx-border-color: red");

        TableView<HistoryTable> table = new TableView<>();
        TableColumn<HistoryTable, String> rusColumn = new TableColumn<>("Русский");
        TableColumn<HistoryTable, String> engColumn = new TableColumn<>("English");

        rusColumn.setCellValueFactory(new PropertyValueFactory<>("russia"));
        rusColumn.setPrefWidth(WIDTH_SIZE/3.9);
        rusColumn.setStyle( "-fx-alignment: CENTER;");
        engColumn.setCellValueFactory(new PropertyValueFactory<>("english"));
        engColumn.setPrefWidth(WIDTH_SIZE/3.9);
        engColumn.setStyle( "-fx-alignment: CENTER;");

        ObservableList<HistoryTable> list = FXCollections.observableArrayList();

        /////////
        try{
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        try{
            Connection connection = DriverManager.getConnection(DB_URL + db, USER, PASS);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT russia, english FROM history ORDER BY id DESC;");
            while (resultSet.next()){
                list.add(new HistoryTable(resultSet.getString("russia"),
                        resultSet.getString("english")));
            }
        } catch (SQLException e){
            list.add(new HistoryTable("база данных не подключена", "the database is not connected"));
//            e.printStackTrace();
        }
        /////////

        table.setItems(list);
        Label l = new Label("Наведите курсор мышки");
        l.setStyle(EffectStyle.getStyleLabel());
        l.setEffect(EffectShadow.getShadow());
        table.setPlaceholder(l);

        rusColumn.setVisible(false);
        engColumn.setVisible(false);
        table.setOnMouseEntered(event -> {
            rusColumn.setVisible(true);
            engColumn.setVisible(true);
        });
        table.setOnMouseExited(event -> {
            rusColumn.setVisible(false);
            engColumn.setVisible(false);
        });

        table.getColumns().addAll(rusColumn, engColumn);

        tablePane.getChildren().add(table);
    }
}
