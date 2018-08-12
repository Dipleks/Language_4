package data;

import data.IRoot;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class Exams implements IRoot
{
    private Map<Integer, String> examEnPS = new HashMap<>();
    private Map<Integer, String> examRuPS = new HashMap<>();
    private Map<Integer, String> examEnToBe = new HashMap<>();
    private Map<Integer, String> examRuToBe = new HashMap<>();

    public Map<Integer, String> getExamEnPS(){
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("драйвер JDBC не найден");
        }
        try {
            connection = DriverManager.getConnection(DB_URL + db, USER, PASS);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT id, english FROM exams_ps ORDER BY id;");
            while (resultSet.next()){
                examEnPS.put((resultSet.getInt("id")-1), resultSet.getString("english"));
            }

            // если получить System.out.println(i + " - " + examEnPS.get(i)) тут,
            // а не в методе main код будет рабоать быстрее
//            for (int i = 1; i < 701; i++) {
//                System.out.println(i + " - " + examEnPS.get(i));
//            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                assert connection != null;
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return examEnPS;
    }
    public Map<Integer, String> getExamRuPS(){
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("драйвер JDBC не найден");
        }
        try {
            connection = DriverManager.getConnection(DB_URL + db, USER, PASS);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT id, russia FROM exams_ps ORDER BY id;");
            while (resultSet.next()){
                examRuPS.put((resultSet.getInt("id")-1), resultSet.getString("russia"));
            }
//            for (int i = 0; resultSet.next(); i++) {
//                examEnPS.put(i, resultSet.getString("russia"));
//            }

            // если получить System.out.println(i + " - " + examEnPS.get(i)) тут,
            // а не в методе main код будет рабоать быстрее
            // так же если в main создать новый мап и преравнять его к этому скорость сравняется.
//            for (int i = 1; i < 701; i++) {
//                System.out.println(i + " - " + examEnPS.get(i));
//            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                assert connection != null;
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return examRuPS;
    }
    public Map<Integer, String> getExamEnToBe(){
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("драйвер JDBC не найден");
        }
        try {
            connection = DriverManager.getConnection(DB_URL + db, USER, PASS);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT id, english FROM exams_to_be ORDER BY id;");
            while (resultSet.next()){
                examEnToBe.put((resultSet.getInt("id")-1), resultSet.getString("english"));
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                assert connection != null;
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return examEnToBe;
    }
    public Map<Integer, String> getExamRuToBe(){
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("драйвер JDBC не найден");
        }
        try {
            connection = DriverManager.getConnection(DB_URL + db, USER, PASS);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT id, russia FROM exams_to_be ORDER BY id;");
            while (resultSet.next()){
                examRuToBe.put((resultSet.getInt("id")-1), resultSet.getString("russia"));
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                assert connection != null;
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return examRuToBe;
    }
}
