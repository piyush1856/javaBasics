package sprint3Evaluation._1QuestionNumber1;

public class Main {
    public static void main(String[] args) {
        Loan loan = new Loan();



        Employee permanentEmployee = new PermanentEmployee(45,"Piyush",1000);
        permanentEmployee.calculateSalary();
        System.out.println(loan.calculateLoanAmount(permanentEmployee));

        Employee temporaryEmployee = new TemporaryEmployee(56,"Krishna",20,50);
        temporaryEmployee.calculateSalary();
        System.out.println(loan.calculateLoanAmount(temporaryEmployee));

        System.out.println(loan.calculateLoanAmount(null));











//        double loanAmount=loan.calculateLoanAmount(permanentEmployee);
//        System.out.println(loanAmount);

    }
}
