package Oops.Encapsulation;

public class Student {
    private String name;
    public int age;

    public void setName (String localName){
        if (localName.equalsIgnoreCase("Deepesh")){
        }else{
            name = localName;
        }
    }

    public String getName () {
        return name;
    }

    public void printInfo(char genderInput){
        char gender;
               gender = genderInput;
        System.out.println("Name is: " +name);
        System.out.println("Age is: "+age);
        System.out.println("Gender is: "+gender);
    }
}
