package menu;

import exams.Exams;
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

public class MenuBarEngRus implements RootWindows
{
    private final MenuBar menuBar = new MenuBar();

    private SeparatorMenuItem separatorMenuItem = new SeparatorMenuItem();

    private final Menu menuFile = new Menu("Изучить");
    private final Menu menuE = new Menu("В разработке");
    private final Menu menuTexts = new Menu("В разработке");
    private final Menu menuCards = new Menu("Карточки");
    private final MenuItem menuExercises = new MenuItem("Задания");
    private final MenuItem menu_my_words = new MenuItem("Мой словарь");
    private final MenuItem examPS = new MenuItem("2");
    private final MenuItem menuExam = new MenuItem("Контрольные");
    private final MenuItem examToBe = new MenuItem("1");
    private final MenuItem textsLevelOne = new MenuItem("Легкий");
    private final MenuItem textsLevelTwo = new MenuItem("Средний");
    private final MenuItem textsLevelThree = new MenuItem("Сложный");
    private final MenuItem cardsWords = new MenuItem("Слова");
    private final MenuItem cardsPhrases = new MenuItem("Фразы");
    private final MenuItem cardsOffers = new MenuItem("Предложения");

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
        getExamPS();
        getAbout();
        getMenuToBe();
        getExamToBe();
        getTextsLevelOne();
        getMenuServes();

        menuHelp.setDisable(true);
        cardsWords.setDisable(true);
        cardsPhrases.setDisable(true);
        cardsOffers.setDisable(true);
        textsLevelTwo.setDisable(true);
        textsLevelThree.setDisable(true);

        menuBar.setMinWidth(WIDTH_SIZE);
        menuTexts.getItems().addAll(textsLevelOne, textsLevelTwo, textsLevelThree);
        menuServes.getItems().addAll(menuSetting, about);
        menuFile.getItems().addAll(menuExercises, menuExam, separatorMenuItem, menu_my_words);
        menuE.getItems().addAll(examPS, examToBe);
        menuCards.getItems().addAll(cardsWords, cardsPhrases, cardsOffers);
        menuBar.getMenus().addAll(menuFile, menuE, menuTexts, menuCards, menuHelp, menuServes);

        return menuBar;
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
    private void getMenuPS(){
        menuExercises.setOnAction(event -> {
            ClearDisplay.clearMethod();
            MenuBarEngRus menuBarEngRus = new MenuBarEngRus();
            menuBarEngRus.getMenu();
            exercises.Exercises addExerciseExam = new exercises.Exercises();
            addExerciseExam.getExercises();
        });
    }
    private void getExamPS(){
        examPS.setOnAction(event -> {
            ClearDisplay.clearMethod();
            MenuBarEngRus menuBarEngRus = new MenuBarEngRus();
            menuBarEngRus.getMenu();
//            AddExerciseExam addExerciseExam = new AddExerciseExam();
//            addExerciseExam.AddMenuButtonExamPS();
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
            label.setText("Автор программы Ghost \n" + "\n" + "Программа предназначена " +
                    "\nдля изучения Английского языка." +
                    "\n\n                                    Версия программы: 2.2.3");
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
    private void getExamToBe(){
        examToBe.setOnAction(event -> {
            ClearDisplay.clearMethod();
            MenuBarEngRus menuBarEngRus = new MenuBarEngRus();
            menuBarEngRus.getMenu();
//            AddExerciseExam addExerciseExam = new AddExerciseExam();
//            addExerciseExam.AddMenuButtonExamToBe();
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
