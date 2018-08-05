package exercises;

public class FormPS implements Assignable
{
    private ExerciseText text = new ExerciseText();

    @Override
    public String getAssignment(int value, int n, String language) {
        if (language.equals("RU")) return text.getPsFileRu().get(value + n);
        if (language.equals("EN")) return text.getPsFileEn().get(value + n);
        return "No Files";
    }
}
