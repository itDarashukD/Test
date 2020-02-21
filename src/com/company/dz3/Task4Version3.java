package com.company.dz3;

public class Task4Version3 {
    public static void main(String[] args) {
/**
 * создаем массив
 */
        int i;
        int j;
        int mas1[][] = new int[5][5];
        for (i = 0; i < mas1.length; i++) {
            for (j = 0; j < mas1[i].length; j++) {/**
             * замолняем весь 1
             */
                mas1[i][j] = 1;
                /**
                 * заполняем некоторые поля 0
                 */
            }
            mas1[1][0] = 0;
            mas1[2][0] = 0;
            mas1[3][0] = 0;
            mas1[2][1] = 0;
            mas1[1][4] = 0;
            mas1[2][4] = 0;
            mas1[3][4] = 0;
            mas1[2][3] = 0;
        } /**
         * выводим массив
         */
        for (i = 0; i < mas1.length; i++) {
            for (j = 0; j < mas1[i].length; j++) {
                System.out.print(mas1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
