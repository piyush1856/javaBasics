package sprint2Day2Live;

public class _8Constructor {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        MyClass anotherObject = new MyClass(10);
        System.out.println(anotherObject.variable);
    }
}

class MyClass{
    int variable;

    //default constructor
    MyClass(){
        System.out.println("default constructor");
    }
    MyClass(int var){
        variable = var;
    }

}

/*
*  Similarity between constructor and method:
*
*  both are function
*  both have argument list
*  both od then can be overloaded
* */

/* a constructor cannot be static because constructor deals with object
   and static deals with classes and both cannot stay together
*/

// constructor doesn't have a retur type
//method can have any name but constructor can only have same name as the class name


