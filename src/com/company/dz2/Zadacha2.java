package com.company.dz2;
//Имеется целое число ,подсчитать сумму чисел данного числа
public class Zadacha2 {
    public static void main(String[] args) {

        int chislo = 1452619;
        int a =chislo;
        int b = 0;
        while (a != 0 ){
            b =a%10+b;
            a =a/10;
        }
        System.out.println("Сумма цифр в числе " + chislo + " = " + b);
    }


}

