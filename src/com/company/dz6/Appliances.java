package company.dz6;


//Создать иерархию классов,описывающих бытовую технику.Создать несколько объектов описанных классов,
// часть из них включить в розетку.Иерархия должна името хотябы три уровня
public class Appliances {
    private String company;
    private int power;

    public Appliances(String company, int power) {
        this.company = company;
        this.power = power;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    /**
     * Методы включения/выключения в сеть
     */
    public void on() {
        System.out.println("Стиральная машина "+this.company+ " включена!");
    }

    public void off() {
        System.out.println("Cтиральная машина "+this.company+" выключена!");
    }
    /**
     создание объектов и вызов методов ими
     */
    public static void main(String[] args) {
        Appliances appliances = new Appliances("LG",3000);
        WashingMachine washingMachine = new WashingMachine("Sony",3000,30,1000,
                400,1000);
        WMAutomaton wmAutomaton = new WMAutomaton("ElectroLux",2700,35,1000,700,
                800,500,4);
        WMWithSpin wmWithSpin = new WMWithSpin("Bosh",2800,25,850,750,
                1000,750,5,15,20);
        wmWithSpin.on();
        washingMachine.off();

    }
}
