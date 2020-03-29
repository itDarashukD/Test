package company.dz9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Task31WP {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        readFromFile(list, sb);
        Start(list, sb);
    }

    private static void Start(ArrayList list, StringBuilder sb) {
        System.out.println("Наша начальная строка: \n" + readFromFile(list, sb));
        System.out.println("Наша чистая строка из цифр: \n" + numbersFromText(readFromFile(list, sb), sb, list));
        System.out.println("Сумма:\n " + soutAndSum(numbersFromText(readFromFile(list, sb), sb, list)));
        System.out.println("Убрали повторы и распечатали: ");
        distrAndSout(numbersFromText(readFromFile(list, sb), sb, list));
    }

    private static String readFromFile(ArrayList list, StringBuilder sb) {
        String s = " ";
        String stringResult = " ";
        List<String> lines = null;
        try {
            lines = Files.readAllLines(Paths.get(
                    "C:\\Users\\Дима\\IdeaProjects\\from GitHub 2\\Text+numbers.txt"));
        } catch (IOException e) {
            System.out.println("Ошибка вввода - вывода");
        }

        for (String line : lines) {
            stringResult = s.concat(line + " ");
        }

        return stringResult;
    }

    private static ArrayList numbersFromText(String stringResult, StringBuilder sb, ArrayList list) {
        for (int i = 0; i < stringResult.length(); ) {
            if (Character.isDigit(stringResult.charAt(i))) {// если текущий символ это цифра, то добавляем его в строку;
                // увеличиваем индекс и смотрим сразу следующий символ;
                while (Character.isDigit(stringResult.charAt(i))) { // если будет не_цифра, то выйдем из текущего while,
                    // этот while позволяет собирать цифру вместе, а не по элементам (346!=3,4,6)
                    sb.append(stringResult.charAt(i));
                    i++;
                    // защита от выхода счётчика i за пределы длины строки,если последний символ в тексте - это цифра
                    if (i == stringResult.length())
                        break;
                } // выходим из while, имея группу цифр в объекте sb

                list.add(Integer.parseInt(sb.toString())); // парсинг sb в число и заполнение ими листа

                sb.delete(0, sb.length()); // очистка sb для повторного использования

            } else {// если текущий символ - это не_цифра,просто переходим к следующему
                i++;
            }
        }
        return list;

    }

    private static int soutAndSum(ArrayList<Integer> list) {
        return list.stream().mapToInt(x -> x).sum();
    }

    private static void distrAndSout(ArrayList<Integer> list) {
        Stream<Integer> stream = list.stream().distinct();
        stream.forEach(System.out::print);
    }
}





