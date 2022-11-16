package sprint2Day4Live;

public class _2PrintSumAndAverageOfArrayItems {
    public static void main(String[] args) {
        Integer[] num = new Integer[10];

        for(int i=0;i<num.length;i++){
            num[i]=i+1;
        }

        int sum=0;

        for(int i=0;i<num.length;i++){
            sum=sum+num[i];
        }

        System.out.println(sum);
        System.out.println((double) sum/num.length); //down casting


    }
}


