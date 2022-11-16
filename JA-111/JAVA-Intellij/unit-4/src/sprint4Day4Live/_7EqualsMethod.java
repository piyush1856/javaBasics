package sprint4Day4Live;

public class _7EqualsMethod {


    public static void main(String[] args) {
        Plant snakePlant = new Plant(5,"DarkGreen");
        Plant moneyPlant = new Plant(50,"Green");
        Plant moneyPlant2 = new Plant(50,"Green");

        System.out.println(snakePlant.equals(moneyPlant)); //false
        System.out.println(moneyPlant.equals(moneyPlant2)); //false by default but
        // after overriding equals() method it will print true

        //our definition : if color and height of two plant are same, they should be treated  same
        //jvm definition : if the address of the two plants are diff they will be treated different

        //So, we need overridden equals() method

        /*
        * Properties of toEqual():
        *   1. Symmetric : if x.equal(y) than y.equal(x)
        *   2. Reflexive : x.equal(x) should be true
        *   3. Transitive : if x.equal(y) and y.equal(z) are true then x.equals(z) is also true
        *   4. Consistent : x.equals(y) it will give same result everytime unless the values are not changed
        *
        * */




    }
}
