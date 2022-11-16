package sprint4Day2Live.pack1;

public class InTheSamePackage {


    public static void main(String[] args) {
        One one = new One();
        one.hi();  // default method available inside same package
        one.hello();// protected : available in same package
    }
}
