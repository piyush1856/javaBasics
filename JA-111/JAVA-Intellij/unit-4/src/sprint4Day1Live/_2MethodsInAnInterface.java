package sprint4Day1Live;


interface Animal{
    //by default in an interface all the method are abstract
    //abstract --> no detail --> overriding
    //abstract and final cannot go together

    // bluePrint of all animal

    void move();
}

abstract class Fish implements Animal{
    //void move() : will come here
}

class Dolphin extends Fish{

    @Override
    public void move() {
        System.out.println("Dplphin will swim and jump ..");
    }
}




public class _2MethodsInAnInterface {
    public static void main(String[] args) {
        new Dolphin().move();

        Dolphin dolphin = new Dolphin();


        System.out.println(dolphin instanceof Fish);
        System.out.println(dolphin instanceof Animal);  //sub-Type
    }
}
