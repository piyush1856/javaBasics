package sprint4Day3Assingment._2QuestionNumber2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        StudentBean student1 = new StudentBean(56,98,"Piyush");
        StudentBean student2 = new StudentBean(57,97,"Krishna");
        StudentBean student3 = new StudentBean(58,96,"Tyagi");
        StudentBean student4 = new StudentBean(59,95,"Piyush Tyagi");

        Map<StudentBean, String> studentToState = new TreeMap<>();

        studentToState.put(student1,"Jharkhand");
        studentToState.put(student2,"Bihar");
        studentToState.put(student3,"UP");
        studentToState.put(student4,"MP");

        //System.out.println(studentToState);

        for(StudentBean student : studentToState.keySet()){
            System.out.println(student + ":-->" +studentToState.get(student));
        }

    }
}
