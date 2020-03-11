package company.dz8;

import java.util.ArrayList;

//27 создать коллекцию, наполнить ее случайными числами.Удалить повторяющиеся числа
public class Task27_4 {
    /**
  создаем и заполняем рамдомно лист
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add((int) (Math.random() * 9 + 1));
        }
        list.forEach(System.out::print);
        System.out.println();
        /**
       определяем повторы и удаляем их
         */
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j--;
                }
            }
        }
        list.forEach(System.out::print);
    }
}
