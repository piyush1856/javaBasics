package sprint3Day4Assingment._1QuestionNumber1;
import java.util.Scanner;
public class StudentBean {
    private int roll;
    private String name;
    private int marks;
    private char grade;



    public void displayDetail(){
        StudentBean student = new StudentBean();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name of student");
        student.name=sc.next();
        System.out.println("Enter Roll no");
        student.roll=sc.nextInt();
        System.out.println("Enter Marks");
        student.marks=sc.nextInt();

        student.grade=calculateGrade(student.marks);

        System.out.println(student);
    }

    private char calculateGrade(int marks){
        //char grade;
        if( marks >= 500){
            this.grade = 'A';
        }else if (marks < 500 && marks >= 400){
            this.grade = 'B';
        }else if(marks<400){
            this.grade = 'C';
        }
        return this.grade;
    }

    @Override
    public String toString() {
        return "Student Detail[" +
                "Roll=" + roll +
                ", Name='" + name + '\'' +
                ", Marks=" + marks +
                ", Grade=" + grade +
                ']';
    }
}
