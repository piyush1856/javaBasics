package sprint3Day1Live.inheritanceLive;

public class _6multilevelInheritance {
    public static void main(String[] args) {
        Child child = new Child();
        child.facialFeature();
    }
}

class Grandparents{
    void facialFeature(){
        System.out.println("Facial Feature");
    }
}
class Parent extends Grandparents{}
class Child extends Parent{}
