package Oops.Polymorphism.Overriding;

public class Main {
    public static void main (String[] args){
        Dog D1 = new Dog();
        Cat C1 = new Cat();

        D1.makeSound();
        C1.makeSound();
        C1.makeSound("Monkey");
        D1.makeSound(5);

        Animal A1 = new Animal ();
        A1.makeSound();

    }
}
