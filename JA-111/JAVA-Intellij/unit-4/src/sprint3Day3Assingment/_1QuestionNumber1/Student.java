package sprint3Day3Assingment._1QuestionNumber1;

public class Student extends Person{
    int studentId;
    String courseEnrolled;
    int courseFee;

    @Override
    public String toString() {
        return "Student[" +
                "studentId=" + studentId +
                ", courseEnrolled='" + courseEnrolled + '\'' +
                ", courseFee=" + courseFee + ",address=" + address+
        ']';
    }

//    public Student(int studentId,String courseEnrolled,int courseFee,Address address){
//        this.studentId =studentId;
//        this.courseEnrolled=courseEnrolled;
//        this.courseFee= courseFee;
//        this.address=address;
//    }

    public Student() {
    }
}
