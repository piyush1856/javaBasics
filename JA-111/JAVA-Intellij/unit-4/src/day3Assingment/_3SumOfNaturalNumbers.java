package day3Assingment;

public class _3SumOfNaturalNumbers {
    public static void main(String[] args) {
        sumOfNaturalNumbers(5);
    }
    public static void sumOfNaturalNumbers(int N){
        int sum = (N * (N + 1)) / 2;
        System.out.println(sum);
    }
}
