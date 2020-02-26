package com.company.dz4;
/**
 * Вывести текст составленый из последних букв всех слов
 */
import java.util.ArrayList;
public class Task20methodVers {
    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>();
        String text = "     Пожалуйста, не ломай мою задачу! ;   ";

       printText(text);
        deleteSpaces(text);
        deletePunctuation(text.trim());
        reseach(text.trim().replaceAll("[;:?!,.()]", ""),list);

    }

    private static void reseach(String stringWithoutPunctuation,ArrayList list) {
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


    private static String deletePunctuation(String stringWithoutSpaces) {
        String stringWithoutPunctuation = stringWithoutSpaces.replaceAll("[;:?!,.()]", "");
        System.out.println(stringWithoutPunctuation);
        return stringWithoutSpaces.replaceAll("[;:?!,.()]", "");
    }

    private static String deleteSpaces(String text) {
        String stringWithoutSpaces = text.trim();
        System.out.println(stringWithoutSpaces);
        return text.trim();
    }

    private static void printText(String text) {
        System.out.println(text);
    }


}
