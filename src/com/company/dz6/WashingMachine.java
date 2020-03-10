package company.dz6;
/**
Класс Стиральная машина
 */
public class WashingMachine extends Appliances {
    private int weight;
    private int length;
    private int width;
    private int height;

    public WashingMachine(String company, int power, int weight, int length, int width, int height) {
        super(company, power);
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
