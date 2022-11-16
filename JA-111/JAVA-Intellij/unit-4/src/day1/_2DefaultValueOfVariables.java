package day1;

public class _2DefaultValueOfVariables {
    // int x= 10;
    // if a variable present inside a class is called instance variable
    // x is non-static
    static int x= 10;
    int instanceVariableWithoutAValue;

    public static void main(String[] args){
        //this is static area
        int y=5; // inside a method : local variable

        System.out.println(y); // print y
        //System.out.println(x); // error due to int x =10;
        // to run this make int x static
        // this is due to reason that non-static can run in static
        //either introduce static keyword or new keyword(not so simple, it will make object in memory)
        System.out.println(x);

        int localVariableWithoutAValue; // no default value

        _2DefaultValueOfVariables object = new _2DefaultValueOfVariables();
        System.out.println((object.instanceVariableWithoutAValue)); // it will print default value 0;

        //System.out.println(localVariableWithoutAValue); erroe due to no value, local variable has no default value
        // therefore firt initailize it
        localVariableWithoutAValue = 100;
        System.out.println(localVariableWithoutAValue); // now no error




    }
}
