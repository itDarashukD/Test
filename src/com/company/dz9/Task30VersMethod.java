package company.dz9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

/**
 * Прочитать файл с текстом, подсчитать количество знаков препинания и слов.
 */
public class Task30VersMethod {
    final static String path = "C:\\Users\\Дима\\IdeaProjects\\from GitHub 2\\TextFileNew.";

    public static void main(String[] args) {
        File file = new File(path);
        writeNewFile(file);
        start();
    }

    private static void start() {
        System.out.println("Наш текст: \n" + readFromFile());
        System.out.println("Количество слов в тексте: " + howMatсhWords(readFromFile()));
        System.out.println("Количество знаков препинания в тексте: " + howMatсhPunctuation(readFromFile()));
    }

    private static void writeNewFile(File file) {
        PrintWriter pw = null;

        try {
            pw = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            System.out.println("файл не найден");
        }
        pw.println("Это моя первая запись в файл!");
        pw.println("Это моя вторая запись в файл?");
        pw.println("Это моя 3 запись в файл;123123123");
        pw.println(3123131);
        pw.println("! или ? файл");
        pw.close();
    }

    private static String readFromFile() {
        List<String> lines = null;

        try {
            lines = Files.readAllLines(Paths.get(path));
        } catch (IOException e) {
            System.out.println("ошибка чтения из файла");
        }

        String s = "";
        for (String line : lines) {
            s = s.concat(line + " ");
        }
        return s;
    }

    private static long howMatсhWords(String s) {
        return Stream.of(s.trim().replaceAll("[^A-Za-zА-Яа-я]", " ").split("\\s+"))
                .filter(e -> !e.isEmpty()).count();
    }

    private static int howMatсhPunctuation(String s) {
        return (int) s.chars().filter(c -> !Character.isLetterOrDigit(c) && !Character.isSpaceChar(c)).count();
    }
}



