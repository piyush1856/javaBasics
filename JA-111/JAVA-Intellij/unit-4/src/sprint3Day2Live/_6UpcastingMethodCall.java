package sprint3Day2Live;

public class _6UpcastingMethodCall {

    public static void main(String[] args) {
        Bike bike=new Splendor();
        bike.run();

        //instanceof
        Integer i=10;
        System.out.println(i instanceof Integer);
        //System.out.println(i instanceof String);
        System.out.println(i instanceof Object);
        System.out.println(bike instanceof Bike);
        System.out.println(bike instanceof Object);
        System.out.println(bike instanceof Splendor); //to be discussed later


    }
}

class Bike{
    void run(){
        System.out.println("bike runs");
    }
}


class Splendor extends Bike{
    void run(){
        System.out.println("Splendor runs");
    }
}
