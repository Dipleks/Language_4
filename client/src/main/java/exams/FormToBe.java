package exams;

import patterns.Assignable;
import texts.ExamTextPS;
import texts.ExamTextToBe;

/**
 * Класс с текстом Контрольных.
 * Имеет свойство: <b>text</b>
 * @author Загороднев Д.М.
 */
public class FormToBe implements Assignable {

    /** Объект хранящий список с заданиями контрольных работ */
    private ExamTextToBe text = new ExamTextToBe();

    /**
     * Функция получения заданий для контрольных.
     * @param value порядковый номер задания;
     * @param n число здвига <b>value</b>;
     * @param language язык задния;
     * @return возврат задания или стандартного значения в случае ошибки получения текста задания.
     */
    @Override
    public String getAssignment(int value, int n, String language) {

        if (language.equals("RU")) return text.getRussia().get(value + n);
        if (language.equals("EN")) return text.getEnglish().get(value + n);
        return "No Files";
    }
}