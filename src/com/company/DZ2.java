package com.company;
//
public class DZ2 {
// можно-ли закрыть квадратный проем картонным кругом?

        public static void main(String[] args) {

            int a = 3;
             int b = 5;
            int r = 1;


            if (2 * r >= Math.sqrt(a * a + b * b)) {
                System.out.println("можно закрыть");
            } else {
                System.out.println("не возможно закрыть");
            }

        }
    }

