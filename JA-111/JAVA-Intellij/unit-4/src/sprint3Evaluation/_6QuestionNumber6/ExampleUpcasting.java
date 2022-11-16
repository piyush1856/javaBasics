package sprint3Evaluation._6QuestionNumber6;

public class ExampleUpcasting {
    public static void main(String[] args) {
       Animal parent = new Dog(); //super class reference and child class object
        //This is called upcasting

        parent.eat(); // working fine -- no error
        //we can access to overridden eat() method of child class with the help of parent class variable
        //parent.run() --> it will give error as it os solely the method of child class and not extended from parent class.


    }

}

class Animal{
    void eat(){
        System.out.println("Animal Eats ..");
    }
}

class Dog extends Animal {
    @Override
    void eat(){
        System.out.println("Dog eats ....");
    }

    void run(){
        System.out.println("Dog is runnng ...");
    }
}
