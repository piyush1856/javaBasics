package sprint3Day1Assingment;

public class _4Question4CommandLineArgument {
    public static void main(String[] args) {
        Integer[]arr=new Integer[args.length];  //array constructor
        int k=0;
        for(String i:args){
            arr[k]= Integer.parseInt(i);   //to convert string to integer
            k++;
        }

        if(arr.length>2){
            System.out.println("Error");
        }else if(arr.length==1){
            int ans=findFactorial(arr[0]);
            System.out.println(ans);
        }else if(arr.length==2){
            int absValue=Math.abs(arr[0]-arr[1]);
            int ans=findFactorial(absValue);
            System.out.println(ans);

        }
    }
    public static int findFactorial(int num) {
        if(num<1){
            return 1;
        }else{
            return num*findFactorial(num-1);
        }

    }
}
