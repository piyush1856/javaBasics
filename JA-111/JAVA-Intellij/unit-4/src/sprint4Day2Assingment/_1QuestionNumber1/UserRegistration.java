package sprint4Day2Assingment._1QuestionNumber1;

import java.util.Scanner;

public class UserRegistration {
    static void registerUser(String username,String userCountry) throws InvalidCountryException {
        if(userCountry.equals("India")){
            System.out.println("User registration done successfully");
        }else{
            throw new InvalidCountryException("User Outside India cannot be registered");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = scanner.next();
        System.out.println("Enter Your Country");
        String country = scanner.next();
        scanner.close();

        try {
            registerUser(name,country);
        }catch (InvalidCountryException exception){
            System.out.println(exception.getMessage());
        }

    }
}
