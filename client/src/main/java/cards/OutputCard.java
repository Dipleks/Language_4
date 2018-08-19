package cards;

import db.IDataBase;
import db.UpdateTable;
import interfaceProgram.EffectShadow;
import interfaceProgram.EffectStyle;
import interfaceProgram.ICards;
import javafx.geometry.Pos;
import javafx.scene.control.Label;

import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class OutputCard implements ICards, IDataBase
{
    private int random_number;

    void getOutputCard(IOutputCard card, String nameTable){
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e){
            System.out.println("не удалось найти драйвер");
            e.printStackTrace();
        }
        try {
            Connection connection = DriverManager.getConnection(DB_URL + db, USER, PASS);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT id FROM "+ nameTable +" ORDER BY random() LIMIT 1;");
            resultSet.next();
            random_number = (resultSet.getInt("id")-1);
            statement.executeUpdate("DELETE FROM "+ nameTable +" WHERE number = " + random_number + ";");
            statement.executeUpdate("ALTER SEQUENCE "+ nameTable +"_id_seq RESTART WITH 1;");

            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException e){
            UpdateTable updateTable = new UpdateTable();
            updateTable.deleteUpdateCard();
            updateTable.deleteUpdateExamPS();
            updateTable.deleteUpdateExamToBe();
            RangeWords rangeWords = new RangeWords();
            rangeWords.addRangeTable();
        }

        title.setLayoutX(WIDTH_SIZE/2.5);
        title.setLayoutY(HEIGHT_SIZE/6);
        title.setPrefWidth(WIDTH_SIZE/2.5);
        title.setWrapText(true);
        title.setAlignment(Pos.CENTER);
        title.setStyle(EffectStyle.getStyleLabel() /*+ "-fx-border-color: RED;"*/);
        title.setEffect(EffectShadow.getShadow());

        if (rus.isSelected()) {
            title.setText(card.getCard(random_number, "RU"));
            translation.setOnAction(event -> {
                ROOT_PANE.getChildren().remove(title);
                title.setText(card.getCard(random_number, "EN"));
                ROOT_PANE.getChildren().add(title);
            });
        }
        if (eng.isSelected()) {
            title.setText(card.getCard(random_number, "EN"));
            translation.setOnAction(event -> {
                ROOT_PANE.getChildren().remove(title);
                title.setText(card.getCard(random_number, "RU"));
                ROOT_PANE.getChildren().add(title);
            });
        }

        // история
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e){
            System.out.println("не удалось найти драйвер");
            e.printStackTrace();
        }
        try(Connection connection = DriverManager.getConnection(DB_URL + db, USER, PASS);
            Statement statement = connection.createStatement())
        {
            Pattern pattern  = Pattern.compile("'"); // то что нужно заменить
            Matcher matcher = pattern.matcher(card.getCard(random_number, "EN")); // там где нужно заменить
            String result = matcher.replaceAll("''"); // то чем заменить
            statement.executeUpdate("INSERT INTO history (russia, english) VALUES " +
                    "('"+ card.getCard(random_number, "RU") +"', '" +
                    result +"');");
        } catch (SQLException e){
           e.printStackTrace();
        }
    }

    void deleteHistory(){
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e){
            System.out.println("не удалось найти драйвер");
            e.printStackTrace();
        }
        try(Connection connection = DriverManager.getConnection(DB_URL + db, USER, PASS);
            Statement statement = connection.createStatement())
        {
            statement.executeUpdate("DELETE FROM history; ALTER SEQUENCE history_id_seq RESTART WITH 1;");
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
