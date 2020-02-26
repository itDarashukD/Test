package com.company.dz4;

public class Task19vers2 {
    public static void main(String[] args) {
        String text = "     Подсчитать количество слов в тексте, со знаками препинания! ;   ";
        System.out.println(text);
        /**
         убираем пробелы до и после строки
         */
        String stringWithoutSpaces = text.trim();
        System.out.println(stringWithoutSpaces);
/**
 убираем все знаки припенания(на случай если строка записано с ошибками пунктуации,здесь неверно оставлена ";" )
 */
        String stringWithoutPunctuation = stringWithoutSpaces.replaceAll("[;:?!,.()]", "");
        System.out.println(stringWithoutPunctuation);
/**
 воспользуемся функцией split()
 */int numbersWords = 0;
        for (String temp : stringWithoutPunctuation.split(" ")) {
            System.out.print(temp + "  ");
            numbersWords++;
        }
        System.out.println();
        System.out.println("Количество слов = " + numbersWords);
    }

}






