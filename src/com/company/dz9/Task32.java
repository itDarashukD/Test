package company.dz9;

import java.io.*;
import java.util.ArrayList;
import java.util.OptionalDouble;
/**
 * Записать в двоичный файл 20 случайных чисел.Прочитать записанный файл, распечатать числа и их СА.
 */
public class Task32 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        DataOutputStream dataOutputStream;

        try {
            dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(
                    "C:\\Users\\Дима\\IdeaProjects\\from GitHub 2\\DV.dat")));
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            return;
        }

        for (int i = 1; i <= 20; i++) {
            try {
                dataOutputStream.writeInt((int) (Math.random() * 9));
            } catch (IOException e) {
                System.out.println("Ошибка записи в файл");
            }
        }

        try {
            dataOutputStream.close();
        } catch (IOException e) {
            System.out.println("поток не закрыт");
        }

        DataInputStream dataInputStream ;
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
                list.add(res);
            } catch (EOFException e) {
                break;
            } catch (IOException e) {
                System.out.println("ошибка чтения из файла");
            }
        }

        try {
            dataInputStream.close();
        } catch (IOException e) {
            System.out.println("поток не закрыт");
        }

        System.out.println();
        for (Integer var : list) {
            System.out.print(var);
        }
        System.out.println();

        OptionalDouble list3 = list.stream().mapToInt(x -> x).average();
        System.out.print(list3);
    }
}