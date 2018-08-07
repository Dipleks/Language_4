package cards;

import interfaceProgram.EffectShadow;
import interfaceProgram.EffectStyle;
import interfaceProgram.ICards;
import javafx.scene.control.Button;

class Change implements ICards
{
    Button getNext(){
        next.setLayoutX(WIDTH_SIZE/2.5);
        next.setLayoutY(HEIGHT_SIZE/4);
        next.setStyle(EffectStyle.getStyleButton());
        next.setEffect(EffectShadow.getShadow());
        next.setPrefSize(WIDTH_SIZE/12, HEIGHT_SIZE/25);
        next.setOnAction(event -> {
            ROOT_PANE.getChildren().remove(title);

            OutputCard outputCard = new OutputCard();
            outputCard.getOutputCard(0, 515, new OutputCardExamPS());

            ROOT_PANE.getChildren().add(title);

        });
        return next;
    }
    Button getTranslation(){
        translation.setLayoutX(WIDTH_SIZE/1.4);
        translation.setLayoutY(HEIGHT_SIZE/4);
        translation.setStyle(EffectStyle.getStyleButton());
        translation.setEffect(EffectShadow.getShadow());
        translation.setPrefSize(WIDTH_SIZE/12, HEIGHT_SIZE/25);
        return translation;
    }
}
