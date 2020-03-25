package company.dz9;

import java.io.*;
import java.util.ArrayList;
import java.util.OptionalDouble;
/**
 * Записать в двоичный файл 20 случайных чисел.Прочитать записанный файл, распечатать числа и их СА.
 */
public class Task_32 {

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        /**
         * Записываем в двоичный файл 20 случайных чисел
         */
        DataOutputStream a;
        try {
            a = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(
                    "C:\\Users\\Дима\\IdeaProjects\\from GitHub 2\\DV.dat")));
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            return;
        }
        for (int i = 1; i <= 20; i++) {
            a.writeInt((int) (Math.random() * 9));
        }

        a.close();
/**
 Читаем записанный файл
 */
        DataInputStream dataInputStream = null;
        try {
            dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(
                    "C:\\Users\\Дима\\IdeaProjects\\from GitHub 2\\DV.dat")));
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            return;
        }
        while (true) {
            try {
                int res = dataInputStream.readInt();
                System.out.print(res + " ");
/**
 заносим числа в Лист
 */
                list.add(res);
            } catch (EOFException e) {
                break;
            }
        }
        /**
        Выводим Лист
         */
        System.out.println();
        for (Integer var : list) {
            System.out.print(var);
        }
        System.out.println();
/**
 создаем из Листа Стрим и применяем метод СА
 */
        OptionalDouble list3 = list.stream().mapToInt(x -> x).average();
        System.out.print(list3);
    }
}