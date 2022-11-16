package sprint4Day4Live;

import java.util.*;
import java.util.TreeSet;

public class _9TreeSet {


    public static void main(String[] args) {
        Set<String> ts = new TreeSet<>();  //sorted set

        ts.add("Delhi");
        ts.add("Mum");
        ts.add("Che");
        ts.add("Pun");
        ts.add("Delhi");
        ts.add("Bang");
        System.out.println(ts);


        TreeSet<int[]> ats = new TreeSet<>();

        Plant snakePlant = new Plant(5,"DarkGreen");
        Plant moneyPlant = new Plant(50,"Green");
        Plant anotherPlant = new Plant(52,"Red");

        Set<Plant> plantTreeSet = new TreeSet<>();

        plantTreeSet.add(anotherPlant);
        plantTreeSet.add(snakePlant);
        plantTreeSet.add(moneyPlant);


        //how the treeSet will sort, since the two parameter is used?
        System.out.println(plantTreeSet); //ClassCastException
        //so, implement in Plant class and override a method called compareTo()
        //write the logic inside overridden compareTo()
        //then print(plantTreeSet will run and sort object)


        //comparator : next unit
        //to overcome the shortcoming of compareTo() we use comparator
        //In compareTo() we have to change the logic if we want some other comparison

    }
}
