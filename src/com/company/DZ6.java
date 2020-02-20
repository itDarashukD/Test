package com.company;
//
//дано число, добавить слово рубль в правильном падеже
public class DZ6 {
    public static void main(String[] args) {
        int a = 200; //дано число
        int b = a % 10;
        if (a == 1) {
            System.out.println(a + "рубль");
        }
        if (2 <= a && a <= 4) {
            System.out.println(a + "рубля");
        }
        if (5 <= a && a <= 20) {
            System.out.println(a + "рублей");
        }
        if (b == 0) {
            System.out.println(a + "рублей");
        }
        if ((a > 20) && (b == 1)) {
            System.out.println(a + "рубль");
        }
        if ((a > 20) && (2 <= b && b <= 4)) {
            System.out.println(a + "рубля");
        }
        if ((a > 20) && (5 <= b && b <= 10)) {
            System.out.println(a + "рублей");
        }
    }
}
