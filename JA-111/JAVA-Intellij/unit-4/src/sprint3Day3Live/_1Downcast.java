package sprint3Day3Live;

public class _1Downcast {
    public static void main(String[] args) {
        String s = "Hello";
        Object o =s;

        System.out.println(s instanceof String); //true
        System.out.println(s instanceof Object); //true



        //Down-casting

        Animal parent = new Dog(); //upcasting
        parent.eat();
        //parent.bark(); //compile time error

        //parent instance of Animal
        //parent instance of Dog

        Dog dog =(Dog) parent; //Down casting - also can be done with downCasting(parent);
        dog.bark();


        downCasting(parent);
        Animal purelyAnimal = new Animal(); // it can't be downcasted to dog
        downCasting(purelyAnimal); //classCastException

    }

    static void downCasting(Animal animal){
        if(animal instanceof Dog){
            Dog dog =(Dog) animal; //classCastException -- if if-else condition is not used
            System.out.println("casted");
        }else{
            System.out.println("Animal isn't a type dog, can't be casted");
        }
    }
}
class Animal{
    void eat(){
        System.out.println("animal eats");
    }

}

class Dog extends Animal{
    @Override
    void eat(){
        System.out.println("Dog eats");
    }

    void bark (){
        System.out.println("Dog Barking");
    }
}
