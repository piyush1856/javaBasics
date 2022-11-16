package sprint3Evaluation._3QuestionNumber3;

public class ExampleOfFinalKeyword {
    public static void main(String[] args) {

        //variable
        final int i;
        i=10; // initialized
        //i++; --> it will not work because of final keyword
    }
}
//final in method
class A{
    void notFinal(){

    }

    final void finalMethod(){
        //this cannot be overridden
    }
}
class B extends A{
    @Override
    void notFinal(){
        //no error
    }

//    @Override
//    void finalMethod(){
//        //compile time error
//    }
}

//final in class :
final class D{
    //this class cannot be extended further
}
