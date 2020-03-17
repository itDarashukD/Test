package company.dz8;

import java.util.ArrayList;
import java.util.Iterator;

public class Task_28 {
    public static void main(String[] args) {
        /**
         создаем и заполняем рамдомно лист
         */
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {

            list.add((int) (Math.random() * 9 + 1));
        }
        /**
         выводим на экран
         */
        list.forEach(System.out::print);
        System.out.println();
        int max = list.get(0);
        /**
         создаем Итератор
         */
        Iterator<Integer> iterator = list.iterator();
        max = list.get(0);
        while (iterator.hasNext()) {
            int s = iterator.next();
            /**
             находим максимум с ПОМОЩЬЮ ИТЕРАТОРА
             */
            if (list.get(s) > max) {
                max = list.get(s);
            }
        }
        System.out.print("максиамльная оценка в классе = " + max);
    }
}



