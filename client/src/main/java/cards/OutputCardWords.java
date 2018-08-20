package cards;

import texts.WordsText;

public class OutputCardWords implements IOutputCard
{
    private WordsText wordsText = new WordsText();

    @Override
    public String getCard(int value, String language) {
        if (language.equals("RU")) return wordsText.getRussia().get(value);
        if (language.equals("EN")) return wordsText.getEnglish().get(value);
        return "No Files";
    }
}
