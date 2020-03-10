package company.ClassWork.AbstractClass.AandInterfaaces;

public class Dog extends AbstrktTest {
    private String smell;

    public Dog(String name, int age, String smell) {
        super(name, age);
        this.smell = smell;
    }

    public String getNiuh() {
        return smell;
    }

    public void setNiuh(String smell) {
        this.smell = smell;
    }
    public void speak(){
        System.out.println("i dont speak! i bark!");
    }
}
