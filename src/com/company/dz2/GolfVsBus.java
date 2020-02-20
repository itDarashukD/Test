package com.company.dz2;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;
import java.text.*;

/**
 * The type Golf vs bus.
 */
// сравнить авто
//вычислить сколько она может проехать, у нее не должно быть пути, а должен быть метод который может посчитать этот
// путь по расходу, метод должен принимать значение бенз и должно быть ограничение по баку
//ввести возраст при инициализации конструктора,
//метод в который void он берет тот год чтоты ввел при создании и дату на момент использвания метода
// (забываем про стринги и начинаем юзать джавовские даты покурить что это и как юзать )
public class GolfVsBus {

    public static void main(String[] args) {
        /**
         * создаем объекты гольф и бус
         *
         * @param args the input arguments
         */
        Auto golf = new Auto("19.05.1992", 60, 7, "Гольфик");
        Auto bus = new Auto("12.10.1995", 85, 10, "Бусик");
        /**
         * создаем методы рассчета расстояний при полностью заправленом баке, с учетом расхода
         *
         * @param args the input arguments
         */
        int rasstojanieGolf = golf.put(golf);
        System.out.println(golf.getName() + " на полном баке пройдет расстояние " + rasstojanieGolf + " киллометров");

        int rasstojanieBus = bus.put(bus);
        System.out.println(bus.getName() + " на полном баке пройдет расстояние " + rasstojanieBus + " киллометров");
        /**
         * создаем методы расчета возраста машин
         *
         * @param args the input arguments
         */
        String oldGolf = golf.old(golf);
        String oldBus = bus.old(bus);


        //Integer a = Integer.parseInt(String.valueOf(year));
      //  Integer b = Integer.parseInt(String.valueOf(oldBus));
       // System.out.println(a+" "+b);

    }
}











