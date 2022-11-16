package sprint3Day2Assingment._4QuestionNumber4OverridingAndOverloading;

public class OverloadingExample {
    public static void main(String args[]){

        System.out.println("Printing add() method with 2 parameters :-");
        System.out.println(add(4, 6));

        System.out.println("**********************************************************");

        System.out.println("Printing add() method with 3 parameters :-");
        System.out.println(add(4, 6, 7));
    }

    static int add(int a, int b){
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }
}
