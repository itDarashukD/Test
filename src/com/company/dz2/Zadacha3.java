package com.company.dz2;

//определить,является-ли число простым
public class Zadacha3 {

    public static void main(String[] args) {
     int chislo=4213529;
        int i;
        for (i = 2; i < chislo; i++) {
            if (chislo % i == 0) {
                System.out.println("Число не является простым");
                return;
            }
        }
        System.out.println("да,это простое число");
    }
}



