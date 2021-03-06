package db;

import texts.ExamTextPS;
import texts.WordsText;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UpdateTable implements IDataBase
{
    public void deleteUpdateCard(){
        WordsText wordsText = new WordsText();
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e){
            System.out.println("не удалось найти драйвер");
            e.printStackTrace();
        }
        try(Connection connection = DriverManager.getConnection(DB_URL + db, USER, PASS);
            Statement statement = connection.createStatement())
        {
            statement.executeUpdate("DELETE FROM words; ALTER SEQUENCE words_id_seq RESTART WITH 1;");
            for (int i = 0; i < wordsText.getEnglish().size(); i++) {
                statement.executeUpdate("INSERT INTO words(russia, english, number) " +
                        "VALUES ('"+ wordsText.getRussia().get(i) +"', '"+ wordsText.getEnglish().get(i) +"', "+ i +");");
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void deleteUpdateExamPS(){
        ExamTextPS examTextPS = new ExamTextPS();
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e){
            System.out.println("не удалось найти драйвер");
            e.printStackTrace();
        }
        try(Connection connection = DriverManager.getConnection(DB_URL + db, USER, PASS);
            Statement statement = connection.createStatement())
        {
            statement.executeUpdate("DELETE FROM exam_cards_ps; ALTER SEQUENCE exam_cards_ps_id_seq RESTART WITH 1;");
            for (int i = 0; i < examTextPS.getEnglish().size(); i++) {
                Pattern pattern  = Pattern.compile("'"); // то что нужно заменить
                Matcher matcher = pattern.matcher(examTextPS.getEnglish().get(i)); // там где нужно заменить
                String result = matcher.replaceAll("''"); // то чем заменить
                statement.executeUpdate("INSERT INTO exam_cards_ps(russia, english, number) " +
                        "VALUES ('"+ examTextPS.getRussia().get(i) +"', '"+ result +"', "+ i +");");
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void deleteUpdateExamToBe(){
        ExamTextPS examTextPS = new ExamTextPS();
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e){
            System.out.println("не удалось найти драйвер");
            e.printStackTrace();
        }
        try(Connection connection = DriverManager.getConnection(DB_URL + db, USER, PASS);
            Statement statement = connection.createStatement())
        {
            statement.executeUpdate("DELETE FROM exam_cards_to_be; ALTER SEQUENCE exam_cards_to_be_id_seq RESTART WITH 1;");
            for (int i = 0; i < examTextPS.getEnglish().size(); i++) {
                Pattern pattern  = Pattern.compile("'"); // то что нужно заменить
                Matcher matcher = pattern.matcher(examTextPS.getEnglish().get(i)); // там где нужно заменить
                String result = matcher.replaceAll("''"); // то чем заменить
                statement.executeUpdate("INSERT INTO exam_cards_to_be(russia, english, number) " +
                        "VALUES ('"+ examTextPS.getRussia().get(i) +"', '"+ result +"', "+ i +");");
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void deleteUpdateWordsRange(int min, int max){
        WordsText wordsText = new WordsText();
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e){
            System.out.println("не удалось найти драйвер");
            e.printStackTrace();
        }
        try(Connection connection = DriverManager.getConnection(DB_URL + db, USER, PASS);
            Statement statement = connection.createStatement())
        {
            statement.executeUpdate("DELETE FROM words_range; ALTER SEQUENCE words_range_id_seq RESTART WITH 1;");
            for (int i = (min-1); i < max; i++) {
                Pattern pattern  = Pattern.compile("'"); // то что нужно заменить
                Matcher matcher = pattern.matcher(wordsText.getEnglish().get(i)); // там где нужно заменить
                String result = matcher.replaceAll("''"); // то чем заменить
                statement.executeUpdate("INSERT INTO words_range(russia, english, number) " +
                        "VALUES ('"+ wordsText.getRussia().get(i) +"', '"+ result +"', "+ i +");");
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
