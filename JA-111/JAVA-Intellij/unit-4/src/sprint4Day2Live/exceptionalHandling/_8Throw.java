package sprint4Day2Live.exceptionalHandling;

public class _8Throw {
    // throw your own exception

    public static void main(String[] args) {

        int age =2;

        if(age<18){
            throw new ArithmeticException("Below 18 not allowed in Masai");
        }else{
            System.out.println("Eligible for masai");
        }

    }
}

