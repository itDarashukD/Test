package company.ClassWork.AbstractClass.AandInterfaaces;

public class Men  extends AbstrktTest{
    private String  intellect;

    public Men(String name, int age, String intellect) {
        super(name, age);
        this.intellect = intellect;
    }

    public String getIntellect() {
        return intellect;
    }

    public void setIntellect(String intellect) {
        this.intellect = intellect;
    }


    public void sleep() {
        System.out.println("i sleep in soft bad");

    }
}
