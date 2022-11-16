package sprint3Day4Assingment._2QuestionNumber2;
import java.util.Scanner;
public class Parent {
    final int number;


    Parent(int a){

        if(a>=1 && a<=10){
            number=a;
            System.out.println(number);
        }else{
            number=a;
            System.out.println("invalid");
        }

    }
    void method1(){
        System.out.println("inside parent method1");
    }
    final void method2(){
        System.out.println("inside parent method2");
    }
    void method3(){
        System.out.println("inside parent method3");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        Parent p=new Child(sc.nextInt());


        p.method1();
        p.method2();
        p.method3();

        Child c=(Child)p;
        c.method4();

    }

}

