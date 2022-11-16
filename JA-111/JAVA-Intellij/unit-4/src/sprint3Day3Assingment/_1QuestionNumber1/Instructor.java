package sprint3Day3Assingment._1QuestionNumber1;

public class Instructor extends Person{
    int instructorId;
    int salary;

    @Override
    public String toString() {
        return "Instructor[" +
                "instructorId=" + instructorId +
                ", salary=" + salary+ ",address=" + address+
        ']';
    }
}
