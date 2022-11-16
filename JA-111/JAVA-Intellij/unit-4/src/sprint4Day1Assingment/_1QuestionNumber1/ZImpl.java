package sprint4Day1Assingment._1QuestionNumber1;

public class ZImpl implements Z{

    @Override
    public void abstractMethodX() {
        System.out.println("Inside abstract method X in ZImpl");
    }

    @Override
    public void defaultMethodX() {

        System.out.println("Inside overridden default method of X in ZImpl");
    }

    @Override
    public void abstractMethodY() {
        System.out.println("Inside abstract method Y in ZImpl");

    }


    public void defaultMethodY() {
        Z.super.defaultMethodY();
    }

    @Override
    public void abstractMethodZ() {
        System.out.println("Inside abstract method Z in ZImpl");

    }
}
