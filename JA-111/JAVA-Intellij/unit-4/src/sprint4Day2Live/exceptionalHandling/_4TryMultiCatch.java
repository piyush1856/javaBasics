package sprint4Day2Live.exceptionalHandling;

import sprint2Day4Live.Student;

public class _4TryMultiCatch {

    public static void main(String[] args) {
        int i=-1;
        int d=0;

        int[] a = new int[1];

        Student s= null;
        try{
            //System.out.println(i/d);
           // System.out.println(a[i]);
            System.out.println(s.getClass());
        }
        catch (ArithmeticException e){
            System.out.println("arithematic exception");
        }catch (ArrayIndexOutOfBoundsException b){
            System.out.println("AIOOBE");
        }catch(Exception exception){
            System.out.println("Generic Exception");
        }
    }
}
