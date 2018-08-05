package test;

public class ExercisesPS implements IExercises
{
    private ExerciseText text = new ExerciseText();

    @Override
    public String methodExercise(int a, int b, String lang) {
        if (lang.equals("EN")) {
            return text.getPsFileEn().get(a + b);
        } else if (lang.equals("RU")) {
            return text.getPsFileRu().get(a + b);
        }
        return "No files";
    }

    @Override
    public void clearExercise() {

    }
}
