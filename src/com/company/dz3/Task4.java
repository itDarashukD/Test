package com.company.dz3;

public class Task4 {
    public static void main(String[] args) {

/**
 * The type Task 4.создать двухмерный в виде бабочки
 */

/**
 * создаем массив
 */
        int f = 5, s = 5;//размер массива
        int mas[][] = new int[f][s];
/**
 * переменная отвечающая за позитции [2][1] и [3][2]
 */int r = 2;
        /**
         * заполняем массив
         */
        int j = 0, i = 0;
        for (i = 0; i < mas.length; i++) {
            for (j = 0; j < mas[i].length; j++) {/**
             * строки отвечающие за диагонал
             */
                mas[i][j] = 0;
                mas[i][i] = 1;
                mas[j][j] = 1;
                /**
                 * строки отвечающе за боковые треугольники
                 */
                mas[mas.length - 1 - j][j] = 1;
                mas[mas.length - f][j] = 1;
                mas[mas.length - 1][j] = 1;
                mas[i][r] = 1;
                /**
                 * выводм массыв на экран
                 */
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }

}

