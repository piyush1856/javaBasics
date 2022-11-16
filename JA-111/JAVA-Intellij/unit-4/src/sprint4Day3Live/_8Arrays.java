package sprint4Day3Live;

import java.util.Arrays;
import java.util.List;

public class _8Arrays {
    //ArrayList, Set, LL, Q, Stack


    public static void main(String[] args) {
        int[] a={4,2,3,6,7,1};

        Arrays.sort(a);

        System.out.println("after sorting");
        System.out.println(Arrays.toString(a));//string representation od array

        List<Integer> integerList=Arrays.asList(4,2,5);
        System.out.println(integerList); //adding in list in one line

        //searching...
        Arrays.binarySearch(a, 4);

        int[] b=Arrays.copyOf(a,a.length); // a.length can be replaced by 2,3,4 .. etc(single int)
        //a.length will copy the entire array -- any single int will add the first int element of original array
        System.out.println(Arrays.toString(b));


    }
}
