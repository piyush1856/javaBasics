package sprint4Evaluation._5QuestinNumber5.C_FinalAndFinally;

public class FinalVersusFinally {

    public static void main(String[] args) {
        final int index =-11;  // final keyword used
        int[] a = new int[1];

        try{
            int x = a[index];
        }catch (Exception e){
            System.out.println("Catch : negative index found");

        }finally { // use of finally block

            System.out.println("Closing Scanner");
            System.out.println("this will always execute");
        }
    }
}
