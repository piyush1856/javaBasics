package sprint3Day1Live;

public class _4InitializeAMatrix {
    public static void main(String[] args) {
        // int[] a = {2,3}

        int[][] m = {
                {0,1,2},
                {3,4},
                {5}
        };
        System.out.println(m[1][1]); //4
        //System.out.println(m[1][2]); // error = ArrayIndexOutOfBoundsException

        //no. of column is different for each row
        // no. of coloumn for ith row -- m[i].length
    }
}
