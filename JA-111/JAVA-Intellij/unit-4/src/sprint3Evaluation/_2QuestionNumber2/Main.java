package sprint3Evaluation._2QuestionNumber2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of Students : ");
        int noOfStudents = scanner.nextInt();

        StudentJavaBean[] studentData = new StudentJavaBean[noOfStudents];

        for(int i=0;i<noOfStudents;i++){
            int index = i+1;
            System.out.println("Enter name of Student" + index);
            String name = scanner.next();
            System.out.println("Enter Marks of Student" + index);
            Integer marks = scanner.nextInt();

            StudentJavaBean student = new StudentJavaBean(name,marks);
            studentData[i] = student;
        }
        int totalMarks =0;
        for(int i=0;i<studentData.length;i++){
            System.out.println(studentData[i]);
            totalMarks+=studentData[i].getMarks();
        }

        System.out.println("Average marks of all the student are : "+ (double) totalMarks/noOfStudents);
    }
}
