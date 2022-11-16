package sprint3Day3Assingment._2QuestionNumber2.SuperKeywordExample;



public class _1ReferParentInstanceVariable {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.display();

    }
}

class Animal{
    String color = "white";

    void eat(){
        System.out.println("Animal eat");
    }

    Animal(){
        System.out.println("Animal Constructor");
    }
    //parameterized constructor :-
    Animal(String color){
        System.out.println("Paramerterized constructor is called");
    }

}


class Dog extends Animal {
    String color = "black";

    void display(){
        System.out.println(color); //black
        System.out.println(super.color); //white

        eat();  // print dog method
        super.eat(); // print immediate parent method


    }

    @Override
    void eat(){

        System.out.println("Dog eat");
    }

    Dog(){

        //super();
        super("bjh"); //super() should be always be first line of the constructor :- constructor of parent constructor
        System.out.println("Dog Constructor");

            /*
             * even if the super() id removed the first line of output will be  Animal constructor.
             * This  brings us to the concept of constructor chaining
             *
             * Constructor Chaining:
             *
             * When you create object of dog, The constructor will be called and the first line of dog(child) constructor
             * will contain the super()(constructor of parent), hence it is printing 'animal constructor' even when super() is not present.
             * It is present by default in JAVA
             * */
    }
}
    //compiler does 2 things:
    //it gives you a default constructor
    //The first line in each constructor is call to
    // the super constructor super();

    //In case of multi-level the constructor chaining will refer to all parent in the hierarchy (and even child).





