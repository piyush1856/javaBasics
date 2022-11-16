package sprint3Day3Live;

public class _5Abstraction {

    /*
     * Inheritance
     * Polymorphism : static and dynamic polymorphism
     * encapsulation : javabean POJO
     */



    //anstrct : summary : Hide the details
    //Abstraction :is a way of hiding the implementation details and showing only functionality of the user

    public static void main(String[] args) {
        new Email().send(null,null,null,null);

        MathShape shape = new Circle();
        double area= shape.calculateArea();
        System.out.println(area);

        MathShape square =new Square();
        System.out.println(square.calculateArea());
        square.whatIsThis();



    }




}
class Email{
    void send(String sender, String rec, String sub, String body){
        //smpt port google y email
    }
}

//hide details because : 1. the requirement is not their; 2. flexibility/scalability
//abstract class/method means without detail.
//concrete class/method means with all the detail.
abstract class MathShape{
    final double pi = 22.0/7.0;

//    double calculateArea(){
//        //we don't know the shape. so, we don't know the implementation detail
//        return 0;
//    }

    // so make the above method and class abstract

    abstract double calculateArea();

    void whatIsThis(){
        System.out.println("this is a shape class");
    }
}

class Circle extends MathShape{
    //this class must have detail or it will give error
    double r=7;
    @Override
    double calculateArea() {
        double x=r*r;
        return x*pi;
    }
}
class Square extends MathShape{
    //this class must have detail or it will give error
    double r =10;
    @Override
    double calculateArea() {
        return r*r;
    }
}

class Cylinder extends MathShape{
    //this class must have detail or it will give error
    int r;
    int h;
    @Override
    double calculateArea() {
        return pi*r*r*h;
    }
}

//abstract class can provide abstraction from 0%(all concrete) to 100%(all abstract)
//all method are abstract then 100% abstraction and accordingly


//Interface : also a way of abstraction --> will be discussed later