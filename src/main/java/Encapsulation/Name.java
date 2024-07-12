package Encapsulation;

public class Name {
    private String name;
    private int age;

    public void setData (String names, int ages){
        age = ages;
        name = names;
    }

    public int getAge () {
        return age;
    }

    public String getName () {
        return name;
    }

}
