package sprint3Day1Assingment;
import java.util.Scanner;
import java.util.Arrays;
public class _2Question2SumOfEvenElementInColumn {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter no of rows");
        int N=scanner.nextInt();
        System.out.println("Enter no of Col");
        int M=scanner.nextInt();
        int [][] mat=new int[N][M];

        System.out.println("fill the matrix with value");

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                int value=scanner.nextInt();
                mat[i][j]=value;
                //System.out.println(mat[i][j]);
            }
            //System.out.println(Arrays.toString(mat[i]));
        }
        //System.out.println(Arrays.toString(mat));

        for(int i=0;i<M;i++){
            int sum=0;
            for(int j=0;j<N;j++){
                if(mat[j][i]%2==0){
                    sum+=mat[j][i];
                }
            }
            System.out.println("Sum of even elements of "+i+"th"+"Column is :- "+sum);
        }

    }
}
