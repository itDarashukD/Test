package company.dz9;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
/**
 Создать файл с текстом,прочитать, подсчитать количество ознаком препинания и слов
 */
public class Task_30_vers_method {
    public static void main(String[] args) throws IOException {
        /**
        Создаем объект класса Файл
         */
        File file = new File("C:\\Users\\Дима\\IdeaProjects\\from GitHub 2\\TextFileNew.");
        PrintWriter pw = new PrintWriter(file);

        writeNewFile(pw);

    }/**
   записываем в созданный файл текст
     */
    private static void writeNewFile(PrintWriter pw) throws IOException {

        pw.println("Это моя первая запись в файл!");
        pw.println("Это моя вторая запись в файл?");
        pw.println("Это моя 3 запись в файл;123123123");
        pw.println(3123131);
        pw.println("! или ? файл");
        pw.close();

        readFromFile();
    }
    /**Считываем из текста
     */
    private static void readFromFile() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\Дима\\IdeaProjects\\from GitHub 2\\TextFileNew."));
        String s = "";
        for (String line : lines) {
            System.out.println(line);
            s = s.concat(line + " ");
        }

        System.out.println(s);

        howMatсhWords(s);
    }
    /**Определяем количество слов
     */
    private static void howMatсhWords(String s) {
        int numbersWords = 0;
        for (String temp : s.trim().replaceAll("[;:?!,.()]", "").split(" ")) {
//            System.out.print(temp + " ");
            numbersWords++;
        }
        System.out.println();
        System.out.println("Количество слов = " + numbersWords);

        howMatсhPunctuation(s);
    }
    /**Определыем количество знаков препинания
     */
    private static void howMatсhPunctuation(String s) {

        int numerOfSimbols = 0;
        char symbol;
        for (int i = 0; i < s.length(); i++) {
            symbol = s.charAt(i);
            if ((symbol == ',') || (symbol == '.') || (symbol == '!') || (symbol == '?') || (symbol == '-')
                    || (symbol == ':') || (symbol == ';') || (symbol == '"')) {
                numerOfSimbols++;
            }
        }
        System.out.println("Количество символов в строке = " + numerOfSimbols);
    }
}



