package company.dz8;
/**
 * //задание 26
 * // Создать список оценок учеников с помощью АррайЛист , заполниь случайными оценками.
 * // Удалить неудовлетворительные оценки из списка
 */
import java.util.ArrayList;

public class Task26 {

    public static void main(String[] args) {
        /**
         создаем и заполняем рамдомно лист
         */
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {

            list.add((int) (Math.random() * 10 + 1));
        }
        /**
         выводим на экран
         */
        list.forEach(System.out::print);
        System.out.println();
        /**
         * упращенная запись цикла forEach  и оператора if
         условие если число находящееся в коллекции меньше 4, удаляем его
         */
        list.removeIf(var -> var < 4);
        /**
         выводим на экран
         */
        list.forEach(System.out::print);
    }
}
