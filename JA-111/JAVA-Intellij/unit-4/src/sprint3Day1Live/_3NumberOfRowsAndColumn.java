package sprint3Day1Live;

public class _3NumberOfRowsAndColumn {

    public static void main(String[] args) {
        int row = 2;
        int column =3;

        int[][] matrix = new int[row][column];

        numOfRowAndColumn(matrix);
    }

    static  void numOfRowAndColumn(int[][] matrix){
        System.out.println("No. of Rows : "+matrix.length);
        System.out.println("No. of column : "+ matrix[0].length);

    }
}
