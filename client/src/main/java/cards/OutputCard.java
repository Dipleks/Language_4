package cards;

import db.IDataBase;
import interfaceProgram.EffectShadow;
import interfaceProgram.EffectStyle;
import interfaceProgram.ICards;
import javafx.geometry.Pos;
import javafx.scene.control.Label;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class OutputCard implements ICards, IDataBase
{
    void getOutputCard(int a, int b, IOutputCard card){
        int random_number = a + (int) (Math.random() * b);
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
