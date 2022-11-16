package sprint3Day1Live.inheritanceLive;

public class _5multipleAndHybridInheritance {

}

class Pet{
    void speak(){
        System.out.println("Pet speaking ...");
    }
}

class Dog extends Pet{
    @Override
    void speak(){
        System.out.println("barking...");
    }
}

class Cat extends Pet {
    @Override
    void speak(){
        System.out.println("Meow ...");
    }
}

/*
class MultipleInheritance extends Dog,Cat{
  it is not supported - multiple class
  it is not supported in java due to ambiguity
}
 */

