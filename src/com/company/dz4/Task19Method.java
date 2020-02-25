package com.company.dz4;

/**
 * подсчитать количество слов в тексте, задача с использованием методов
 */
public class Task19Method {

    public static void main(String[] args) {
        String text = "     Подсчитать количество слов в тексте, со знаками препинания! ;   ";
/** * просто выводит текст */
        Task19Method.printText(text);

/**
методы по удалению пробелов и пунктуации и нахождению количества слов
 */
        Task19Method.numbersWords(removePunctuation(removeSpaces(text)));
    }

    private static void numbersWords(String stringWithoutPunctuation) {
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

    private static String removePunctuation(String stringWithoutSpaces) {
        String stringWithoutPunctuation = stringWithoutSpaces.replaceAll("[;:?!,.()]", "");
        System.out.println(stringWithoutPunctuation);
        return stringWithoutPunctuation;
    }

    private static String removeSpaces(String text) {
        String stringWithoutSpaces = text.trim();
        System.out.println(stringWithoutSpaces);
        return stringWithoutSpaces;
    }

    private static void printText(String text) {
        System.out.println(text);
    }

}

