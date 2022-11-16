package sprint3Day1Assingment._3QuestionNumber3FindPrimeInArray;
import java.util.Arrays;
public class Main {
    public int[] findAndReturnPrimeNumbers(int[] inputArray) {

        int[] ans=new int[inputArray.length];

        int k=0;

        for(int i=0;i<inputArray.length;i++){
            if(inputArray[i] ==1){
                continue;
            }

            boolean isPrime = true;
            if(inputArray[i]>1){
                for(int j=2;j<inputArray[i];j++){
                    if(inputArray[i]%j ==0){
                        isPrime = false;
                        break;
                    }
                }
            }
            if(isPrime){
                ans[k] = inputArray[i];
                k++;
            }

        }
        return ans;
    }
}
