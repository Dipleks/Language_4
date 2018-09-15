package patterns;


// Assignable - Назначаемый
public interface Assignable {

    // int value - номер с которого начется заполнение предложений
    // int n - общая нумерация в цикле при заполнении массива Label
    // String language - язык предложений
    String getAssignment(int value, int n, String language);
}
