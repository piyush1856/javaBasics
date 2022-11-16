package sprint3Day3Live;

public class _4AccessSpecifiers {

    /*
    * Private : only accessible inside a class, not outside the class
    * Public : accessible to everyone : there are not restriction
    *
    * Default : when you don't give any specifier it is given by compiler by default
    *           accessible within the package --> AKA package protected
    *
    *
    */

    public static void main(String[] args) {
       ClassWithPrivateVariable obj = new ClassWithPrivateVariable();
       //System.out.println(i); --> error because of private int i

        System.out.println(obj.getI());
    }
}

class ClassWithPrivateVariable{
    private int i=10;

    void hello(){
        System.out.println(i);
    }

    public int getI() {
        return i; // make it public to access -- getter method
    }
}