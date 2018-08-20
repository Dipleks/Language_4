package interfaceProgram;

public class EffectStyle
{
    public static String getStyleButtonDefault10(){
        return "-fx-color: #e6e6e6; -fx-font: bold italic 10pt Georgia; -fx-focus-color: GREEN;";
    }
    public static String getStyleButton10(){
        return "-fx-color: #fdd2a9; -fx-font: bold italic 10pt Georgia; -fx-focus-color: GREEN;";
    }
    public static String getStyleButtonDefault12(){
        return "-fx-color: #e6e6e6; -fx-font: bold italic 12pt Georgia; -fx-focus-color: GREEN;";
    }
    public static String getStyleButton12(){
        return "-fx-color: #fdd2a9; -fx-font: bold italic 12pt Georgia; -fx-focus-color: GREEN;";
    }
    public static String getStyleMouseReleased(){
        return "-fx-color: #e6e6e6; -fx-font: bold italic 12pt Georgia; " +
                "-fx-border-color: linear-gradient(#e6e6e6, #cccccc);";
    }
    public static String getStyleOnMousePressed(){
        return "-fx-color: #cccccc; -fx-font: bold italic 12pt Georgia; " +
                "-fx-border-color: linear-gradient(#cccccc, #b3b3b3);";
    }
    public static String getStyleLabel(){
        return "-fx-font: bold italic 14pt Georgia;";
    }
    public static String getStyleLabelColor(){
        return "-fx-font: bold italic 11pt Georgia;";
    }
}
