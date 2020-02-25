package com.company.dz4;

public class Task19 {
    /**
     * подсчитать количество слов в тексте
     */
    public static void main(String[] args) {
        String text = "     Подсчитать количество слов в тексте, со знаками припенания! ;   ";
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
 Считаем количество пробелов, в нашем случае оно будет равно количеству слов)
 */
        int numbersWords = 0;
        char symbol;
        for (int i = 0; i < stringWithoutPunctuation.length(); i++) {
            symbol = stringWithoutPunctuation.charAt(i);
            if (symbol == ' ') {
                numbersWords++;
            }
        }
        System.out.println(numbersWords);
    }
}
