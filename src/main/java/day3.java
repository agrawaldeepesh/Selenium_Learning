public class day3 {
    int a = 5;

    public void addition (int a, int b){
        int c = a +b;
        System.out.println("Sum is: " + c);
    }

    public int add (int a, int b){
        int c = a +b;
        System.out.println (c);
        return c;
    }

    public static void main (String[] args){
        day3 d3 = new day3();
        d3.addition(4, 5);
        d3.addition(9, 3);
        int sum = d3.add(5, 6);
        System.out.println("New Sum is: " +sum);
        System.out.println(sum*sum);
    }
}
