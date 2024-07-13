package Oops.Overloading;

public class Main {
    public static void main (String[] ards){
        Dog D1 = new Dog();
        Cat C1 = new Cat();

        D1.makeSound();
        C1.makeSound();
        C1.makeSound("Monkey");
        D1.makeSound(5);
    }
}
