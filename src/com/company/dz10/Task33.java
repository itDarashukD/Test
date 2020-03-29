package company.dz10;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

//Вывести список файлов и каталогов выбранного каталога на диске.
public class Task33 {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\Дима\\бизнес\\IT");

            System.out.println("Список моих файлов: " + fileName(file));
            System.out.println("Список моих каталогов: " + catalogName(file));
        } catch (Exception e) {
            System.out.println("файл не найден");
        }
    }

    public static List<String> fileName(File file) {
        return Arrays.stream(Objects.requireNonNull(file.listFiles())).
                filter(File::isFile).map(File::getName).collect(Collectors.toList());
    }

    public static List<String> catalogName(File file) {
        return Arrays.stream(Objects.requireNonNull(file.listFiles())).
                filter(File::isDirectory).map(File::getName).collect(Collectors.toList());
    }
}



