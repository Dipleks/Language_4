package exams;

import patterns.Assignable;
import texts.ExamTextPS;

public class FormPS implements Assignable
{
    private ExamTextPS text = new ExamTextPS();

    @Override
    public String getAssignment(int value, int n, String language) {
        if (language.equals("RU")) return text.getRussia().get(value + n);
        if (language.equals("EN")) return text.getEnglish().get(value + n);
        return "No Files";
    }

}
