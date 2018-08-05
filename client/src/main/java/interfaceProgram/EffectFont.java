package interfaceProgram;

import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class EffectFont implements RootWindows
{
    public static Font getFontText() {
        Font fontText = Font.font("Time New Roman", FontWeight.BOLD,
                FontPosture.ITALIC, HEIGHT_SIZE * 0.020);
        return fontText;
    }

    public static Font getFontTextUpDate() {
        Font fontText = Font.font("Time New Roman",
                FontPosture.ITALIC, HEIGHT_SIZE * 0.015);
        return fontText;
    }

    public static Font getFontTextExam() {
        Font fontTextExam = Font.font("Time New Roman", FontWeight.BOLD,
                FontPosture.ITALIC, HEIGHT_SIZE * 0.018);
        return fontTextExam;
    }

    public static Font getFontTextLevel() {
        Font fontTextLevel = Font.font("Time New Roman",
                FontPosture.ITALIC, HEIGHT_SIZE * 0.018);
        return fontTextLevel;
    }

    public static Font getFontTitle() {
        Font fontTitle = Font.font("Time New Roman", FontWeight.BOLD,
                FontPosture.ITALIC, HEIGHT_SIZE * 0.018);
        return fontTitle;
    }

    public static Font getFontTITLE() {
        Font fontText = Font.font("Time New Roman", FontWeight.BOLD,
                FontPosture.ITALIC, HEIGHT_SIZE * 0.020);
        return fontText;
    }
}
