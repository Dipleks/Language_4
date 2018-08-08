package words;

import java.util.HashMap;
import java.util.Map;

public class WordsText
{
    private Map<Integer, String> wordEn = new HashMap<>();
    private Map<Integer, String> wordRu = new HashMap<>();

    public Map<Integer, String> getWordsEn(){
        getStrWordsEn();
        return wordEn;
    }

    public Map<Integer, String> getWordsRu(){
        getStrWordsRu();
        return wordRu;
    }

    private Map<Integer, String> getStrWordsEn(){
        wordEn.put(0,"hello 1");
        wordEn.put(1,"hello 2");
        wordEn.put(2,"hello 3");
        wordEn.put(3,"hello 4");
        wordEn.put(4,"hello 5");
        wordEn.put(5,"hello 6");

        return wordEn;
    }

    private Map<Integer, String> getStrWordsRu(){
        wordRu.put(0,"привет 1");
        wordRu.put(1,"привет 2");
        wordRu.put(2,"привет 3");
        wordRu.put(3,"привет 4");
        wordRu.put(4,"привет 5");
        wordRu.put(5,"привет 6");

        return wordRu;
    }
}