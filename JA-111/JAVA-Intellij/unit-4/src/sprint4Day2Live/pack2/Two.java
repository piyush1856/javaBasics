package sprint4Day2Live.pack2;

import sprint4Day2Live.pack1.One;

public class Two extends One{
    public static void main(String[] args) {
        One one = new One();
        //one.hi();  // not accessible because it is private or default

        Two two = new Two();
        two.hello();// default is available with inheritance

    }
}
