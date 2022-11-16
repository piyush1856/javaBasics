package sprint4Day1Assingment._4QuestionNumber4;

public class Test implements Intr{
    @Override
    public int[] display(int p) {

        int count =0;
        int[] array = new int[p-1];

        for(int i=2;i <= p;i++){
            array[i-2] =i;
        }

        for(int i=0;i< array.length;i++){
            boolean isPrime = true;

            for(int j=2;j<array[i];j++){
                if(array[i]%j ==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                count++;
            }
        }

        int[] primeArray = new int[count];
        int k=0;

        for(int i=0;i< array.length;i++){
            boolean isPrime = true;

            for(int j=2;j<array[i];j++){
                if(array[i]%j ==0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                primeArray[k] =array[i];
                k++;
            }
        }

        return primeArray;
    }
}
