package sprint4Day1Live;

public class _6DefaultMethod {
    public static void main(String[] args) {
        Food dosa = new Dosa();
        dosa.dineIn();
        dosa.deliver();

        Idli idli = new Idli();
        idli.deliver();

        Food.eat();
    }
}
interface Food{
    void dineIn();
    default void deliver(){
        System.out.println("delivery food");
    }
    static void eat(){
        System.out.println("eat food");
    }
}

// if you add a new method in an interface the implementation will break
// this is called backward incompatibility ..
//so, default method came to picture
//it will add the method to every subType

class Dosa implements Food{
    @Override
    public void dineIn() {
        System.out.println("Serving Dosa .. ");
    }
}

class Idli implements Food{
    @Override
    public void dineIn() {
        System.out.println("Serving Idli .. ");
    }
}
