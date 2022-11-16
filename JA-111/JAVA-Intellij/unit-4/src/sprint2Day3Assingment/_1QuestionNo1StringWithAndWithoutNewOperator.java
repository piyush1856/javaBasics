package sprint2Day3Assingment;
       /*
            Q1.  Is there any difference between creating a string with and without a new operator?
                 Explain with an example.
        */


public class _1QuestionNo1StringWithAndWithoutNewOperator {

    /*  There are two-way to create a String :
        1. String Literal:
                In string literal String is made with double quotes.
                eg: String s= "Hello World";
                In literal method string is created in "String pool"  area and this also helps in reusing of
                string. If a string is already exist in the string pool area, a new string will not be created
                rather the existing one will be reused.

        2. String with 'new' keyword :
                In this method a String is made with the help of new keyword. In the heap area a new object
                is created with new keyword, hence, a new  address is created for each string created by this
                method.
                eg : String s2 = new String("Hello World");
     */

    public static void main(String[] args) {
        //Illustration :
        String s= "Hello World";                             // string literal method
        String s2 = new String("Hello World");        // String with new keyword

        System.out.println(s == s2);   // output : False, because, the address is different although the content is same

        String s1= "Hello World";
        System.out.println(s == s1);  // output : True, because, the existing one (s) is reused when s1 is declared.

        String s3 = new String("Hello World");
        System.out.println(s2==s3);  // output : False, a new  address is created for each string created by 'new'
    }


}
