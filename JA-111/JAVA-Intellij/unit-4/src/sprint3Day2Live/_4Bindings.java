package sprint3Day2Live;

public class _4Bindings {
    // Method Overloading :- same method with different parameter.
            //during compile time we know which method will be called
            //This also called compile time polymorphism or static binding

    //Method Overriding :- aka runtime poly aka dynamic binding

    void one(String s){}
    void one(Integer i){}

    public static void main(String[] args) {
        _4Bindings ob=new _4Bindings();
        ob.one("asdfs");
    }
}
