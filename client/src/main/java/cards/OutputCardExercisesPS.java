package cards;

import exercises.ExerciseText;

public class OutputCardExercisesPS implements IOutputCard
{
    private ExerciseText exerciseText = new ExerciseText();

    @Override
    public String getCard(int value, String language) {
        if (language.equals("RU")) return exerciseText.getPsFileRu().get(value);
        if (language.equals("EN")) return exerciseText.getPsFileEn().get(value);
        return "No Files";
    }
}
