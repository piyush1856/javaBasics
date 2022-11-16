package sprint3Day2Assingment._4QuestionNumber4OverridingAndOverloading;

public class OverridingExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.eat();
        dog.eat();  //Printing the overridden method of parent class(Animal) by child class(Dog).


        //Example of Super Class reference and child class Object :


        //This is also one type of Upcasting.
        Animal animalReference = new Dog();
        animalReference.eat(); //eat() method of Dog class(child class) will be printed.
        //animalReference.run(); --> we cannot access this method of child class(Dog) because it is not Overridden.


        //Down Casting :-
        // We can also do a Down casting of above object(animalReference) to bring back the child method because in the above object(animalReference).
        // We cannot refer to specific child object, we can only refer to the overridden method.
        Dog dogReference = (Dog) animalReference;
        dogReference.eat();
        dogReference.run();
    }

}


class Animal {

    void eat(){
        System.out.println("Animal id eating some food ....");
    }
}

class Dog extends Animal {

    //Child class is overriding the method of parent class.
    @Override
    void eat(){
        System.out.println("Dog is eating some bone ...");
    }

    void run(){
        System.out.println("Dog is running ...");
    }
}
