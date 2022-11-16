package sprint4Day1Assingment._4QuestionNumber4;

public class Main {
    public static void main(String[] args) {
        Test t = new Test();
        int[] printPrime = t.display(17);

        for(int i=0;i< printPrime.length;i++){
            System.out.print(printPrime[i] + " ");
        }
    }
}
