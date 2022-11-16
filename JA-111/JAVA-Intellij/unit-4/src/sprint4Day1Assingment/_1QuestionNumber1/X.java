package sprint4Day1Assingment._1QuestionNumber1;

public interface X {
    void abstractMethodX();

    default void defaultMethodX(){
        System.out.println("Default Method of Interface X");
    }

    static void staticMethodX(){
        System.out.println("Static method of interface X");
    }
}
