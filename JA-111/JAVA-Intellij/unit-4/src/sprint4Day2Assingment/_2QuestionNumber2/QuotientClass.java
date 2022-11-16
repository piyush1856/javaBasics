package sprint4Day2Assingment._2QuestionNumber2;

import java.util.Scanner;

public class QuotientClass {
    static int  findQuotient(int a,int b){
        if(b != 0){
            return  a/b;
        }else{
            throw new ArithmeticException("DivideByZeroException caught");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'a' value :");
        int a = scanner.nextInt();
        System.out.println("Enter 'b' value :");
        int b = scanner.nextInt();

        try {
            System.out.println("The quotient of a/b is " + findQuotient(a,b));
        }catch (ArithmeticException exception){
            System.out.println(exception.getMessage());
        }finally {
            System.out.println("Inside finally block");
            scanner.close();
        }
    }
}
