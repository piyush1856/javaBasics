package sprint4Day3Live;

import java.util.*;

public class _6IterateOverMap {
    //key, value
    //entry = <key,value>   --> entry means a key value pair
    //  {[<k,v>]   [<k1,v1>]}  --> internally created map.
    //Map is collection of key,value pair, collection of entries

    public static void main(String[] args) {
        Map<Integer, Integer> map= new HashMap<>();
        map.put(0, 0);
        map.put(1,1);
        map.put(2, 4);
        map.put(3, 9);
        System.out.println(map.get(2));
        // map.clear(); //erase map
        //no duplicate keys in a map
        map.put(2,20); //replace the value of 2 because keys are always unique
        System.out.println(map.get(100));
        Integer defaultValue=map.getOrDefault(100, -1);
        //default is used to handle nullPointer
        System.out.println(defaultValue); //-1

        //way to iterate:
        System.out.println(map);

        System.out.println("================= key-set==================");

        //1. key-set
        Set<Integer> keySet=map.keySet();

        for(Integer key: keySet){
            System.out.println(key+"->"+map.get(key));
        }

        System.out.println("================= entry set way==================");

        //2. entrySet
        Set<Map.Entry<Integer, Integer>> entrySetVariable=map.entrySet();

        for (Map.Entry<Integer, Integer> entry: entrySetVariable){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }

        System.out.println("================= lambda way ==================");

        //3. lambda  //will be learned later

        map.forEach((k,v)-> System.out.println(k +"->"+ v));

        map.forEach((k,v)-> {
            System.out.println(k + v);
        });


        System.out.println("=================forEach map.get() ==================");

        //4.
        map.keySet().forEach(key-> System.out.println(key +"->"+ map.get(key)));

    }
}
//TreeMap sortedmap : comparator