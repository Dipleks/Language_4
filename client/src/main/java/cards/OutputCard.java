package cards;

import interfaceProgram.EffectShadow;
import interfaceProgram.EffectStyle;
import interfaceProgram.ICards;
import javafx.geometry.Pos;

class OutputCard implements ICards
{
    void getOutputCard(int b, IOutputCard card){
        int a = 0;
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


    }
}
