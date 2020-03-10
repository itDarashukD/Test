package company.dz6;


//Создать иерархию классов,описывающих бытовую технику.Создать несколько объектов описанных классов,
// часть из них включить в розетку.Иерархия должна името хотябы три уровня
public class Appliances {
    /**
     * Методы включения/выключения в сеть
     */
    public void on() {
        System.out.println("Стиральная машина включена!");
    }

    public void off() {
        System.out.println("Cтиральная машина выключена!");
    }
    /**
     создание объектов и вызов методов ими
     */
    public static void main(String[] args) {
        Appliances appliances = new Appliances();
        WashingMachine washingMachine = new WashingMachine();
        WMAutomaton wmAutomaton = new WMAutomaton();
        WMWithSpin wmWithSpin = new WMWithSpin();
        wmWithSpin.on();
        appliances.off();

    }
}
