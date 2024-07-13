package Oops.Inheritance;

public class Lion extends Animal {

    Animal a1 = new Animal();

    public void work(){
        System.out.println("Lion is working");
        name = "Lion";
        walk ();
        a1.walk();
    }

}
