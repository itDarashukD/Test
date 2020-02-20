package com.company.avtomobile;
// есть 2 авто бус и гольф, даны имена, размер бака и расход на 100км, вычислить кто сможет проехать большее расстояние
// при заправке полного бака.Кто из них старше.

public class BusVsGolf {
    private static int raznica;

    public static void main(String[] args) {


        Bus bus = new Bus("Тэчик", 85, 100, 1995);
        Golf golf = new Golf("Гольфик", 70, 7, 1992);

        golf.vuchislenie(golf);
        bus.vuchislenie(bus);

        boolean result = golf.sravnenie(golf, bus);
        if (result) {
            System.out.println(golf.getName() + " проедет дальше");
        } else {
            System.out.println(bus.getName() + " проедет дальше");
        }

        golf.vuchislenieVozrasta(golf);
        bus.vuchislenieVozrasta(bus);

        boolean resultOld = golf.sravnenieVozrasta(golf, bus);
        if (resultOld) {
            System.out.println(golf.getName() + " старше");
        } else {
            System.out.println(bus.getName() + " старше");
        }
        int  vuchislVozvrasta = BusVsGolf.vuchisl(golf, bus);
        System.out.println(vuchislVozvrasta+"  - это их разница в возрасте");


    }

    private static int vuchisl(Golf first,Bus second) {return raznica = second.getGodVupuska()-first.getGgodVupuska();


    }

}

