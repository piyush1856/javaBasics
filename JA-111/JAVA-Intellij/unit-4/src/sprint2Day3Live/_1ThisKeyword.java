package sprint2Day3Live;

public class _1ThisKeyword {
    // this points to current object
    // static is related to a class not to any object
    // but 'this' is not related to a class
    int x=10;

    void fun(){
        int x=1000;
        System.out.println(this);  //this will print address of current object
        // this keyword can access the instance variable of the current object.
        System.out.println(this.x);// 10 -- this refers to current object
        System.out.println(x); //1000
    }

    public static void main(String[] args) {
        int x=100;
        _1ThisKeyword object = new _1ThisKeyword();
        System.out.println(object);  // it will also print the address of the object
        object.fun();//this will print address of current object

        System.out.println(object.x);
        //System.out.println(this.x);  -- error

        System.out.println(x); // 100

        // you can't refer to this keyword from static area
    }
}
