package Oops.Polymorphism.Overloading;

public class Main {
    public static void main (String[] args){
        Animal A1 = new Animal();

        A1.makeSound();
        A1.makeSound("Monkey");
        A1.makeSound(5);

        Dog D1 = new Dog();
        D1.makeSound("Dog");
    }
}
