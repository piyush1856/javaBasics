package sprint3Day1Live;

public class _1TwoDimensionalArrays {
    // Syntax -> int[] a = new int[5]; -- 1-D array

    public static void main(String[] args) {
        //2-d array

        int row = 3;
        int column =4;

        int[][] matrix = new int[row][column];

        // 1st way

        for (int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                matrix[i][j] = 10;
            }
        }

        for (int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.println(matrix[i][j]);
            }
        }


    }
}
