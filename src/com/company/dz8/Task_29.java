package company.dz8;

import java.util.HashMap;

/**
 * //Имеется текс , следует составить для него частотный словарь
 */
public class Task_29 {

    public static void main(String[] args) {
        /**
         Создайте строку
         */
        String string = "мама мама мыла раму 111 111 43434 ? ,.  ";
        /**
         Убираем из строки все лишние символы и делим строку на отдельные слова, и загоняем в массив
         */
        String[] words = string.replaceAll("[1234567890;:?!,.()/]", "").split("\\s+");
        /**
         Выводи полученный массив на экран
         */
        for (String word : words) {
            System.out.println(word);
        }
        /**
         Создаем Мар и заполняем ее значениями из массива
         */
        HashMap<String, Integer> wordToCount = new HashMap<>();
        for (String word : words) {   /**
         если такого слова нет в Мар, то добавляем его как ключ,и присваиваем ему значение 0
         */
            if (!wordToCount.containsKey(word)) {
                wordToCount.put(word, 0);
            } /**
             если такое слово есть в Мар, то добавляем его как ключ,и присваиваем ему значение +1
             */
            wordToCount.put(word, wordToCount.get(word) + 1);
        }
        /**
         выводим Мар
         */
        wordToCount.forEach((key, value) -> System.out.println(key + " - " + value));
    }
}



