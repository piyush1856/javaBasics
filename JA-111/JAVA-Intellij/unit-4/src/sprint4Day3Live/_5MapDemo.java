package sprint4Day3Live;

import java.util.*;
import java.util.Map;

public class _5MapDemo {

    public static void main(String[] args) {
        //always use wrapper class not primitive
        //naming convention :- keyToValue --> eg. countryToPopulation

        //Map<String, Double > countryToPopulation=new HashMap<>(); //hashMap= unordered
        Map<String, Double > countryToPopulation=new LinkedHashMap<>();  //LinkedHashMap = ordered

        countryToPopulation.put("India", 1.3 ); //adding
        countryToPopulation.put("China", 1.4);
        countryToPopulation.put("TH", .07);
        System.out.println(countryToPopulation);

        countryToPopulation.get("Japan");
        System.out.println(countryToPopulation.get(" ") == null);
        System.out.println(countryToPopulation.get("India")+1);
        System.out.println(countryToPopulation);

        //hashMap= unordered
        //LinkedHashMap = ordered

        //Hierarchy Of Map
        /*
         *                       java.util.Map(I)
         *
         * HashMap(c)               SortedMap(I)               HashTable
         *   |                       |
         * LinkedHashMap(c)         TreeMap(c)
         * */


    }
}
