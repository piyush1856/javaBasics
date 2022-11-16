package sprint4Day1Assingment._1QuestionNumber1;

public class Demo {
    public static void main(String[] args) {
        ZImpl zimpl = new ZImpl();

        zimpl.abstractMethodX();
        zimpl.abstractMethodY();
        zimpl.abstractMethodZ();

        zimpl.defaultMethodX();
        zimpl.defaultMethodY();

        X.staticMethodX();
        Y.staticMethodY();
    }
}
