package com.company.dz3;

public class Task4Ready {
    /**
     * массив бабочкой 10*10
     */
           public static void main(String[] args) {
            /**
             создаем двухмерный массив
             */
            int mas[][] = new int[10][10];
            int i, j;
            /**
             заполняем, //mas.length / 2 + 1    - для заполнения половины массива,
             в данном случае верхней
             */
            for (i = 0; i < mas.length / 2 + 1; i++) {
                for (j = 0; j < mas[i].length; j++) {
                    /**
                     создаем условия благодаря которым заполняем верхнюю половину массива,везде где выполняютс уссловия
                     if заполняем 0-ми, остальным позитциям - 1-цы
                     */
                    if ((j < i) || (j >= (mas[i].length - i))) {
                        mas[i][j] = 0;
                    } else {
                        mas[i][j] = 1;
                    }
                }
            }
            /**
             заполняем,  i >= mas.length / 2; i--    - для заполнения половины массива,
             // в данном случае нижней
             */
            for (i = mas.length - 1; i >= mas.length / 2; i--) {
                for (j = 0; j < mas[i].length; j++) {
                    /**
                     mas[i].length - 1     -  чтобы не вылезти за пределы массива
                     (на подобии первой части) создаем условия благодаря которым заполняем нижнюю половину массива,
                     везде где выполняютс уссловия
                     if заполняем 0-ми, остальным позитциям - 1-цы
                     */
                    if ((j < (mas[i].length - 1 - i)) || (j > i)) {
                        mas[i][j] = 0;
                    } else {
                        mas[i][j] = 1;
                    }
                }
            }
            /**
             Выводим на экран
             */
            for (i = 0; i < mas.length; i++) {
                for (j = 0; j < mas[i].length; j++) {
                    System.out.print(mas[i][j]);
                }
                System.out.println(" ");
            }
        }
    }

