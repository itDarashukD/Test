package com.company.dz4;

import java.util.ArrayList;

/**
 * Вывести текс составленый из последних букв всех слов
 */
public class Task20 {
    public static void main(String[] args) {
        /**
         создаем   ArrayList
         */
        ArrayList<Character> list = new ArrayList<>();
        /**
         вводим в переменную text свое предложение
         */
        String text = "     Пожалуйста, не ломай мою задачу! ;   ";
        System.out.println(text);
        /**
         убираем пробелы до и после строки
         */
        String stringWithoutSpaces = text.trim();
        System.out.println(stringWithoutSpaces);
/**
 убираем все знаки припенания(на случай если строка записано с ошибками пунктуации,здесь неверно оставлена ";" )
 */
        String stringWithoutPunctuation
                = stringWithoutSpaces.replaceAll("[;:?!,.()]", "");
        System.out.println(stringWithoutPunctuation);
/**
 перебираем все символы строки, и если находи пробел, то символ перед пробелом заносим в   ArrayList)
 */
        int numbersWords = 0;
        char symbol;
        for (int i = 0; i < stringWithoutPunctuation.length(); i++) {
            symbol = stringWithoutPunctuation.charAt(i);
            if (symbol == ' ') {
                list.add(stringWithoutPunctuation.charAt(i - 1));
            }
        }
        /**
         выводим   ArrayList)
         */
        list.forEach(System.out::print);
    }
}



