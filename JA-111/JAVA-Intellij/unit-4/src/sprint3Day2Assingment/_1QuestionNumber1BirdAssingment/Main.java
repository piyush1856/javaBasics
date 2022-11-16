package sprint3Day2Assingment._1QuestionNumber1BirdAssingment;

public class Main {
    public static void main(String[] args) {
        Bird b1 = new Parrot();

        //with this b1 reference call the fly method of Parrot
        b1.fly();

        //and after down-casting this b1 reference to the Parrot class object, call the sing method also
        Parrot p1 = (Parrot) b1;
        p1.sing();
    }
}
