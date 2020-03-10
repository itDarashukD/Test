package company.ClassWork.AbstractClass.AandInterfaaces;

public class Main {
    public static void main(String[] args) {
        Men men = new Men("Dima",33,"a little");
        Dog dog = new Dog("Bim",4,"wery well");
        men.speak();
        men.eat();
        men.sleep();

        dog.speak();
        dog.eat();
        dog.sleep();
    }
}
