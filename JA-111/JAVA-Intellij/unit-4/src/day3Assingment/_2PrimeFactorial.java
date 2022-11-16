package day3Assingment;

public class _2PrimeFactorial {
    public static void main(String[] args) {
        primeFactorial(99);
    }

    public static void primeFactorial(int n) {
        if(n>=2 && n<=100){
            String bag ="The Prime Factorials of " + n +" are ";
            for(int i=1;i<=n;i++){
                if(n ==i){
                    bag =bag+i+".";
                }
                else if(n%i ==0){
                    bag =bag+i+",";
                }
            }
            System.out.println(bag);
        }else{
            System.out.println("Invalid number!");
        }


    }
}
