package sprint4Day2Assingment._3QuestionNumber3;

public class Account {
    String accountNumber;
    double balance;

    void deposit(Integer amount){
        this.balance += amount;
    }

    double withdraw(Integer withdraw) throws InsufficientFundsException {

        if(balance>=withdraw){
            this.balance -= withdraw;
            System.out.println("Transaction Successful, Collect Your Amount :" + withdraw);
            return balance;

        }else{
            throw new InsufficientFundsException("Transaction Failed, Insufficient Balance");
        }
    }

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
