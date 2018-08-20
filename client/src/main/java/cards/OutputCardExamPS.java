package cards;

import texts.ExamTextPS;

public class OutputCardExamPS implements IOutputCard
{
    private ExamTextPS examTextPS = new ExamTextPS();

    @Override
    public String getCard(int value, String language) {
        if (language.equals("RU")) return examTextPS.getRussia().get(value);
        if (language.equals("EN")) return examTextPS.getEnglish().get(value);
        return "No Files";
    }
}
