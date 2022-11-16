package sprint4Day3Live;

import java.util.HashSet;
import java.util.Set;

public class _4SetDemo {
    //set - collection of similar type of data
    //may or may not be ordered
    //doesn't have duplicates
    //when to use set in Java
    //if size of the data structure is unknown
    //there are no duplicate

    public static void main(String[] args) {
        //initial capacity: 16 items
        //load factor: .75 --> it means if it is 75% full its capacity will automatically double
        //size: no. of items that are present in the set.

        Set<Integer> set=new HashSet<>();  //basic creating syntax

        set.add(1); //adding item
        set.add(2);

        set.size();  // size of set --2

        set.add(2);  //set will not allow duplicate
        set.size();  // so size will be 2

        System.out.println("end");

        set.remove(1); //remove item no. 1
        set.contains(2);  //check weather it contain a particular item or not
        set.isEmpty(); // weather it id empty or not


        for (int i=0;i<15;i++){
            set.add(i);
        }
        //iterate
        set.forEach(item -> System.out.println(item));



    }
}
