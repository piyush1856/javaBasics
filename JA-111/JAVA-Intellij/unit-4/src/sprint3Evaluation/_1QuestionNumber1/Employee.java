package sprint3Evaluation._1QuestionNumber1;

abstract class Employee {
    int employeeId;
    String employeeName;
    double salary;

    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    abstract void calculateSalary();
}
