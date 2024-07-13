package Oops.Overloading;

public class Animal {
    public void makeSound (){
        System.out.println("Animal makes sound");
    }

    public void makeSound (String animalType){
        String animal = animalType;
        System.out.println(animal + " is making sound");
    }

    public void makeSound (int animalType){
        int animal = animalType;
        System.out.println(animal + " is making sound");
    }
}
