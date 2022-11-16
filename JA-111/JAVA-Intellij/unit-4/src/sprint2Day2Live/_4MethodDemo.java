package sprint2Day2Live;

public class _4MethodDemo {
    public static void main(String[] args) {
        //how call a method

        Simple simple = new Simple();
        simple.methodName(); // you cannot print it because it is not returning anything
        //System.out.println(simple.methodName());


        int factorial = simple.factorial(5);
        System.out.println(factorial);
        System.out.println(simple.factorial(2));

        System.out.println(simple.sum(10,11));

        //to call static method use className rather than object name
        Simple.staticMethod();

        //to call non-static method use objectName rather than className
    }
}

class Simple{
    /*
        <access specifier><return type><methodName><argument list>
        method body
        return statement
     */

    void methodName(){
        System.out.println("Inside methodName");
    }
    int factorial(int num){
        if(num ==1 || num ==2){
            return num;
        }else{
           return num*factorial(num-1);
        }
    }

    int sum(int x,int y){
        printMulti(x*y);  // calling one method from other method
        return x+y;
    }

    static void staticMethod(){
        System.out.println("inside staticMethod");
    }

    void printMulti(int a){
        System.out.println(a);
    }
}
