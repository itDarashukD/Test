package company.dz4;

import java.util.Formatter;

/**
 21 я задача решение с использованием методов Класса и поля класса
 */
public class Task21Method2 {

    private static String text = "Работает при условии ввода знака препинания, из числа перечисленных!";

    public static String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public static void main(String[] args) {
        Formatter formatText = new Formatter();
        Task21Method2.print(getText());
        fotmatRegText(getText());
    }
    private static void fotmatRegText(String text) {
        String newFormatText = text.format("%S", text);
        System.out.print(newFormatText);
    }
    private static void print(String text) {
        System.out.println(text);
    }
}
