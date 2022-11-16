package sprint3Day1Assingment._3QuestionNumber3FindPrimeInArray;
import java.util.Arrays;
public class PrintPrimeNumber {
    public static void main(String[] args) {
        Main mainObj = new Main();

        int[] arr =   {10,12,5,50,11,14,15};

        int[] primeNumberArr = mainObj.findAndReturnPrimeNumbers(arr);

        for(int i=0;i<primeNumberArr.length;i++){
            if(primeNumberArr[0]==0){
                System.out.println("Prime number not found in the supplied Array");
                break;
            }else if(primeNumberArr[i]!=0){
                System.out.println(primeNumberArr[i]);
            }
        }


//        if(primeNumberArr.length ==0){
//            System.out.println("Prime number not found in the supplied Array");
//        }else{
//            System.out.println(Arrays.toString(primeNumberArr));
//        }


    }
}
