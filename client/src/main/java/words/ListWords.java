package words;

import patterns.Assignable;

class ListWords implements Assignable
{
    private WordsText wordsText = new WordsText();

    @Override
    public String getAssignment(int value, int n, String language) {
        if (language.equals("RU")) return wordsText.getWordsRu().get(value + n);
        if (language.equals("EN")) return wordsText.getWordsEn().get(value + n);
        return "No Files";
    }
}
