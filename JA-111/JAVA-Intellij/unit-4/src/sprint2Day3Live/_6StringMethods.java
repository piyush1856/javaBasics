package sprint2Day3Live;

public class _6StringMethods {
    public static void main(String[] args) {
        String s1 ="hi";
        String s2 = "hello";

        //concatenation
        System.out.println(s1+s2);
        System.out.println(s1.concat(s2));

        //length
        "string".length();

        String s3 = "string";
        s3.charAt(3); // char at index 3

        //substring
        s3.substring((1)); //tring
        System.out.println(s3.substring(1,3)); // print index 1 to 2 -- 3 will be excluded

        String s5 ="helloThere";
        s5.indexOf('T'); //5
        s5.indexOf(("The"));
//        System.out.println(s5.indexOf(("The")));
        s5.lastIndexOf('e');

        // == operator compares the memory address of two string/object
        // eqaul() method: compares the content and not the address

        String x = "xyz";
        String y = "xyz";
        String z = new String("xyz");
        String w = "diff";
        String a = "XYZ";
        System.out.println(x.equals(y)); //true
        System.out.println(x==y);  // true
        System.out.println(x.equals(z)); // true0
        System.out.println(x==z); // false

        System.out.println(a.equals(x)); //false
        System.out.println(a.equalsIgnoreCase(x)); // true

        System.out.println("          sdfsg sdfgsgs      ".trim());
        System.out.println("          sdfsg sdfgsgs      ".replace('s', 'z').trim());







    }
}
