package contMenu;

import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;

public class ContMenu {

    public void contMenu(Label l) {
        ContextMenu subContext = new ContextMenu();
        Menu selected = new Menu("В избранное");
        MenuItem ps = new MenuItem("Present Simple");
        MenuItem tobe = new MenuItem("Form \"to be\"");
        MenuItem words = new MenuItem("Слова");

        ps.setDisable(true);
        tobe.setDisable(true);
        words.setDisable(true);

        ps.setOnAction(event -> {
            favoritesPS(l);
            System.out.println(l.getText());
        });

        tobe.setOnAction(event -> {
            favoritesToBe(l);
            System.out.println(l.getText());
        });
        words.setOnAction(event -> {
            favoritesWords(l);
            System.out.println(l.getText());
        });

        selected.getItems().addAll(ps, tobe, words);
        subContext.getItems().addAll(selected);

        l.setOnContextMenuRequested(event -> {
            subContext.show(l, event.getScreenX(), event.getScreenY());
        });
    }

    private void favoritesPS(Label text) {

    }

    private void favoritesToBe(Label text) {

    }

    private void favoritesWords(Label text) {

    }
}
