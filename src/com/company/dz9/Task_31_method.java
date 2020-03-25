package company.dz9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Task_31_method {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        String s = "";

        readFromFile(s, list, sb);
    }
    private static void readFromFile(String s, ArrayList list, StringBuilder sb) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(
                "C:\\Users\\Дима\\IdeaProjects\\from GitHub 2\\Text+numbers.txt"));

        for (String line : lines) {
            s = s.concat(line + " ");
        }
        System.out.println(s);

        numbersFromText(s, list, sb);
    }
    private static void numbersFromText(String s, ArrayList list, StringBuilder sb) {
        for (int i = 0; i < s.length(); ) {
            if (Character.isDigit(s.charAt(i))) {
                // если текущий символ это цифра, то добавляем его в строку;
                // увеличиваем индекс и смотрим сразу следующий символ;
                // если будет не_цифра, то выйдем из текущего while
                //этот while позволяет собирать цифру вместе, а не по элементам (346!=3,4,6)
                while (Character.isDigit(s.charAt(i))) {
                    sb.append(s.charAt(i));
                    i++;
                    // защита от выхода счётчика i за пределы длины строки,
                    // если последний символ в тексте - это цифра
                    if (i == s.length())
                        break;
                } // выходим из while, имея группу цифр в объекте sb

                list.add(Integer.parseInt(sb.toString())); // парсинг sb в число и заполнение ими листа

                sb.delete(0, sb.length()); // очистка sb для повторного использования

            } else {
                // если текущий символ - это не_цифра,просто переходим к следующему
                i++;
            }
        }
        System.out.println();

        soutAndSum(list);
    }
    private static void soutAndSum(ArrayList<Integer> list) {
        /**
         С помощью стримов распечатываем и вычисляем сумму
         */
        int soutAndSum = list.stream().peek(x -> System.out.print(x + " ")).mapToInt(x -> x).sum();
        System.out.println(soutAndSum);
        System.out.println();

        distrAndSout(list);
    }
    private static void distrAndSout(ArrayList<Integer> list) {
        /**
         С помощью стримов убираем повторы и распечатываем
         */
        Stream<Integer> stream = list.stream().distinct();
        stream.forEach(System.out::print);
    }
}


