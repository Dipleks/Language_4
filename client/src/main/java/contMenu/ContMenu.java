package contMenu;

import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;

import java.io.*;

public class ContMenu {

    public void contMenu(Label l, int num) {
        ContextMenu subContext = new ContextMenu();
        Menu selected = new Menu("В избранное");
        MenuItem ps = new MenuItem("Present Simple");
        MenuItem tobe = new MenuItem("Form \"to be\"");
        MenuItem words = new MenuItem("Слова");

//        ps.setDisable(true);
//        tobe.setDisable(true);
//        words.setDisable(true);

        ps.setOnAction(event -> serFavorites(num, "ps.txt"));
        tobe.setOnAction(event -> serFavorites(num, "tobe.txt"));
        words.setOnAction(event -> serFavorites(num, "word.txt"));

        selected.getItems().addAll(ps, tobe, words);
        subContext.getItems().addAll(selected);

        l.setOnContextMenuRequested(event -> subContext.show(l, event.getScreenX(), event.getScreenY()));
    }

    private void serFavorites(int num, String txt){
        Numbering numbering = new Numbering();
        numbering.n = num;

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(txt, true);
            BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(fos));

            bf.newLine();

            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(bf, numbering);

            fos.flush();
            fos.close();
            bf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
