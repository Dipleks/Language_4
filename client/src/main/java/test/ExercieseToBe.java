package test;

public class ExercieseToBe implements IExercises
{
    private ExerciseText text = new ExerciseText();

    @Override
    public String methodExercise(int a, int b, String lang) {
        if (lang.equals("EN")) {
            return text.getToBeFileEn().get(a + b);
        } else if (lang.equals("RU")) {
            return text.getToBeFileRu().get(a + b);
        }
        return "No files";
    }

    @Override
    public void clearExercise() {

    }
}
