package sprint4Day3Live;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class _7TreeMapDemo {
    public static void main(String[] args) {
        Map<Integer, Integer> hashMap= new HashMap<>();
        hashMap.put(0, 0);
        hashMap.put(2, 4);
        hashMap.put(1,1);
        hashMap.put(3, 9);
        hashMap.forEach((k,v)-> System.out.println(k+"->"+v));

        System.out.println("====================Tree Map======================");

        Map<Integer, Integer> treeMap= new TreeMap<>();
        treeMap.put(0, 0);
        treeMap.put(2, 4);
        treeMap.put(1,1);
        treeMap.put(3, 9);
        treeMap.forEach((k,v)-> System.out.println(k+"->"+v));

        //tree map will always keep things in sorted manner
        //will be discussed tomorrow

    }
}
