package sprint4Day2Live.exceptionalHandling;

public class _1ExceptionalHandlingDemo {
    public static void main(String[] args) {
        System.out.println("one");


        try{
            System.out.println(1/0);
        }catch (Exception exception){  //ArithmeticException
            System.out.println("divide by zero error");
        }


        System.out.println("two");
    }

    //error cannot be handled but exception can be with try/catch
}
//**Error vs Exception:**
//
//- E**rror:** An Error indicates a serious problem that a reasonable application
// should not try to catch. Error is irrecoverable.
//- **Exception:** Exception indicates conditions that a
// reasonable application might try to catch.
