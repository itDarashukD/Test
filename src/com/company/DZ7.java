package com.company;

import java.util.Scanner;

public class DZ7 {//
    // дана дата,необходимо вывести следующий день
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);

        System.out.println("Введите дату: число =");
        int chislo = vvod.nextInt();
        System.out.println("месяц =");
        int mes = vvod.nextInt();
        System.out.println("год =");
        int god = vvod.nextInt();

        if (mes == 1 && chislo == 31) {
            System.out.println("Дата следующего дня:1. " + (1 + mes) + ". " + god);
        }
        if (mes == 1 && (1 <= chislo && chislo <= 30)) {
            System.out.println("Дата следующего дня:" + (chislo + 1) + ". " + mes + ". " + god);
        }
        if (mes == 1 && chislo > 31) {
            System.out.println("Дата введена не верно");
        }

        if (mes == 2 && chislo == 28) {
            System.out.println("Дата следующего дня:1. " + (1 + mes) + ". " + god);
        }
        if (mes == 2 && (1 <= chislo && chislo <= 27)) {
            System.out.println("Дата следующего дня:" + (chislo + 1) + ". " + mes + ". " + god);
        }
        if (mes == 2 && chislo > 28) {
            System.out.println("Дата введена не верно");
        }

        if (mes == 3 && chislo == 31) {
            System.out.println("Дата следующего дня:1. " + (1 + mes) + ". " + god);
        }
        if (mes == 3 && (1 <= chislo && chislo <= 30)) {
            System.out.println("Дата следующего дня:" + (chislo + 1) + ". " + mes + ". " + god);
        }
        if (mes == 3 && chislo > 31) {
            System.out.println("Дата введена не верно");
        }

        if (mes == 4 && chislo == 30) {
            System.out.println("Дата следующего дня:1. " + (1 + mes) + ". " + god);
        }
        if (mes == 4 && (1 <= chislo && chislo <= 29)) {
            System.out.println("Дата следующего дня:" + (chislo + 1) + ". " + mes + ". " + god);
        }
        if (mes == 4 && chislo > 30) {
            System.out.println("Дата введена не верно");
        }

        if (mes == 5 && chislo == 31) {
            System.out.println("Дата следующего дня:1. " + (1 + mes) + ". " + god);
        }
        if (mes == 5 && (1 <= chislo && chislo <= 30)) {
            System.out.println("Дата следующего дня:" + (chislo + 1) + ". " + mes + ". " + god);
        }
        if (mes == 5 && chislo > 31) {
            System.out.println("Дата введена не верно");
        }

        if (mes == 6 && chislo == 30) {
            System.out.println("Дата следующего дня:1. " + (1 + mes) + ". " + god);
        }
        if (mes == 6 && (1 <= chislo && chislo <= 29)) {
            System.out.println("Дата следующего дня:" + (chislo + 1) + ". " + mes + ". " + god);
        }
        if (mes == 6 && chislo > 30) {
            System.out.println("Дата введена не верно");
        }

        if (mes == 7 && chislo == 31) {
            System.out.println("Дата следующего дня:1. " + (1 + mes) + ". " + god);
        }
        if (mes == 7 && (1 <= chislo && chislo <= 30)) {
            System.out.println("Дата следующего дня:" + (chislo + 1) + ". " + mes + ". " + god);
        }
        if (mes == 7 && chislo > 31) {
            System.out.println("Дата введена не верно");
        }

        if (mes == 8 && chislo == 31) {
            System.out.println("Дата следующего дня:1. " + (1 + mes) + ". " + god);
        }
        if (mes == 8 && (1 <= chislo && chislo <= 30)) {
            System.out.println("Дата следующего дня:" + (chislo + 1) + ". " + mes + ". " + god);
        }
        if (mes == 8 && chislo > 31) {
            System.out.println("Дата введена не верно");
        }

        if (mes == 9 && chislo == 30) {
            System.out.println("Дата следующего дня:1. " + (1 + mes) + ". " + god);
        }
        if (mes == 9 && (1 <= chislo && chislo <= 29)) {
            System.out.println("Дата следующего дня:" + (chislo + 1) + ". " + mes + ". " + god);
        }
        if (mes == 9 && chislo > 30) {
            System.out.println("Дата введена не верно");
        }

        if (mes == 10 && chislo == 31) {
            System.out.println("Дата следующего дня:1. " + (1 + mes) + ". " + god);
        }
        if (mes == 10 && (1 <= chislo && chislo <= 30)) {
            System.out.println("Дата следующего дня:" + (chislo + 1) + ". " + mes + ". " + god);
        }
        if (mes == 10 && chislo > 31) {
            System.out.println("Дата введена не верно");
        }

        if (mes == 11 && chislo == 30) {
            System.out.println("Дата следующего дня:1. " + (1 + mes) + ". " + god);
        }
        if (mes == 11 && (1 <= chislo && chislo <= 29)) {
            System.out.println("Дата следующего дня:" + (chislo + 1) + ". " + mes + ". " + god);
        }
        if (mes == 11 && chislo > 30) {
            System.out.println("Дата введена не верно");
        }

        if (mes == 12 && chislo == 31) {
            System.out.println("Дата следующего дня:1. 1. " + (god + 1));
        }
        if (mes == 12 && (1 <= chislo && chislo <= 30)) {
            System.out.println("Дата следующего дня:" + (chislo + 1) + ". " + mes + ". " + god);
        }
        if (mes == 12 && chislo > 31) {
            System.out.println("Дата введена не верно");
        }

    }
}
