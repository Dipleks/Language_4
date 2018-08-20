package cards;

import interfaceProgram.EffectShadow;
import interfaceProgram.EffectStyle;
import interfaceProgram.ICards;
import javafx.geometry.Pos;
import javafx.scene.paint.Color;
import texts.ITexts;
import texts.WordsText;

import java.util.*;

public class T implements ICards
{
    private List<String> engText = new ArrayList<>();
    private List<String> rusText = new ArrayList<>();
    private Map<String, String> translationENG = new HashMap<>();
    private Map<String, String> translationRUS = new HashMap<>();
    private int number = 0;
    private int n = 0;
    int min;
    int max;

    public T(int min, int max) {
        this.min = min;
        this.max = max;
    }

    void getOutputCard(){

        getStyle();
        WordsText wordsText = new WordsText();
        for (int i = 0; i < 1039; i++) {
            engText.add(i, wordsText.getEnglish().get(i));
            rusText.add(i, wordsText.getRussia().get(i));
        }

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=min; i<max; i++) {
            list.add(new Integer(i));
        }
        Collections.shuffle(list);
//        for (int i=0; i<3; i++) {
//            System.out.println(list.get(i));
//        }
        n = max;
//        Collections.shuffle(rusText);
//        Collections.shuffle(engText);
        next.setOnAction(event -> {
            number++;
            COUNTER.setText("Пройдено карточек - " + number);
            ROOT_PANE.getChildren().remove(title);
            ROOT_PANE.getChildren().remove(tablePane);
            ROOT_PANE.getChildren().remove(COUNTER);
            if (rus.isSelected()) {
                try {
                    // TODO доделать повторы
                    title.setText(rusText.get(max--));
                    translation.setOnAction(event2 -> {
                        ROOT_PANE.getChildren().remove(title);
                        title.setText(getTranslationRUS().get(title.getText()));
                        ROOT_PANE.getChildren().add(title);
                    });
                    n++;
                    if (max == min){
                        System.out.println("=");
                        max = n;
                    }
                } catch (Exception e){
                    System.out.println("круг");
                    max = n;
                    number = 0;
                }
                History history = new History();
                history.getHistory();
                mix.setOnAction(event3 -> {
                    Collections.shuffle(rusText);
                });
            }
            if (eng.isSelected()) {
                try {
                    title.setText(engText.get(max));
                    translation.setOnAction(event3 -> {
                        ROOT_PANE.getChildren().remove(title);
                        title.setText(getTranslationENG().get(title.getText()));
                        ROOT_PANE.getChildren().add(title);
                    });
                    max--;
                } catch (Exception e){
                    System.out.println("eng");
                    n = max;
                    number = 0;
                }
                History history = new History();
                history.getHistory();
                mix.setOnAction(event2 -> {
                    engText.removeAll(engText);
                    Collections.shuffle(engText);
                });
            }
            ROOT_PANE.getChildren().add(tablePane);
            ROOT_PANE.getChildren().add(title);
            ROOT_PANE.getChildren().add(COUNTER);
        });

    }

//    private List<String> getEngText(){
//        return engText;
//    }
//    private List<String> getRusText(){
//        WordsText wordsText = new WordsText();
//        for (int i = min; i < max; i++) {
//            engText.add(i, wordsText.getRussia().get(i));
//        }
//        return rusText;
//    }
    private Map<String, String> getTranslationENG(){
        WordsText wordsText = new WordsText();
        for (int i = min; i < max; i++) {
            translationENG.put(wordsText.getEnglish().get(i), wordsText.getRussia().get(i));
        }
        return translationENG;
    }
    private Map<String, String> getTranslationRUS(){
        WordsText wordsText = new WordsText();
        for (int i = min; i < max; i++) {
            translationENG.put(wordsText.getRussia().get(i), wordsText.getEnglish().get(i));
        }
        return translationRUS;
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
