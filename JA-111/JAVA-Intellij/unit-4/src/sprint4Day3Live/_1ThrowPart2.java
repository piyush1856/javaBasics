package sprint4Day3Live;

import java.io.IOException;

public class _1ThrowPart2 {
    public static void main(String[] args) throws IOException {
        //validate(20);
        //try {
            validate(17);
//        } catch (IOException e) {
//            System.out.println("should be at least 18");
//        }

        //again two option to handle
    }
    static void validate(int age) throws IOException {
        if(age<18){
            //ArithmeticException  : Runtime Exception - unchecked
            //IOException          : Compile Time - checked

            throw new IOException("age<18");

            //if you throw a check exception the compiler will check it and following are the options
            //option :
              // 1. declare the exception i.e, throw from here so that someone else van handle it.
              // 2. Handle : try/catch
        }else{
            System.out.println("You can cast your vote.");
        }
    }
}
