package company.dz8;
/**
 * //27 создать коллекцию, наполнить ее случайными числами.Удалить повторяющиеся числа
 */

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Task_27_anotherMethod2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            list.add((int) (Math.random() * 9 + 1));
        }
        list.forEach(System.out::print);
        System.out.println();
/**
 убираем повторы с помощью потоков?)
 */
        list = (ArrayList<Integer>) list.stream().distinct().collect(Collectors.toList());
        list.forEach(System.out::print);
    }
}



