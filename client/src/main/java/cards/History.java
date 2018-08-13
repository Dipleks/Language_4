package cards;

import db.IDataBase;
import interfaceProgram.EffectShadow;
import interfaceProgram.ICards;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.*;

class History implements ICards, IDataBase
{
    void getHistory(){
        tablePane.setLayoutX(WIDTH_SIZE/3);
        tablePane.setLayoutY(HEIGHT_SIZE/3);
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
        // TODO заполняем таблицу из БД
        try{
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        try{
            Connection connection = DriverManager.getConnection(DB_URL + db, USER, PASS);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT russia, english FROM history ORDER BY id;");
            while (resultSet.next()){
                list.add(new HistoryTable(resultSet.getString("russia"),
                        resultSet.getString("english")));
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        /////////

        // TODO обратить порядок отображения данных (последний вверху)
        table.setItems(list);

        table.getColumns().addAll(rusColumn, engColumn);

        tablePane.getChildren().add(table);
    }
}
