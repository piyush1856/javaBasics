package sprint2Evaluation;
//Write a function that asks the user to input his/her name and age
//(use Scanner class) and prints the same on the console

import  java.util.Scanner;
public class _4QuestionNumber4 {
    String name;
    int age;
    public static void main(String[] args) {
        _4QuestionNumber4 user = new _4QuestionNumber4();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Name :");
        String userName = scanner.next();

        System.out.println("Enter Your Age :");
        int userAge = scanner.nextInt();

        user.name = userName;
        user.age = userAge;

        System.out.println("User Name : " + user.name);
        System.out.println("User Age : " + user.age);


        scanner.close();
    }
}
