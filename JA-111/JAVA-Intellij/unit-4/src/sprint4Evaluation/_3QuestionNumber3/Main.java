package sprint4Evaluation._3QuestionNumber3;

public class Main {
    public static void main(String[] args) {
        fun();
    }

    public static void fun(){
        int[] array= new int[10];
        Object object =null;


        try{
           array[11]=100;
            object.toString();
        }catch (NullPointerException nullException){
            System.out.println("Null Pointer Exception");
        }catch (ArrayIndexOutOfBoundsException indexError){
            System.out.println("Index Error");
        }

        System.out.println("The End");
    }
}
