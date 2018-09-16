package favourites;

public class TableFavouritesColumn {

    private String english;
    private String russian;

    public TableFavouritesColumn(String english, String russian) {
        this.english = english;
        this.russian = russian;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getRussian() {
        return russian;
    }

    public void setRussian(String russian) {
        this.russian = russian;
    }

    @Override
    public String toString() {
        return "TableFavouritesColumn{" +
                "english='" + english + '\'' +
                ", russian='" + russian + '\'' +
                '}';
    }
}
