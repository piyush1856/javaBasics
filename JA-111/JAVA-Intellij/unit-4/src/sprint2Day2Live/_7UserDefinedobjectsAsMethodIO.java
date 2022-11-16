package sprint2Day2Live;

public class _7UserDefinedobjectsAsMethodIO {
    public static void main(String[] args) {
        Employee emp= new Employee();
        emp.age=23;

        System.out.println(myMethod(emp));

        Employee employee1 = createObject();
//        employee1.age=100; --> work when createObject return new Employee()
        //System.out.println(employee1.age); // npe error
        //to avoid error
        if(employee1==null){
            System.out.println("employee is null");
        }else{
            System.out.println(employee1.age);
        }
    }

    static int myMethod(Employee employee){

        return employee.age;
    }

    static  Employee createObject(){
//        return new Employee();
        //also you can
        return null;
    }

    //null is the subtype of all the objects.

}

class Employee{
    int age;
}
