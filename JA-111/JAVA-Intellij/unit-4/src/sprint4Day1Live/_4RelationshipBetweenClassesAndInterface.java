package sprint4Day1Live;

public class _4RelationshipBetweenClassesAndInterface {
    //class extends another class
    // class implements interface (any number)
    //interface extends interface

    //class A extends classB,classC -- multiple inheritance not supported

    // in case of interface its is possible -- class can implement two or more interface

    //relationship b/w class and interface is of is-A relationship
}

interface AnimalInterface{
    void eat();
}

interface BirdInterface { //extends  AnimalInterface{
    void fly();
}

class Eagle implements BirdInterface,AnimalInterface{

    @Override
    public void eat() {
        System.out.println("eagle eats");
    }

    @Override
    public void fly() {
        System.out.println("fly high");
    }
}
