package cards;

import words.WordsText;

public class OutputCardWords implements IOutputCard
{
    private WordsText wordsText = new WordsText();

    @Override
    public String getCard(int value, String language) {
        if (language.equals("RU")) return wordsText.getWordsRu().get(value);
        if (language.equals("EN")) return wordsText.getWordsEn().get(value);
        return "No Files";
    }
}
