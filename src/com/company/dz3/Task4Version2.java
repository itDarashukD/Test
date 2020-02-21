package com.company.dz3;

import java.util.Arrays;

public class Task4Version2 {
    public static void main(String[] args) {

/**
 * The type Task 4.создать двухмерный в виде бабочки
 */

/**
 * создаем массив
 */
        int i;
        int j;
        int mas[][] = {{1, 1, 1, 1, 1},
                {0, 1, 1, 1, 0},
                {0, 0, 1, 0, 0},
                {0, 1, 1, 1, 0},
                {1, 1, 1, 1, 1}};
        /**
         * выводим массив
         */
        for (i = 0; i < mas.length; i++) {
            for (j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }
}

