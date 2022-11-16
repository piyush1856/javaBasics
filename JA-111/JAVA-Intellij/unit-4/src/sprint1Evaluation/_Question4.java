package sprint1Evaluation;

public class _Question4 {
    public static void main(String[] args){
        int x=1;
        do{
            if(x%2==0){
                if(x==20){
                    System.out.print(x);
                }else{
                    System.out.print(x +",");
                }

            }else if(x==1){
                x++;
                continue;
            }
            x++;


        }
        while(x<=20);
    }
}
