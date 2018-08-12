package cards;

import exams.ExamText;

public class OutputCardExamPS implements IOutputCard
{
    private ExamText examText = new ExamText();

    @Override
    public String getCard(int value, String language) {
        if (language.equals("RU")) return examText.getExamRuPS().get(value);
        if (language.equals("EN")) return examText.getExamEnPS().get(value);
        return "No Files";
    }
}
