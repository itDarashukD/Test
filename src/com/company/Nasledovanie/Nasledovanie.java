package company.Nasledovanie;

public class Nasledovanie {
    public static void main(String[] args) {
        Animal animal = new Animal();
//animal.eat(); // после переопределения метода, этот уже вызываться не будет.мы его заменили переопредлеленным
animal.sleep();
//создаем новый объект
        Dog dog = new Dog();
        //dog унаследовал методы класа энимал
        dog.sleep();
        dog.eat();
        //собственный метода класса дог
        dog.bark();
        dog.eat();

        dog.showName();
    }

}
