package sprint3Day4Assingment._2QuestionNumber2;
import java.util.Scanner;
final class Child extends Parent{



    Child(int num){
        super(num);
    }

    @Override
    void method1(){
        System.out.println("inside child method1");
    }


    void method4(){
        System.out.println("inside parent method4");
    }
}
