package sprint3Day1Live;

public class _2WeProblem {

    public static void main(String[] args) {


        int row = 2;
        int column =3;

        int[][] matrix = new int[row][column];


        int k =0;
        for (int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                matrix[i][j] = k++;
            }
        }

        for (int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.println(matrix[i][j]);
            }
        }
    }
}
