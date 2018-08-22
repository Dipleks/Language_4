package words;

import interfaceProgram.IRoot;
import interfaceProgram.SeparatorExercises;
import javafx.scene.control.Label;

public class Words implements IRoot
{
    public void getWords(){
        getWord();
    }

    private void getWord() {
        SeparatorExercises separator = new SeparatorExercises();
        separator.getSeparator();
        OutputWords outputWords = new OutputWords();
        outputWords.getList();
    }
}
