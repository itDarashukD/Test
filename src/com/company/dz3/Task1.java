package com.company.dz3;

/**
 * The type Task 1.вывести номер максимальной оценки
 */

/**
 * создаем массив,заполняем рамдомно,выводм его
 */

public class Task1 {
    public static void main(String[] args) {
        int i;
        int mas[] = new int[10];
        for (i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 10);
            System.out.print(mas[i] + " ");
        }
/**
 * ищем макс элемент и его индекс
 */
        int indexMax = 0;
        int max = 0;
        for (i = 0; i < mas.length; i++) {
            if (mas[i] > max) { //поиск максимального числа в массиве
                max = mas[i];
                indexMax = i;
            }
        }
        System.out.println();
        System.out.println("максимальный элемент массива = " + max);
        System.out.println("индекс максимального элемента массива = " + indexMax + " ");
    }
}
