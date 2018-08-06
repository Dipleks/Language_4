package exams;

public class FormPS implements Assignable
{
    private ExamText text = new ExamText();

    @Override
    public String getAssignment(int value, int n, String language) {
        if (language.equals("RU")) return text.getExamRuPS().get(value + n);
        if (language.equals("EN")) return text.getExamEnPS().get(value + n);
        return "No Files";
    }
}
