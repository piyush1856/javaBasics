package sprint2Day3Assingment;
import java.util.Scanner;

public class Course {
    int courseID;
    String courseName;
    int courseFee;

    public void displayCourseDetails(){

        //Course course = new Course();

        System.out.println("Course ID : "+this.courseID);
        System.out.println("Course Name : "+this.courseName);
        System.out.println("Course Fees : "+this.courseFee);

    }

    public static void authenticate(String username, String password){

        if(username.equals("Admin") && password.equals("1234")){

            Course setTheValue = new Course();

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the Course ID");
            int newCourseID = scanner.nextInt();
            System.out.println("Enter the Course Name");
            String newCourseName = scanner.next();
            System.out.println("Enter the Course Fee");
            int newCourseFee = scanner.nextInt();
            scanner.close();


            setTheValue.courseID = newCourseID;
            setTheValue.courseName = newCourseName;
            setTheValue.courseFee = newCourseFee;

            setTheValue.displayCourseDetails();


        }else{
            System.out.println("Invalid Username or password");
        }
    }


    public static void main(String[] args) {
        authenticate("Admin", "1234");
        authenticate("piyush", "4568");
    }

}
