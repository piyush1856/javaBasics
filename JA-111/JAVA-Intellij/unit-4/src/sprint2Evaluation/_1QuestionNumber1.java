package sprint2Evaluation;
//Explain the difference between == operator and equals() method with a code example.

public class _1QuestionNumber1 {

    /*
    * The basic difference between == and equals() method is :
    *   1. == is a operator whereas, equals() is a method in JAVA.
    *   2. == compares the memory address as well as value/content of two string/object. but, equal() method compares
    *      the only content/value of the string not the address.
    *
    *   // Please refer to the below program for better understanding :-
    * */

    public static void main(String[] args) {
        String x = "xyz"; // string literal --> String pool
        String y = "xyz";
        String z = new String("xyz");  //String with new operator --> heap area
        String a = "abc";

        System.out.println(x==y);  // the output is 'true' because the address and content of both the string is same.

        System.out.println(x.equals(y)); // the output is 'true' because the content and address of both the string is same.


        System.out.println(x.equals(z)); // the output is 'true' because the address and content of both the string is same.


        System.out.println(x==z); // the output is 'false' because the address of both the string is different although
                                // the value/content is same. The address is different because 'new' keyword is used in
                                // z string, which stores it in different address. In object method it is stored in heap
                                // area whereas in literal method string is created in  String pool.

        System.out.println(x==a);//the output is 'false' because the content/value of both the string is different although
                                // address is same.

    }
}
