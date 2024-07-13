package Oops.Abstraction;

public class ChromeDriver extends Driver{

    public void get (int a){
        System.out.println("Chrome Browser: " +a);
    }
    public void play() {
    run();

    get(5);
    }
}
