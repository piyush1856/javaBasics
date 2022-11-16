package sprint3Evaluation._1QuestionNumber1;

class PermanentEmployee extends Employee{
    private double basicPay;
    double pfAmount;

    public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
        super(employeeId, employeeName);
        this.basicPay = basicPay;
        this.pfAmount =0.12*basicPay;
    }

    @Override
    void calculateSalary(){
        this.salary = (this.basicPay- this.pfAmount);
    }
}
