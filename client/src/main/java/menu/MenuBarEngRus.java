package menu;

import cards.Cards;
import db.IDataBase;
import exams.Exams;
import favourites.Favourites;
import hear.HearTraining;
import interfaceProgram.RootWindows;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Modality;
import javafx.stage.Stage;
import testing.Testing;
import words.Words;

import java.sql.*;

public class MenuBarEngRus implements RootWindows, IDataBase {

    private final MenuBar menuBar = new MenuBar();

    private SeparatorMenuItem separatorMenuItem = new SeparatorMenuItem();

    private final Menu menuFile = new Menu("Уроки");
    private final Menu menuCheck = new Menu("Проверка");
    private final MenuItem menuExercises = new MenuItem("Задания");
    private final MenuItem menuCards = new MenuItem("Карточки");
    private final MenuItem menuTesting = new MenuItem("Test of time");
    private final MenuItem hear = new MenuItem("Hearing training");
    private final MenuItem menu_my_words = new MenuItem("Мой словарь");
    private final MenuItem favourites = new MenuItem("Избранное");
    private final MenuItem menuExam = new MenuItem("Контрольные");
    private final MenuItem menuWord = new MenuItem("Слова");
    private final MenuItem textsLevelOne = new MenuItem("Легкий");
    private final MenuItem textsLevelTwo = new MenuItem("Средний");
    private final MenuItem textsLevelThree = new MenuItem("Сложный");

    private final Menu menuHelp = new Menu("Подсказки");

    private final Menu menuServes = new Menu("Сервис");
    private final MenuItem menuSetting = new MenuItem("Настройки");
    private final MenuItem about = new MenuItem("О программе");

    public void getMenu() {
        ROOT_PANE.getChildren().addAll(getMenuBar());
    }

    private MenuBar getMenuBar() {

        getMenuPS();
        getMenu_my_words();
        getAbout();
        getMenuToBe();
        getTextsLevelOne();
        getMenuServes();
        getMenuCards();
        getMenuWord();
        getMenuTesting();
        getMenuHear();
        getFavourites();

        menuHelp.setDisable(true);
        textsLevelTwo.setDisable(true);
        textsLevelThree.setDisable(true);
        menu_my_words.setDisable(true);
        menuSetting.setDisable(true);
//        menuCheck.setDisable(true);
        menuTesting.setDisable(true);
        hear.setDisable(true);
//        favourites.setDisable(true);

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e){
            System.out.println("не удалось найти драйвер");
            e.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection(DB_URL + db, USER, PASS))
        {
            menuCheck.setDisable(false);
        } catch (SQLException e){
            System.out.println("БД отключена");
        }

        menuBar.setMinWidth(WIDTH_SIZE);
        menuServes.getItems().addAll(menuSetting, about);
        menuFile.getItems().addAll(menuExercises, menuExam, menuWord, separatorMenuItem, favourites, menu_my_words);
        menuCheck.getItems().addAll(menuCards, menuTesting, hear);
        menuBar.getMenus().addAll(menuFile, menuCheck, menuHelp, menuServes);

        return menuBar;
    }
    private void getMenuCards(){
        menuCards.setOnAction(event -> {
            ClearDisplay.clearMethod();
            MenuBarEngRus menuBarEngRus = new MenuBarEngRus();
            menuBarEngRus.getMenu();
            Cards cards = new Cards();
            cards.getCards();
        });
    }

    private void getMenuTesting(){
        menuTesting.setOnAction(event -> {
            ClearDisplay.clearMethod();
            MenuBarEngRus menuBarEngRus = new MenuBarEngRus();
            menuBarEngRus.getMenu();
            Testing testing = new Testing();
            testing.getTesting();
        });
    }

    private void getMenuHear(){
        hear.setOnAction(event -> {
            ClearDisplay.clearMethod();
            MenuBarEngRus menuBarEngRus = new MenuBarEngRus();
            menuBarEngRus.getMenu();
            HearTraining hearTraining = new HearTraining();
            hearTraining.sound();
        });
    }

    private void getMenuWord(){
        menuWord.setOnAction(event -> {
            ClearDisplay.clearMethod();
            MenuBarEngRus menuBarEngRus = new MenuBarEngRus();
            menuBarEngRus.getMenu();
            Words words = new Words();
            words.getWords();
        });
    }

    private void getMenuServes(){
        menuSetting.setOnAction(event -> {
            ClearDisplay.clearMethod();
            MenuBarEngRus menuBarEngRus = new MenuBarEngRus();
            menuBarEngRus.getMenu();
//            Settings setting = new Settings();
//            setting.getSetting();
        });
    }

    private void getMenu_my_words() {

//        if (CreateDB.checkConnection()) {
            menu_my_words.setOnAction(event -> {
                ClearDisplay.clearMethod();
                MenuBarEngRus menuBarEngRus = new MenuBarEngRus();
                menuBarEngRus.getMenu();
//                MyWords fillingColumns = new MyWords();
//                fillingColumns.getMyWordsList();
            });
//        } else {
//            menu_my_words.setVisible(false);
//        }
    }

    private void getFavourites(){
        favourites.setOnAction(event -> {
            ClearDisplay.clearMethod();
            MenuBarEngRus menuBarEngRus = new MenuBarEngRus();
            menuBarEngRus.getMenu();
            Favourites favourites = new Favourites();
            favourites.getFavourites();
        });
    }

    private void getMenuPS(){
        menuExercises.setOnAction(event -> {
            ClearDisplay.clearMethod();
            MenuBarEngRus menuBarEngRus = new MenuBarEngRus();
            menuBarEngRus.getMenu();
            exercises.Exercises addExerciseExam = new exercises.Exercises();
            addExerciseExam.getExercises();
        });
    }
    private void getAbout(){
        about.setOnAction(event -> {
            Stage window = new Stage();
            StackPane stackPane = new StackPane();
            Scene scene = new Scene(stackPane, WIDTH_SIZE/3, HEIGHT_SIZE/3);
            Label label = new Label();
//                TITLE.setStyle("-fx-border-color: RED");
            label.setPrefSize(WIDTH_SIZE/4, HEIGHT_SIZE/4);
            label.setText("Автор программы Ghost \nАвтор заданий Александр Бебрис \n" + "\n" + "Программа предназначена " +
                    "\nдля изучения Английского языка.\n\nПрограмма находится в разработке." +
                    "\n\n                                    Версия программы: 3.1.5");
            label.setFont(Font.font("Time New Roman", FontWeight.BOLD,
                    FontPosture.ITALIC, HEIGHT_SIZE*0.015));
            label.setAlignment(Pos.CENTER);

            stackPane.getChildren().addAll(label);

            window.setScene(scene);
            window.setTitle("О программе");
            window.initModality(Modality.APPLICATION_MODAL);
            window.show();
        });
    }
    private void getMenuToBe(){
        menuExam.setOnAction(event -> {
            ClearDisplay.clearMethod();
            MenuBarEngRus menuBarEngRus = new MenuBarEngRus();
            menuBarEngRus.getMenu();
            Exams exams = new Exams();
            exams.getExams();
        });
    }
    private void getTextsLevelOne(){
        textsLevelOne.setOnAction(event -> {
            ClearDisplay.clearMethod();
            MenuBarEngRus menuBarEngRus = new MenuBarEngRus();
            menuBarEngRus.getMenu();
//            TextsParts textsParts = new TextsParts();
//            textsParts.getMenuButtonTexts();
        });
    }
}
