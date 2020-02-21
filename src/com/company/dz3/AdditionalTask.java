package com.company.dz3;

/**
 * The type AdditionalTask создать строку, перевернуть,вывести
 */

/**
 * создаем строку
 */
public class AdditionalTask {
    public static void main(String[] args) {
        String s = "Мама мыла раму";
        System.out.println(s);
        int i;
        /**
         * переводим ее в массив
         */
        char mas[] = s.toCharArray();
        for (i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        /**
         * распечатываем массив наоборот и превращаем его обратно в строку
         */
        System.out.println();
        String result = "";

        for (i = mas.length - 1; i >= 0; i--) {
            System.out.print(mas[i] + " ");
            result += Character.toString(mas[i]);
        }
        System.out.println();
        System.out.println(result);
    }
}
