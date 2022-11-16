package sprint3Day3Live;
//diff between final, finally, finalize
public class _2FinalKeyword {

    public static void main(String[] args) {
        //Final Keyword :
        // can be applied to a variable, class, method

        //Variable :
        final int i=10;
        //value of i cannot be changed
        //i++;

        final int j;
        j=20; // only once it can be done since it is not initialized
        //j++ -> cannot be done


        //final method :-
    }
}

//method final
class A{
    void nonFinal(){

    }

    final void  finalMethod(){
        //it cannot be overridden.
        //it is just opposite of overriding.

        //but, it can be overloaded
    }
}

class B extends A{
    @Override
    void nonFinal(){

    }

//    @Override
//    void finalMethod(){
//        //can't be overwrite --> compile time error
//    }

}

//RBI() - non final decideRoI(); final repoRate(){return 5.5%}

final class Shape{
    final double pi=22/7;
}
//class Circle extends Shape{
//    //CT error
//}

//if a class is final, it can't be inherited(can't be extended)