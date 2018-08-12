package exercises;

public class FormToBe implements Assignable
{
    private ExerciseText text = new ExerciseText();

    @Override
    public String getAssignment(int value, int n, String language) {
        if (language.equals("RU")) return text.getToBeFileRu().get(value + n);
        if (language.equals("EN")) return text.getToBeFileEn().get(value + n);
        return "No Files";
    }
}
