package sprint4Day4Live;

public class _8HashCode {
    // obj1,obj2 --> address (all obj are given some address)
    //where does this address come from :
    //hashFunction() somewhere in the jvm that take any obj and returns an int value
    // int hashFunction(obj)
    //this hashFunction is also called hashCode : int hashCode(Object obj)

    public static void main(String[] args) {
        Plant plant = new Plant(10,"Rose");
        int i = plant.hashCode();
        System.out.println(i);

        String num ="Piyush";
        int j=num.hashCode();
        System.out.println(j);
    }



}
