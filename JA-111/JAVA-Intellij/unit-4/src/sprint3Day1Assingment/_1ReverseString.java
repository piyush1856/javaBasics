package sprint3Day1Assingment;

import java.util.Scanner;

public class _1ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to reverse");
        String originalString = sc.next();
        String result = reversString(originalString);
        System.out.println("Original String is :"+ originalString);
        System.out.println("Reversed String is :"+ result);
    }

    public static String reversString(String input){
        //StringBuilder sb=new StringBuilder("");
        String sb=new String("");

        for(int i=input.length()-1;i>=0;i--){
            //sb.append(input.charAt(i));
            sb = sb.concat(input.substring(i,i+1));  //will be slow and use more space so use stringBuilder
        }

        //String ans=sb.toString();
        return sb;
    }

}
