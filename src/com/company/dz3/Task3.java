package com.company.dz3;

import java.util.Collection;

/**
 * The type Task 3.создать рамдомно и вывести,перевернуть и вывести
 */

/**
 * создаем массив,заполняем рамдомно,выводм его
 */
public class Task3 {
    public static void main(String[] args) {
        int i;
        int mas[] = new int[10];
        for (i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 10);
            System.out.print(mas[i] + " ");
        }/**
         * переворачиваем,выводм его
         */
        System.out.println();
        for (i =  mas.length-1; i >=0; i--) {
            System.out.print(mas[i] + " ");}
    }
}
