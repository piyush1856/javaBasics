package sprint2Day4Live;

import java.util.Arrays;

public class _1ArrayDemo {
    public static void main(String[] args) {
        //syntax : declaration
        // <datatype>[] <arrayName>
        int[] ages;
        //array is continuous memory block
        // index starts with [0,,1,2,3 ...]

        //syntax for creating a new array
        // new <DataType>[size]
        ages = new int[10];

        //shortcut -- another way
        String[] names = new String[10];
        System.out.println(ages);  // output address -- default value ==0
        System.out.println(names); // output address -- default value ==null

        Integer[] integer = new Integer[5];
        System.out.println(integer);//-- default value ==null

        integer[0] =10;
        //accessing array item at index 0;
        System.out.println(integer[0]);

        for(int i=0;i<integer.length;i++){
            integer[i] =i;
            System.out.println(integer[i]);
        }
        //use array only if, size of array is known

        //when (not) to use array:
        /*
        * 1. you know the no. of items
        * 2. same data type
        * 3.
        * */

        //another way:
        String[] array = {"one","two","three"};
        //System.out.println(array[3]); -- output -- error --Array index out of bound exception
        //System.out.println(array[-1]); -- same as above


        /*
        iterating over an array:
        //for loop
        //while loop
        //enhanced for loop
        * */

        //enhanced for loop or for each loop
        /*
        * for(<dataType> loop_varaible : name_of_array){
        *       whatever
        *   }
        * */

        for(String nameCanBeAnything: array){
            System.out.println(nameCanBeAnything);
        }

        //no need to remember
        Arrays.stream(array).forEach(item -> System.out.println(item));






    }
}
