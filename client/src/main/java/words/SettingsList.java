package words;

import interfaceProgram.EffectShadow;
import interfaceProgram.EffectStyle;
import interfaceProgram.IRoot;
import javafx.geometry.Pos;

class SettingsList implements IRoot {

    void settings(){
        suggestionPane.setPrefWidth(WIDTH_SIZE/2.05);
        suggestionPane.setAlignment(Pos.CENTER);
        suggestionPane.setSpacing(HEIGHT_SIZE/80);

        exercisesPane.setLayoutX(WIDTH_SIZE/3.5);
        exercisesPane.setLayoutY(HEIGHT_SIZE/5);
        exercisesPane.setPrefSize(WIDTH_SIZE/2, HEIGHT_SIZE/1.5);
        exercisesPane.setEffect(EffectShadow.getShadow());
        exercisesPane.setContent(suggestionPane);

        lang.setStyle(EffectStyle.getStyleLabel14());
        lang.setEffect(EffectShadow.getShadow());
        paneLanguageV.setLayoutX(WIDTH_SIZE/18);
        paneLanguageV.setLayoutY(HEIGHT_SIZE/1.3);
        paneLanguageV.setAlignment(Pos.CENTER);
        paneLanguage.setSpacing(HEIGHT_SIZE/60);
        paneLanguageV.setSpacing(WIDTH_SIZE/90);

        paneLanguage.getChildren().addAll(rus, eng);
        paneLanguageV.getChildren().addAll(lang, paneLanguage);

        ROOT_PANE.getChildren().addAll(exercisesPane, invocationPane, paneLanguageV);
    }
}