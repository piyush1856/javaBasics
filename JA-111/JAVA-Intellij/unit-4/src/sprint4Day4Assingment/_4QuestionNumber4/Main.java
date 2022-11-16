package sprint4Day4Assingment._4QuestionNumber4;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Employee> collectionOfEmployeeData = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        System.out.println("...Welcome to Employee Management System....");


        while(true){

            System.out.println("Do you want to Enter the detail of Employee: ? (Y/N)");
            String employeeDetailCollectionChoice = input.next();

            int i=1;

            if(employeeDetailCollectionChoice.equalsIgnoreCase("y")){

                System.out.println("Enter the Employee Details : "+i);

                System.out.println("Enter the Employee Id:");
                int employeeId = input.nextInt();

                System.out.println("Enter the Employee Name:");
                String employeeName = input.next();

                System.out.println("Enter the Employee Salary:");
                double employeeSalary = input.nextDouble();

                System.out.println("Enter the Department Id:");
                int departmentId = input.nextInt();

                System.out.println("Enter the Department Name:");
                String departmentName = input.next();

                Department department = new Department(departmentId,departmentName);
                Employee employee = new Employee(employeeId,employeeName,employeeSalary,department);

                collectionOfEmployeeData.add(employee);

                System.out.println("Employee Details added successfully..");
                i++;

            }else if(employeeDetailCollectionChoice.equalsIgnoreCase("n")){
                System.out.println("Thank you---");
                break;
            }
        }


        while(true){

            System.out.println("Enter the your choice");

            System.out.println("1: Find Employee in Particular Department");
            System.out.println("2: Remove Particular Employee");
            System.out.println("3: Print Employees in All Departments");

            int employeeCollectionAccessChoice = input.nextInt();

            if(employeeCollectionAccessChoice == 1) {

                System.out.println("Enter the Department Id:");
                int departmentId = input.nextInt();

                System.out.println("Employee in Department: "+departmentId);

                for(int i=0;i<collectionOfEmployeeData.size();i++) {
                    if(collectionOfEmployeeData.get(i).getDepartment().getDepartmentId() == departmentId) {

                        System.out.println("Employee Name: "+collectionOfEmployeeData.get(i).getEmployeeName());
                        System.out.println("Employee Id: "+collectionOfEmployeeData.get(i).getEmployeeId());
                        System.out.println("Employee Salary: "+collectionOfEmployeeData.get(i).getEmployeeSalary());

                        System.out.println("==========================================================");
                    }
                }

            }else if(employeeCollectionAccessChoice ==2 ){

                System.out.println("Enter the Department Id:");
                int departmentId = input.nextInt();
                System.out.println("Enter the Employee Id:");
                int employeeId = input.nextInt();

                boolean flag = false;
                Employee removedEmployee = null;
                for(Employee i:collectionOfEmployeeData) {
                    if(i.getEmployeeId() == employeeId && i.getDepartment().getDepartmentId() == departmentId) {
                        collectionOfEmployeeData.remove(i);
                        //System.out.println(i.getEmployeeName()+ " Employee is removed from the "+ i.getDepartment().getDepartmentId()+ " Department Succesfully.");
                        flag = true;
                        removedEmployee=i;
                        break;
                    }
                }

                if(flag){
                    System.out.println(removedEmployee.getEmployeeName()+ " Employee is removed from the "+ removedEmployee.getDepartment().getDepartmentId()+ " Department Succesfully.");

                }else{
                    System.out.println("ERROR 404 : Employee Not Found");
                }

            }else if(employeeCollectionAccessChoice == 3){
                if(collectionOfEmployeeData.size()==0) {
                    System.out.println("No Employee Data Exists ..");
                }
                else {
                    for (Employee e:collectionOfEmployeeData) {
                        System.out.println(e);
                    }
                }
            }


            System.out.println("Do you want to Exit: ? (Y/N)");
            String choiceFinal = input.next();

            if(choiceFinal.equalsIgnoreCase("y")) {
                System.out.println("Thank you...");
                break;
            }
        }



    }
}
