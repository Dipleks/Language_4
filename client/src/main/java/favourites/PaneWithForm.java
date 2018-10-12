package favourites;

import interfaceProgram.EffectShadow;
import interfaceProgram.RootWindows;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import menu.ClearDisplay;

class PaneWithForm implements RootWindows {

    private VBox paneForm = new VBox();
    private Button ps = new Button("Present Simple");
    private Button tobe = new Button("Form \"TO BE\"");
    private Button word = new Button("Слова");

    private final String released = "-fx-color: #e6e6e6; -fx-font: bold italic 12pt Georgia; -fx-focus-color: GREEN;";
    private final String pressed = "-fx-color: #fdd2a9; -fx-font: bold italic 12pt Georgia; -fx-focus-color: GREEN;";

    private TableFavourites tableFavourites = new TableFavourites();

    VBox getPaneForm() {

        ps.setPrefSize(WIDTH_SIZE/7, HEIGHT_SIZE/18);
        ps.setStyle(released);
        ps.setEffect(EffectShadow.getShadow());
        ps.setOnMouseEntered(event -> ps.setStyle(pressed));
        ps.setOnMouseExited(event -> ps.setStyle(released));
        ps.setOnAction(event -> {
            ClearDisplay.clearFavourites();
            ROOT_PANE.getChildren().add(paneForm);
            ps.setDisable(true);
            tobe.setDisable(false);
            word.setDisable(false);
            tableFavourites.getTable("ps");
            ps.setStyle(pressed);
            tobe.setStyle(released);
            word.setStyle(released);
        });

        tobe.setPrefSize(WIDTH_SIZE/7, HEIGHT_SIZE/18);
        tobe.setStyle(released);
        tobe.setEffect(EffectShadow.getShadow());
        tobe.setOnMouseEntered(event -> tobe.setStyle(pressed));
        tobe.setOnMouseExited(event -> tobe.setStyle(released));
        tobe.setOnAction(event -> {
            ClearDisplay.clearFavourites();
            ROOT_PANE.getChildren().add(paneForm);
            ps.setDisable(false);
            tobe.setDisable(true);
            word.setDisable(false);
            tableFavourites.getTable("tobe");
            tobe.setStyle(pressed);
            ps.setStyle(released);
            word.setStyle(released);
        });

        word.setPrefSize(WIDTH_SIZE/7, HEIGHT_SIZE/18);
        word.setStyle(released);
        word.setEffect(EffectShadow.getShadow());
        word.setOnMouseEntered(event -> word.setStyle(pressed));
        word.setOnMouseExited(event -> word.setStyle(released));
        word.setOnAction(event -> {
            ClearDisplay.clearFavourites();
            ROOT_PANE.getChildren().add(paneForm);
            ps.setDisable(false);
            tobe.setDisable(false);
            word.setDisable(true);
            tableFavourites.getTable("word");
            tobe.setStyle(released);
            ps.setStyle(released);
            word.setStyle(pressed);
        });

        paneForm.setLayoutX(WIDTH_SIZE/16);
        paneForm.setLayoutY(HEIGHT_SIZE/5);
        paneForm.setSpacing(HEIGHT_SIZE/45);
        paneForm.getChildren().addAll(ps, tobe, word);
        ROOT_PANE.getChildren().add(paneForm);

        return paneForm;
    }
}
