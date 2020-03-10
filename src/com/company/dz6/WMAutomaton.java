package company.dz6;
/**
 Класс Стиральная машина автомат
 */
public class WMAutomaton extends WashingMachine {
    private int revolution;
    private int volume;

    public WMAutomaton(String company, int power, int weight, int length, int width, int height, int revolution, int volume) {
        super(company, power, weight, length, width, height);
        this.revolution = revolution;
        this.volume = volume;
    }

    public int getRevolution() {
        return revolution;
    }

    public void setRevolution(int revolution) {
        this.revolution = revolution;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
