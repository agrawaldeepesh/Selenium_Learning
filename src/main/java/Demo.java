public class Demo {
    public static void main(String[] args) {
        //System.out.println("Hello");
        for (int i = 0; i < 5; i++){
            System.out.println("This is for loop test. The value is: " + (i+1));
        }
    }
    public void bitWiseOperator () {
        int a = 7;
        int b = 3;
        int c = a & b;
        System.out.println(c);
    }
    public void ternaryOperator () {
        int a = 19;
        String result = a > 9 ? (a > 10 ? "Pass" : "Fail") : "Fail2";
        System.out.println(result);
    }
    public void ifElse () {
        String gender = "male";
        int totalMarks = 75;
        if (totalMarks < 30) {
            System.out.println("Fail");
        }
        else {
            System.out.println("Pass");
        }
        if (gender == "female"){
            System.out.println("Gender is Female");
        }
        else {
            System.out.println("Gender is Male");
        }
    }
    public void switchCase () {
        String floor = "Top Floor";
        switch (floor) {
            case "Top Floor": {
                System.out.println("Top Floor");
                break;
            }
            case "Lower Floor": {
                System.out.println("Lower Floor");
                break;
      }
            default: {
                System.out.println("Middle Floor");
                break;
            }
        }
    }
}