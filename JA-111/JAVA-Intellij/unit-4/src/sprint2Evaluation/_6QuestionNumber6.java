package sprint2Evaluation;
//Write a function that takes a string “s” and an integer “i” as an
//argument. It should return the first “i” characters.
//E.g.
//sample input (“abcde”, 3)
//output “abc”
//You can assume that the value of i is less than the size of the
//String. You should not use any loop statement.

public class _6QuestionNumber6 {

    static String firstICharacter(String s, int i){
//        System.out.println(s.substring(0,i));

        return s.substring(0,i);
    }

    public static void main(String[] args) {
        String x = firstICharacter("piyush", 3);
        System.out.println(x);
    }
}
