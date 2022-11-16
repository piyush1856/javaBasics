package sprint2Day3Live;

public class _7Immutability {

    //Strings are immutable (constant/unchanged)

    public static void main(String[] args) {

        String x= "hi"; //["hi"]  x --> hi
        String y = "hi";
        // x and y will point to same things
        String z = "hello";
        // but z will point to different thing

        String w = "hiThere";

        String temp =x; // x --> hii, temp --> s --> hi, temp-->hii

        x=x+x;// ["hi", "hihi"]  x --> hihi    temp-->hi
        System.out.println(x); //hihi     temp --> hi
        //but, x=x+x  -- "hi will not change in memory or its content
        //a new string will be formed
        System.out.println(temp); // value of temp not changed so, string are immutable

        String a= "piyush";
        String b=a;
        a="Tyagi";
        System.out.println(a);
        System.out.println(b);


         // string builder
        //it is mutable
        StringBuilder stringbuilder = new StringBuilder("mutable");
        stringbuilder.append("appended");
        System.out.println(stringbuilder);

        String string ="immutable";
        string.concat("appemded");
        System.out.println(string);

        //conversion from stringBuilder to String
        stringbuilder.toString();
        //conversion from string to StringBuilder
        StringBuilder builder = new StringBuilder(string);


        //compareTo
        System.out.println("abc".compareTo("xyz"));
        //every char will be converted to its unicode value, which is numeric,
        // and it will subtract first string - second string
        StringBuilder builder1 = new StringBuilder();
        builder1.append('a');
        System.out.println(builder1);

    }
}
