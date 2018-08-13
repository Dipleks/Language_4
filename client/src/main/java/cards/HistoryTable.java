package cards;

public class HistoryTable
{
    private String russia;
    private String english;

    public HistoryTable(String russia, String english) {
        this.russia = russia;
        this.english = english;
    }

    public String getRussia() {
        return russia;
    }

    public String getEnglish() {
        return english;
    }

    @Override
    public String toString() {
        return "HistoryTable{" +
                "russia='" + russia + '\'' +
                ", english='" + english + '\'' +
                '}';
    }
}
