package sprint2Day2Live;

public class _3PredictTheOutput {
    static int j= 200;
    A a1 = new A();

    public static void main(String[] args) {
        _3PredictTheOutput obj = new _3PredictTheOutput();

        System.out.println(obj.j); //200
        System.out.println(obj.a1); // print address of a1 --package name, className, addressof a1

        obj.a1.funA();  // whatever inside funA --> Inside funA of class A
        

    }
}

class A{
    int x= 10;
    void funA(){
        System.out.println("Inside funA of class A");
    }
}
