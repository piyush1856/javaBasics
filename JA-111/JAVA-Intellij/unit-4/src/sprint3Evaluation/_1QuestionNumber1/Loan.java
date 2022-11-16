package sprint3Evaluation._1QuestionNumber1;

public class Loan {
    public double calculateLoanAmount(Employee employeeObj){
        //double loanAmount;
        if(employeeObj instanceof PermanentEmployee){

//            double salary = employeeObj.salary;
//            loanAmount = salary*15/100;
            return (double) employeeObj.salary*0.15;
        }else if(employeeObj instanceof TemporaryEmployee){
//            double salary = employeeObj.salary;
//            loanAmount = salary*10/100;
            return (double) employeeObj.salary*0.1;
        }
        return -1;
    }
}
