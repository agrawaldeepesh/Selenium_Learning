package Oops.Abstraction;

public class FirefoxDriver extends Driver{

    public void get(int a) {
        System.out.println("Firefox Browser: " + a);
    }
    public void play() {
        get(10);
    }
}
