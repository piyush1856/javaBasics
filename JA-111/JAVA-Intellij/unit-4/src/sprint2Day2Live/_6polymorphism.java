package sprint2Day2Live;

public class _6polymorphism {
    public static void main(String[] args) {
        Sum sum = new Sum();

        System.out.println(sum.add(2,3,4));
        System.out.println(sum.add(2,3));
        //compiler automatic call the method even method name is same, here it is calling the method based on argument
        // upon no. of argument


        System.out.println(sum.square(5));
        //here it will call int instead of byte although method name is same because int is default in java

        System.out.println(sum.square((byte) 6.9)); // here byte will be called

    }
}

class Sum{
    //polymorphism Type 1-
    // static binding --> compile time polymorphism --> method overloading
    // type-2 learn later

    int add(int x,int y){
        return x+y;
    }

    String add(int x, int y, int z){
        return  "x+y+z";
    }

    int square(int x){
        return x*x;
    }

    int square(byte b){
        return b*b;
    }
}

/*
* rules of overloading :
*  1. return type can be same or different
*  2. argument list should be different
*  3.
* */
