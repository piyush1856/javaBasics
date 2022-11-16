package sprint3Day1Live;

public class _5YouProblem {
    public static void main(String[] args) {
        int[][] m = {
                {0,1,2},
                {3,4},
                {5}
        };


        //print all the array items

        for (int[] i:m){
            for (int j:i) {
                System.out.println(j);
            }
        }
    }
}
