package cards;

import exams.ExamText;

public class OutputCardExamToBe implements IOutputCard
{
    private ExamText examText = new ExamText();

    @Override
    public String getCard(int value, String language) {
        if (language.equals("RU")) return examText.getExamRuToBe().get(value);
        if (language.equals("EN")) return examText.getExamEnToBe().get(value);
        return "No Files";
    }
}
