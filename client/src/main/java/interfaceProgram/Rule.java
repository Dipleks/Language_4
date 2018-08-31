package interfaceProgram;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

class Rule implements RootWindows
{
    private final String r5 = "- Нажимайте на предложения и получайте перевод";
    private final String r6 = "- Нажимайте \"Далее\" и получайте следующею карточку";
    private final String r3 = "- Выберите упражнения по темам";
    private final String r4 = "- На данный момент в программе более 1000 предложений и более 1000 слов";
    private final String r1 = "- Программа находится в разработке";
    private final String r2 = "- Все функции с Language_2 будут добавлены в ближайшем обновлении";

    private Label rule1 = new Label(r1);
    private Label rule2 = new Label(r2);
    private Label rule3 = new Label(r3);
    private Label rule4 = new Label(r4);
    private Label rule5 = new Label(r5);
    private Label rule6 = new Label(r6);
    private VBox collectionRules = new VBox();

    VBox getCollectionRules(){

        collectionRules.setStyle(EffectStyle.getStyleLabel14());
        collectionRules.setSpacing(HEIGHT_SIZE/60);
        collectionRules.setEffect(EffectShadow.getShadow());
        collectionRules.setLayoutX(WIDTH_SIZE/4);
        collectionRules.setLayoutY(HEIGHT_SIZE/4);
        collectionRules.getChildren().addAll(rule1, rule3, rule4, rule5, rule6);
        return collectionRules;
    }
}
