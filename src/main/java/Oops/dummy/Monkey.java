package Oops.dummy;

import Oops.Inheritance.Animal;
import Oops.Inheritance.Lion;

public class Monkey extends Animal {

    Animal a1 = new Animal();

    public void work() {
        System.out.println("Monkey is working");
        name = "Monkey";
        walk();
        a1.walk();
    }

    public static void main(String[] args) {
        Lion L1 = new Lion();

        L1.talk();
        L1.walk();
        L1.work();

        //System.out.println(L1.name);

        Animal A1 = new Animal();
        A1.name = "Rai";
    }
}