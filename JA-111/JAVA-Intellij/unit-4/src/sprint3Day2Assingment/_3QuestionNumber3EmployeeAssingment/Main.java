package sprint3Day2Assingment._3QuestionNumber3EmployeeAssingment;

public class Main {
    public static void main(String[] args) {

        Employee employee=new Employee();

        employee.name="Piyush";
        employee.age=24;
        employee.phoneNumber="9874563210";
        employee.address="Godda, Jharkhand";
        employee.salary = 4.4;
        employee.department ="Marketing And Advertisement";
        employee.specialisation="Marketing Management";


        Manager manager=new Manager();

        manager.name="Krishna";
        manager.age=23;
        manager.phoneNumber="9855646865";
        manager.address="Ranchi, Jharkhand";
        manager.salary =5.5;
        manager.department ="Human Resource";
        manager.specialisation="Human Resource Management";


        Member[]  memberArray = new Member[2];
        memberArray[0] = employee;
        memberArray[1] = manager;

        ;
        for(int i=0;i< memberArray.length;i++){

            if(i==0){
                System.out.println("Description of Employee:-");
            }else{
                System.out.println("Description of Manager:-");
            }

            System.out.println("Name : " + memberArray[i].name);
            System.out.println("Age : " + memberArray[i].age);
            System.out.println("Address : " + memberArray[i].address);

            System.out.print("Salary : ");
            memberArray[i].printSalary();

            if(i==0){
                System.out.println("Department : " + employee.department);
                System.out.println("Specialisation : " + employee.specialisation);
            }else{
                System.out.println("Department : " + manager.department);
                System.out.println("Specialisation : " + manager.specialisation);
            }

            System.out.println("*********************************************************");

        }

    }
}
