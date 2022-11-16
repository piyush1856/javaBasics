package sprint4Day2Live;

import java.io.Serializable;

public class _1MarkerInterface {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
    }

}

interface MyMarkerInterface{}
class MyClass implements Serializable, Cloneable {  //tag : Serialized, cloneable
    int i;

    //these will just mark
}
