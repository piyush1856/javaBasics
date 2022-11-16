package sprint2Day3Live;

public class _2CallingAConstructorUsingThis {
    int x;

    _2CallingAConstructorUsingThis(){
        this(10); // this will point to current constructor
        System.out.println("default constructor");

        //this(10); -- error -- because this should be at top -- always should be first statement in a constructor
    }

    _2CallingAConstructorUsingThis(int x){

        System.out.println("1 args constructor");
    }

    public static void main(String[] args) {
        //this keyword cannot be used in static area
        _2CallingAConstructorUsingThis object = new _2CallingAConstructorUsingThis();

    }
}
