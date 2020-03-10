package company.dz6;
/**
 Класс Стиральная машина автомат с сушкой
 */
public class WMWithSpin extends WMAutomaton{
    private int timeSpin;
    private int humidityWear;

    public WMWithSpin(String company, int power, int weight, int length, int width, int height, int revolution, int volume, int timeSpin, int humidityWear) {
        super(company, power, weight, length, width, height, revolution, volume);
        this.timeSpin = timeSpin;
        this.humidityWear = humidityWear;
    }

    public int getTimeSpin() {
        return timeSpin;
    }

    public void setTimeSpin(int timeSpin) {
        this.timeSpin = timeSpin;
    }

    public int getHumidityWear() {
        return humidityWear;
    }

    public void setHumidityWear(int humidityWear) {
        this.humidityWear = humidityWear;
    }
}
