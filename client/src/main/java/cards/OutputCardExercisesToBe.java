package cards;

import exercises.ExerciseText;

public class OutputCardExercisesToBe implements IOutputCard
{
    private ExerciseText exerciseText = new ExerciseText();

    @Override
    public String getCard(int value, String language) {
        if (language.equals("RU")) return exerciseText.getToBeFileRu().get(value);
        if (language.equals("EN")) return exerciseText.getToBeFileEn().get(value);
        return "No Files";
    }
}
