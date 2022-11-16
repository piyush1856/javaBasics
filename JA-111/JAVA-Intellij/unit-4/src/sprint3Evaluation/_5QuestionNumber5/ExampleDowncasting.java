package sprint3Evaluation._5QuestionNumber5;

public class ExampleDowncasting {
    public static void main(String[] args) {
        Animal parent = new Dog(); //super class reference and child class object
        parent.eat(); // working fine -- no error
        //parent.run() --> it will give error as it os solely the method of child class and not extended from parent class.

        // the need of down casting:

        Dog child = (Dog) parent;  // down-casting
        child.run(); // working fine
    }
}
class Animal{
    void eat(){
        System.out.println("Animal Eats ..");
    }
}

class Dog extends Animal{
    @Override
    void eat(){
        System.out.println("Dog eats ....");
    }

    void run(){
        System.out.println("Dog is runnng ...");
    }
}