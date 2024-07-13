package Oops.Encapsulation;

public class School {
    public static void main (String[] args){
        Student s1 = new Student();
        s1.setName("Deepesh Agrawal");

        System.out.println(s1.getName());
        s1.age = 100;
        s1.printInfo('M');

        Student s2 = new Student();
        s2.setName("ABC");
        s2.age = 50;
        s2.printInfo('F');


    }
}
