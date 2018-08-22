package cards;

import db.IDataBase;
import interfaceProgram.EffectShadow;
import interfaceProgram.EffectStyle;
import interfaceProgram.ICards;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import texts.ITexts;

import java.sql.*;
import java.util.*;

class OutputCard implements ICards, IDataBase
{
    private List<String> engText = new ArrayList<>();
    private List<String> rusText = new ArrayList<>();
    private Map<String, String> translationENG = new HashMap<>();
    private Map<String, String> translationRUS = new HashMap<>();
    private int random;
    private int number = 0;

    void getOutputCard(final int max, ITexts iTexts){

        getStyle();

        random = max;
        Collections.shuffle(getRusText(iTexts));
        Collections.shuffle(getEngText(iTexts));
        next.setOnAction(event -> {
            try {
                number++;
                COUNTER.setText("Пройдено карточек - " + number);
                ROOT_PANE.getChildren().remove(title);
                ROOT_PANE.getChildren().remove(tablePane);
                ROOT_PANE.getChildren().remove(COUNTER);
                if (rus.isSelected()) {
                    try {
                        title.setText(rusText.get(random));
                        translation.setOnAction(event2 -> {
                            ROOT_PANE.getChildren().remove(title);
                            title.setText(getTranslationRUS(iTexts).get(title.getText()));
                            ROOT_PANE.getChildren().add(title);
                        });
                        random--;
                    } catch (Exception e) {
                        System.out.println("rus");
                        random = max;
                        number = 0;
                    }
                    mix.setOnAction(event3 -> {
                        getRusText(iTexts).removeAll(rusText);
                        Collections.shuffle(getRusText(iTexts));
                    });
                }
                if (eng.isSelected()) {
                    try {
                        title.setText(engText.get(random));
                        translation.setOnAction(event3 -> {
                            ROOT_PANE.getChildren().remove(title);
                            title.setText(getTranslationENG(iTexts).get(title.getText()));
                            ROOT_PANE.getChildren().add(title);
                        });
                        random--;
                    } catch (Exception e) {
                        System.out.println("eng");
                        random = max;
                        number = 0;
                    }
                    mix.setOnAction(event2 -> {
                        getEngText(iTexts).removeAll(engText);
                        Collections.shuffle(getEngText(iTexts));
                    });
                }
                ROOT_PANE.getChildren().add(tablePane);
                ROOT_PANE.getChildren().add(title);
                ROOT_PANE.getChildren().add(COUNTER);
            } catch (IndexOutOfBoundsException e){
                number = 0;
                Stage stage = new Stage();
                StackPane stackPane = new StackPane();
                Scene scene = new Scene(stackPane, WIDTH_SIZE/4, HEIGHT_SIZE/4);
                Label label = new Label("Круг закончен!");
                label.setEffect(EffectShadow.getShadow());
                label.setStyle(EffectStyle.getStyleLabel());
                stackPane.getChildren().add(label);
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.setScene(scene);
                stage.setTitle("Круг");
                stage.show();
            }
        });

    }

    private List<String> getEngText(ITexts iTexts){
        for (int i = 0; i < iTexts.getEnglish().size(); i++) {
            engText.add(i, iTexts.getEnglish().get(i));
        }
        return engText;
    }
    private List<String> getRusText(ITexts iTexts){
        for (int i = 0; i < iTexts.getRussia().size(); i++) {
            rusText.add(i, iTexts.getRussia().get(i));
        }
        return rusText;
    }
    private Map<String, String> getTranslationENG(ITexts iTexts){
        for (int i = 0; i < iTexts.getEnglish().size(); i++) {
            translationENG.put(iTexts.getEnglish().get(i), iTexts.getRussia().get(i));
        }
        return translationENG;
    }
    private Map<String, String> getTranslationRUS(ITexts iTexts){
        for (int i = 0; i < iTexts.getRussia().size(); i++) {
            translationRUS.put(iTexts.getRussia().get(i), iTexts.getEnglish().get(i));
        }
        return translationRUS;
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

    private void getStyle(){
        translation.setLayoutX(WIDTH_SIZE/1.4);
        translation.setLayoutY(HEIGHT_SIZE/4);
        translation.setStyle(EffectStyle.getStyleButtonDefault10());
        translation.setEffect(EffectShadow.getShadow());
        translation.setOnMousePressed(event -> translation.setStyle(EffectStyle.getStyleButton10()));
        translation.setOnMouseReleased(event -> translation.setStyle(EffectStyle.getStyleButtonDefault10()));
        translation.setPrefSize(WIDTH_SIZE/12, HEIGHT_SIZE/25);

        title.setLayoutX(WIDTH_SIZE/2.5);
        title.setLayoutY(HEIGHT_SIZE/6);
        title.setPrefWidth(WIDTH_SIZE/2.5);
        title.setWrapText(true);
        title.setAlignment(Pos.CENTER);
        title.setStyle(EffectStyle.getStyleLabel() /*+ "-fx-border-color: RED;"*/);
        title.setEffect(EffectShadow.getShadow());

        next.setLayoutX(WIDTH_SIZE/2.5);
        next.setLayoutY(HEIGHT_SIZE/4);
        next.setStyle(EffectStyle.getStyleButtonDefault10());
        next.setOnMousePressed(event -> next.setStyle(EffectStyle.getStyleButton10()));
        next.setOnMouseReleased(event -> next.setStyle(EffectStyle.getStyleButtonDefault10()));
        next.setEffect(EffectShadow.getShadow());
        next.setPrefSize(WIDTH_SIZE/12, HEIGHT_SIZE/25);

        mix.setLayoutX(WIDTH_SIZE/1.8);
        mix.setLayoutY(HEIGHT_SIZE/4);
        mix.setStyle(EffectStyle.getStyleButtonDefault10());
        mix.setOnMousePressed(event -> mix.setStyle(EffectStyle.getStyleButton10()));
        mix.setOnMouseReleased(event -> mix.setStyle(EffectStyle.getStyleButtonDefault10()));
        mix.setEffect(EffectShadow.getShadow());
        mix.setPrefSize(WIDTH_SIZE/12, HEIGHT_SIZE/25);

        COUNTER.setLayoutX(WIDTH_SIZE/2.7);
        COUNTER.setLayoutY(HEIGHT_SIZE/10);
        COUNTER.setStyle(EffectStyle.getStyleLabelColor());
        COUNTER.setEffect(EffectShadow.getShadow());
        COUNTER.setTextFill(Color.DARKRED);
    }
}
