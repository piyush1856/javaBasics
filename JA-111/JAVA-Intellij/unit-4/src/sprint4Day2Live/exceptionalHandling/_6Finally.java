package sprint4Day2Live.exceptionalHandling;

public class _6Finally {
    //The 'finally' block is always executed whether
// an exception is handled or not. Therefore, it contains
// all the necessary statements that need to
// be executed regardless of the exception occurs or no



    public static void main(String[] args) {
        int index =1;
        int[] a = new int[1];


        try{
            int x=a[index];
        }catch (Exception e){
            System.out.println("Catch");
        }finally {
            System.out.println("closing the scanner");
            System.out.println("System cleaning");
            System.out.println("this will always execute");

            // more like a last wish before program terminate
            //you can also have a pair of try/finally
        }
    }
    //try-catch
    //try-multiCatch
    //nested try-catch
    //try-catch-finally
    //try-finally

}
