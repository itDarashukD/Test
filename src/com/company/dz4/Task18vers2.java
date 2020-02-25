package com.company.dz4;

public class Task18vers2 {
    /**
     * Количество знаков препинания в предложении
     */
    public static void main(String[] args) {
        String text = "Утро было морозным, шел пар изорта. Вот здорово! Неужели? Ну,смотри : - 1.  2.   3.";

        int numerOfSimbols = 0;
        char symbol;
        for (int i = 0; i < text.length(); i++) {
            symbol = text.charAt(i);
            if ((symbol == ',') || (symbol == '.') || (symbol == '!') || (symbol == '?') || (symbol == '-')
                    || (symbol == ':')|| (symbol == ';') || (symbol == '"')) {
                numerOfSimbols++;
            }
        }
        System.out.println(numerOfSimbols);

    }
}