package sprint4Day2Live.exceptionalHandling;

import sprint2Day4Live.Student;

public class _2CheckedAndUncheckedException {
    //checkedException : checking can be done at compile time.
        //eg: ClassNotFoundException

    //Unchecked : all the exception inherit from runtime is called unchecked
    //program will not be able to figure it out at compile time


    //nullPointer
    public static void main(String[] args) {

        Student s=null;

        //nullPointerException

        try{
            System.out.println(s.getClass());
        }catch(Exception exception){
            System.out.println(exception.getMessage());
        }


        //NumberFormatException
        String num= "12abc";
        try {
            Integer.parseInt(num);
        }catch (NumberFormatException numberFormatException){
            System.out.println(numberFormatException.getCause());
        }


        //ArrayIndexOutOfBoundsException

        Integer[] array = new Integer[5];

        for(int i=0;i< array.length;i++){
            array[i] = i+1;
        }

        System.out.println(array[2]); // will print 3

        try {
            System.out.println(array[-1]);
        }catch (ArrayIndexOutOfBoundsException exceptionArray){
            System.out.println(exceptionArray.getMessage());
        }

    }
}
