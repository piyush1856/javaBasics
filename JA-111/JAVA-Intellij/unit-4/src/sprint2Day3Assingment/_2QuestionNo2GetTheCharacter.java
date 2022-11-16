package sprint2Day3Assingment;
/*
       Q2. Write a Java program to get the character at the given index within the String.Take
       the input with the help of Scanner class

 */
import java.util.Scanner;
public class _2QuestionNo2GetTheCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String");
        String string = scanner.nextLine();

        System.out.println("Enter the character position you want to access");
        int position = scanner.nextInt();

        System.out.println("Character at position "+ position + " is :");
        System.out.println(string.charAt(position));

        scanner.close();



    }
}
