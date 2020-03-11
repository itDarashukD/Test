package company.dz8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

//27 создать коллекцию, наполнить ее случайными числами.Удалить повторяющиеся числа
public class Task27 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add((int) (Math.random() * 9 + 1));
        }
        list.forEach(System.out::print);
        System.out.println();

        Collections.sort(list);
        list.forEach(System.out::print);

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                list.remove(i);
            }
        }
        System.out.println();
        list.forEach(System.out::print);
        for (int j = 0; j < list.size() - 1; j++) {
            if (list.get(j).equals(list.get(j + 1))) {
                list.remove(j);
            }
        }
        System.out.println();
        list.forEach(System.out::print);
    }
}
