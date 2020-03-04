package company.Nasledovanie;

public class Dog extends Animal { // класс дог наследник класса анимал, наследует его методы и поля
  //  класс дог может иметь и свои собсвенные методы
public void bark(){
    System.out.println(" i bark");}
// можно переопределить метода из Анимал в Дог, например метод ИТ - собака есть по особенному
    // название можно оставить тоже что и в АНИМАЛ, и ИТ в анимале не будет работать для ДОГ

 public void eat(){
     System.out.println("dog is eating");
}
//наследование полей
    public void showName(){
        System.out.println(name);

    }
    

}
