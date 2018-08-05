package exercises;

public class FormToBe implements Assignable
{
    private ExerciseText text = new ExerciseText();

    @Override
    public String getAssignment(int value, int n, String language) {
        if (language.equals("RU")) text.getToBeFileRu().get(value + n);
        if (language.equals("EN")) text.getToBeFileEn().get(value + n);
        return "No Files";
    }
}
