package sprint4Day1Assingment._1QuestionNumber1;

public interface Y {

    void abstractMethodY();

    default void defaultMethodY(){
        System.out.println("Default Method of Interface Y");
    }

    static void staticMethodY(){
        System.out.println("Static method of interface Y");
    }
}
