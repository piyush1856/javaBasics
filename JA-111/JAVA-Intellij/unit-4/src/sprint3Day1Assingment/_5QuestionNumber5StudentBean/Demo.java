package sprint3Day1Assingment._5QuestionNumber5StudentBean;

import java.util.Scanner;

class Demo {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter no of student obj need to be created");
        int NumberOfStudents=scanner.nextInt();

        StudentBean[] studentArr=new StudentBean[NumberOfStudents];

        for(int i=0;i<NumberOfStudents;i++){

            int studentNumber=i+1;

            StudentBean studentObject=new StudentBean();

            System.out.println("Enter Roll Number of student "+studentNumber);
            studentObject.setRoll(scanner.nextInt());
            System.out.println("Enter Name of student "+studentNumber);
            studentObject.setName(scanner.next());
            System.out.println("Enter address of student "+studentNumber);
            studentObject.setAddress(scanner.next());
            System.out.println("Enter Marks of student "+studentNumber);
            studentObject.setMarks(scanner.nextInt());

            studentArr[i]=studentObject;
        }
        int totalMarksOfAll =0;

        for (int i=0;i<studentArr.length;i++){
            int number=i+1;
            System.out.println("Student-"+number+ " Details :-");
            System.out.println("Roll Number of Student-"+number+ " :- "+ studentArr[i].getRoll());
            System.out.println("Name of Student-"+number+ " :- "+studentArr[i].getName());
            System.out.println("Address of Student-"+number+ " :- "+studentArr[i].getAddress());
            System.out.println("Marks of Student-"+number+ " :- "+studentArr[i].getMarks());

            System.out.println("************************************************");

            totalMarksOfAll += studentArr[i].getMarks();
        }

        System.out.println(" Average of all the Student marks = " + (double)totalMarksOfAll/NumberOfStudents);
    }
}
