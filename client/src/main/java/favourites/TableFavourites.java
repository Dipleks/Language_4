package favourites;

import com.fasterxml.jackson.databind.ObjectMapper;
import contMenu.Numbering;
import interfaceProgram.EffectShadow;
import interfaceProgram.EffectStyle;
import interfaceProgram.RootWindows;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import texts.ExerciseTextPS;
import texts.ExerciseTextToBe;
import texts.ITexts;
import texts.WordsText;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TableFavourites implements RootWindows {

    private TableColumn<TableFavouritesColumn, String> en = new TableColumn<>("English");
    private TableColumn<TableFavouritesColumn, String> ru = new TableColumn<>("Русский");
    private ObservableList<TableFavouritesColumn> lists = null;

    public void getTable(String name){

        lists = FXCollections.observableArrayList();
        TableView<TableFavouritesColumn> table = new TableView<>();
        table.getColumns().clear();
        ROOT_PANE.getChildren().remove(table);

        en.setPrefWidth(WIDTH_SIZE/3.5);
        en.setCellValueFactory(new PropertyValueFactory<>("english"));

        ru.setPrefWidth(WIDTH_SIZE/3.5);
        ru.setCellValueFactory(new PropertyValueFactory<>("russian"));

        table.setStyle(EffectStyle.getStyleLabel12());
        table.setEffect(EffectShadow.getShadow());
        table.setPrefHeight(HEIGHT_SIZE/1.7);
        table.setLayoutX(WIDTH_SIZE/3.2);
        table.setLayoutY(HEIGHT_SIZE/5);

        ObservableList<TableFavouritesColumn> list = getListTexts(name);
        table.setItems(list);
        table.getColumns().addAll(en, ru);

        ROOT_PANE.getChildren().add(table);
    }

    private ObservableList<TableFavouritesColumn> getListTexts(String name){
        switch (name) {
            case "ps":
                addList("ps.txt", new ExerciseTextPS());
                break;
            case "tobe":
                addList("tobe.txt", new ExerciseTextToBe());
                break;
            case "word":
                addList("word.txt", new WordsText());
                break;
        }
        return lists;
    }

    // Десериализация
    private void addList(String txt, ITexts iTexts){
        FileInputStream fis = null;
        String s = null;
        try {
            fis = new FileInputStream(txt);
            BufferedReader bf = new BufferedReader(new InputStreamReader(fis));

            if ((s = bf.readLine()) == null) {
                ObjectMapper objectMapper = new ObjectMapper();
                Numbering number = objectMapper.readValue(s, Numbering.class);

                System.out.println(number.toString());
            }
            while ((s = bf.readLine()) != null){
                ObjectMapper objectMapper = new ObjectMapper();
                Numbering number = objectMapper.readValue(s, Numbering.class);
                Integer i = Integer.valueOf(number.toString());
                lists.add(new TableFavouritesColumn(iTexts.getEnglish().get(i), iTexts.getRussia().get(i)));
            }
            fis.close();
            bf.close();
        } catch (IOException e) {
            getPane("Нет слов добавленных \n в данную категорию!");
        }
    }
}
