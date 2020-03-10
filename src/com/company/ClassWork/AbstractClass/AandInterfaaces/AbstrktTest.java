package company.ClassWork.AbstractClass.AandInterfaaces;

public abstract class AbstrktTest implements NewInfo {
    private String name;
    private int age;

    public AbstrktTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void speak() {
        System.out.println("i speak");
    }

    @Override
    public void eat() {
        System.out.println("i eat");
    }

    public void sleep(){
        System.out.println("i sleep");
    }
}
