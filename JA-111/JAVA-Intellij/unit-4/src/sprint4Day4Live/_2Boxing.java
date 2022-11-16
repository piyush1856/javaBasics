package sprint4Day4Live;

public class _2Boxing {

    public static void main(String[] args) {
        int x= 10;
        //primitive to wrapper
        Integer wrapperInt = Integer.valueOf(x); // boxing
        Integer autoBoxing =x; //autoBoxing  -- same result as above


        //unboxing
        int primInt = wrapperInt.intValue(); //unboxing
        //same as
        int primInt2 = wrapperInt; // auto-unboxing

        //no need to remember
    }
}
