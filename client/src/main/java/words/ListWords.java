package words;

import patterns.Assignable;
import texts.WordsText;

public class ListWords implements Assignable {

    private WordsText wordsText = new WordsText();

    @Override
    public String getAssignment(int value, int n, String language) {
        if (language.equals("RU")) return wordsText.getRussia().get(value + n);
        if (language.equals("EN")) return wordsText.getEnglish().get(value + n);
        return "No Files";
    }
}
