package com.company.dz2;

//определить,является-ли число простым
public class Zadacha3 {

    public static void main(String[] args) {
        int chislo = 102;
        if (chislo % 2 != 0 && chislo % 3 != 0 && chislo % 5 != 0 && chislo % 7 != 0 && chislo % 9 != 0) {
            System.out.println("да,это простое число");
        } else {
            System.out.println("Число не является простым");
        }
/**
 * Второй способ решения задачи
 *
 * @param args the input arguments
 */
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



