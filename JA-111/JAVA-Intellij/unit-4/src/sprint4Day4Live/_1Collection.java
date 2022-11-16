package sprint4Day4Live;

import java.util.*;

public class _1Collection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();// dynamic array -- length will increase by time
        Object[] objArray=list.toArray();//array pf objects

        list.add(10);
        list.add(12);
        //list is an interface which has implementation
        //initially -- 10 size -- load factor 0.75
        List<Integer> anotherList = Arrays.asList(0,1,2,3,4,5,6); // fixed size list
        list.addAll(anotherList); // copy the item
        System.out.println(list.get(0));

        System.out.println(list.contains(3));
        System.out.println(list.containsAll(anotherList));
    
        //list.removeAll(anotherList);

        //iterate : very old way
        Iterator<Integer> iterator = list.iterator();
        while ((iterator.hasNext())) {
            System.out.println(iterator.next());
        }

        //since sets are also derived from collection framework
        //all the method available here will also be available for set

        //list will allow duplicate, null
        //ArrayList : internally it's an array : index based access : O(1)
        //DELETE/INSERT : 0(N)
        //when most of your operation are index/read base -- use arrayList because of O(1);
        //for delete/insert use LinkedList: lookup/search/access -O(N); insert/delete-O(1)

        List<String> linkedList = new LinkedList<>(); // internally doubly linked list
        //singly linked list : 1->2->3
        //double linked list : 1<->2<->3

        //Object[] a = new Object[10]; --> array to store different data type
        //a[0]=1

         //List Vs Set :
             /*
             * array allow duplicate but set don't
             * array have index based access but set don't have index
             **/



        //Vector : Similar to arrayList -- for now ignore

    }
}

//Collection - top interface --> add(), remove(), size, empty
//derived - List, Set ...
