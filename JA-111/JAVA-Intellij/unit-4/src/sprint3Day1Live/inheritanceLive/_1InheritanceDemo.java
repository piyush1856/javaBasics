package sprint3Day1Live.inheritanceLive;

public class _1InheritanceDemo {
    // reversibility of code
    // relationship between
    // parent child relationship
    // is-A relationship
    // dolphin is-A fish

    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.swim();

        Dolphin dolphin = new Dolphin();
        dolphin.swim();
        dolphin.jump();

        //fish.jump(); -- will not work
    }
}
class Fish{
    void swim(){
        System.out.println("Fish is swimming ...");
    }
}

class Dolphin extends Fish{
/* swim() if available here but can't be seen due to inheritance*/

    void  jump(){
        System.out.println("Dolphin id jumping ..");
    }
}
// Fish    : - Parent, Super Class, Base Class
// Dolphin : - Child Class, Sub Class, Derived Class


/*
*  Benefit :
*       1. code reuse
*       2. runtime polymorphism
* */
