package com.company.dz4;
/**
 * Привести все символы строки к верхнему регистру, без использования ApperCase
 */

import java.util.Formatter;

public class Task21 {
    /**
     * Повысить регистр без apperCase
     */
    public static void main(String[] args) {
        /**
         Создаем объект класса  Formatter
         */
        Formatter formatText = new Formatter(); // объявление объекта

        String text = "Работает при условии ввода знака препинания, из числа перечисленных!";

        System.out.println(text);
        /**
         Повышаем регистр, спомощью метода format
         */
        formatText.format("%S", text);

        System.out.print(formatText);
    }
}
