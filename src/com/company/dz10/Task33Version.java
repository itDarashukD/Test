package company.dz10;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Task33Version {
    final static String path = ".idea";

    public static void main(String[] args) {
        File file = new File(path);

        fileName(file);
        catalogName(file);
    }

    public static void fileName(File file) {
        try {
            List<String> fileList = Files.walk(Paths.get(path)).filter(Files::isRegularFile)
                    .map(x -> x.toString()).collect(Collectors.toList());

            System.out.println("количество файлов : " + fileList.size()+"\n");
            fileList.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("ошибка считывания пути Файлов");
        }
    }

    public static void catalogName(File file) {
        try {
            List<String> catalogList = Files.walk(Paths.get(path)).filter(Files::isDirectory)
                    .map(x -> x.toString()).collect(Collectors.toList());

            System.out.println("Размер директории : " + catalogList.size()+"\n");
            catalogList.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("ошибка считывания пути Директории");
        }
    }
}

