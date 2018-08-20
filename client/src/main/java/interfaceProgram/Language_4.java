package interfaceProgram;

import db.IDataBase;
import db.UpdateTable;
import javafx.application.Application;
import javafx.stage.Stage;
import menu.MenuBarEngRus;

import java.sql.*;

public class Language_4 extends Application implements RootWindows, IDataBase
{
    private MenuBarEngRus menuBarEngRus = new MenuBarEngRus();
    private Rule rule = new Rule();

    @Override
    public void init() {
    }

    @Override
    public void start(Stage primaryStage) {

        menuBarEngRus.getMenu();
        ClockDisplay.clock();
        ROOT_PANE.getChildren().addAll(rule.getCollectionRules());

        WINDOW.setTitle("Learn English");
        WINDOW.setMaximized(true); //устанавливаем размер окна на весь экран
        WINDOW.setScene(SCENE_ROOT);
        WINDOW.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private boolean getConnect(){
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("не удалось найти драйвер");
            e.printStackTrace();
        }
        try {
            Connection connection = DriverManager.getConnection(DB_URL + db, USER, PASS);
            connection.close();
            return false;
        } catch (SQLException e) {
            return true;
        }
    }

    private void addDB(){
        if (getConnect()) {
            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException e) {
                System.out.println("не удалось найти драйвер");
                e.printStackTrace();
            }
            try {
                Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement statement = connection.createStatement();
                statement.executeUpdate("CREATE DATABASE learn_english_home;");
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException e) {
                System.out.println("не удалось найти драйвер");
                e.printStackTrace();
            }
            try {
                Connection connection = DriverManager.getConnection(DB_URL + db, USER, PASS);
                Statement statement = connection.createStatement();
                statement.executeUpdate("CREATE TABLE exam_cards_ps (id SERIAL PRIMARY KEY, " +
                        "russia VARCHAR(120), english VARCHAR(120), number INTEGER);");
                statement.executeUpdate("CREATE TABLE exam_cards_to_be (id SERIAL PRIMARY KEY, " +
                        "russia VARCHAR(120), english VARCHAR(120), number INTEGER);");
                statement.executeUpdate("CREATE TABLE history (id SERIAL PRIMARY KEY, " +
                        "russia VARCHAR(120), english VARCHAR(120));");
                statement.executeUpdate("CREATE TABLE words (id SERIAL PRIMARY KEY, " +
                        "russia VARCHAR(120), english VARCHAR(120), number INTEGER);");
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        UpdateTable updateTable = new UpdateTable();
        updateTable.deleteUpdateCard();
        updateTable.deleteUpdateExamPS();
        updateTable.deleteUpdateExamToBe();

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("не удалось найти драйвер");
            e.printStackTrace();
        }
        try {
            Connection connection = DriverManager.getConnection(DB_URL + db, USER, PASS);
            Statement statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE words_range (id SERIAL PRIMARY KEY, " +
                    "russia VARCHAR(120), english VARCHAR(120), number INTEGER);");
            statement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("таблица уже существует");
        }
    }
}
