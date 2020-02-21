package com.company.dz3;

//сортировка пузырьком
public class Sorting {
    public static void main(String[] args) {
        int i;
        int j;
        /**
         * создаем массив и инициализируем его
         */
        int mas[] = {7, 5, 1, 8, 9, 3, 7, 4, 5, 3};
        for (i = mas.length - 1; i > 0; i--) {
            for (j = 0; j < i; j++) {
                /**
                 * меняем местами методом трех стаканов
                 */
                if (mas[j] > mas[j + 1]) {
                    int temp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = temp;
                }
            }
        }    /**
         * выводим на экран
         */
        for (i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}




