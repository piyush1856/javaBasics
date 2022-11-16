package sprint2Day2Live;

public class _5AbstractMethod {
    public static void main(String[] args) {

    }

    void concreteMethod(){
        System.out.println("conctrete body");
    }

}

abstract class ABC{
    abstract void calculateAreaOfAShape(); // abstract = not giving implementation details
    // for abstract use abstract keyword before class as well as method
    // here we don't know what shape will be given to calculate, so we use abstract
    //diff shape need diff formula
    //more things will be discussed later


}
