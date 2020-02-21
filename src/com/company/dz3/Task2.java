package com.company.dz3;

/**
 * The type Task 2.Сумма чисел между макс и мин элементами массива
 */

/**
 * создаем массив,заполняем рамдомно,выводм его
 */

public class Task2 {
    public static void main(String[] args) {
        int i;
        int mas[] = new int[10];
        for (i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 10);
            System.out.print(mas[i] + " ");
        }
int sum = 0;
        int indexMin = 0;
        int min = mas[0];
        int indexMax = 0;
        int max = mas[0];
        for (i = 0; i < mas.length; i++) {  /**
         * ищем максимальный элемент и его индекс
         */
            if (mas[i] > max) {
                max = mas[i];
                indexMax = i;
            }  /**
             * ищем минимальный элемент и его индекс
             */
            if (mas[i] < min) {
                min = mas[i];
                indexMin = i;
            }
        }  /**
         * условие если минимальный элемент идет раньше максимального
         */

        if (indexMin < indexMax) {
            for (i = indexMin + 1; i < indexMax; i++) {
                sum = sum + mas[i];
            }
        } /**
         * условие если максимальный элемент идет раньше минимального
         */
        if (indexMin > indexMax) {
            for (i = indexMax + 1; i < indexMin; i++) {
                sum = sum + mas[i];
            }
        }
        System.out.println();
        System.out.println("минимальный элемент массива = " + min);
        System.out.println("индекс минимального элемента массива = " + indexMin + " ");
        System.out.println();
        System.out.println("максимальный элемент массива = " + max);
        System.out.println("индекс максимального элемента массива = " + indexMax + " ");
        System.out.println();
        System.out.println("сумма элементов между ними = " + sum + " ");
    }
}

