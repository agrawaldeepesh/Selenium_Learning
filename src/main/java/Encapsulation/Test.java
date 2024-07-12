package Encapsulation;

public class Test {
    public static void main (String [] args){
        Name n1 = new Name ();
        n1.setData("Deepesh", 100);
        String Name = n1.getName();
            System.out.println("Name is: " +Name);
        int Age = n1.getAge();
            System.out.println("Age is: " +Age);
    }
}
