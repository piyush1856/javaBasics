package sprint2Day1Assingment;

public class Student {
    int roll;
    String name;
    int marks;

    public void displayStudentDetails(){
        System.out.println("Roll is : " + roll);
        System.out.println("Name is : " + name);
        System.out.println("Mark is : " +marks);
    }

    public static void main(String[] args) {
        Student s1=new Student();
        s1.roll=5;
        s1.name="Piyush";
        s1.marks=100;
        s1.displayStudentDetails();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Student s2 = new Student();
        s2.roll=8;
        s2.marks=101;
        s2.name="Krishna";
        s2.displayStudentDetails();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        //making object eligible for garbage collector -- don't know this is right or wrong
        s1 =null;
        s2=null;

    }
}
