package sprint4Day4Live;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class _6HashSetVsLinkedHashSet {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        Set<String> lhs = new LinkedHashSet<>();  // linkedHashSet is child of HashSet
        //It preserves the order of item

        hs.add("Delhi");
        hs.add("Mum");
        hs.add("Che");
        hs.add("Pun");
        hs.add("Delhi");
        hs.add(null);
        hs.add("Bang");

        System.out.println(hs);

        lhs.add("Delhi");
        lhs.add("Mum");
        lhs.add("Che");
        lhs.add("Pun");
        lhs.add("Delhi");
        lhs.add(null);
        lhs.add("bang");

        System.out.println(lhs); // order retainer


    }
}
