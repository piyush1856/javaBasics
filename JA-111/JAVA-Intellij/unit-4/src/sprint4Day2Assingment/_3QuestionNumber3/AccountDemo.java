package sprint4Day2Assingment._3QuestionNumber3;

import java.util.Scanner;

public class AccountDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Amount to be withdrawn");
        Integer withdraw = scanner.nextInt();

        Account account = new Account("1123456789");

        account.deposit(100);
        //System.out.println(account.balance);

        try{
            account.withdraw(withdraw);
        }catch(InsufficientFundsException exception){
            System.out.println(exception.getMessage());
        }

    }
}
