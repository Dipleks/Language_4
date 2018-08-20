package exams;

import patterns.Assignable;
import texts.ExamTextPS;
import texts.ExamTextToBe;

public class FormToBe implements Assignable
{
    private ExamTextToBe text = new ExamTextToBe();

    @Override
    public String getAssignment(int value, int n, String language) {
        if (language.equals("RU")) return text.getRussia().get(value + n);
        if (language.equals("EN")) return text.getEnglish().get(value + n);
        return "No Files";
    }
}
