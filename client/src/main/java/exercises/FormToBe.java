package exercises;

import patterns.Assignable;
import texts.ExerciseTextPS;
import texts.ExerciseTextToBe;

public class FormToBe implements Assignable
{
    private ExerciseTextToBe text = new ExerciseTextToBe();

    @Override
    public String getAssignment(int value, int n, String language) {
        if (language.equals("RU")) return text.getRussia().get(value + n);
        if (language.equals("EN")) return text.getEnglish().get(value + n);
        return "No Files";
    }
}
