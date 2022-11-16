package sprint3Day1Live.inheritanceLive;

public class _3Overriding {
    public static void main(String[] args) {
        Father father = new Father();
        father.earn();

        You you = new You();
        you.earn(); // will print You class earn method

    }
}

class Father{

    void earn(){
        System.out.println("earn by running business");
    }
}

class You extends Father{
    @Override
    void earn(){
        System.out.println("earn by running business");
        System.out.println("also earn by job in IT company");
    }
}
// overriding is optional but highly recommended.

//Rules of overriding :
//    1. there should be is-A relationship
//    2. method name should be same -- otherwise it will make a new method
//    3. argument list of both the method should be same
