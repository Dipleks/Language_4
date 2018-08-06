package exams;

public class FormToBe implements Assignable
{
    private ExamText text = new ExamText();

    @Override
    public String getAssignment(int value, int n, String language) {
        if (language.equals("RU")) return text.getExamRuToBe().get(value + n);
        if (language.equals("EN")) return text.getExamEnToBe().get(value + n);
        return "No Files";
    }
}
