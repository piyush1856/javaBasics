package sprint4Day3Assingment._2QuestionNumber2;
import sprint2Day4Live.Student;

import  java.util.*;
public class StudentBean implements Comparable <StudentBean> {
    private  int roll;
    private int marks;
    private  String name;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudentBean(int roll, int marks, String name) {
        this.roll = roll;
        this.marks = marks;
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "StudentBean{" +
                "roll=" + roll +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(StudentBean s) {
        if(this.marks == s.marks){
            return 0;
        }else if(this.marks>s.marks){
            return 1;
        }else{
            return -1;
        }
    }

    @Override
    public  boolean equals(Object obj){

        StudentBean s1 = this;
        StudentBean s2 = (StudentBean) obj;

        if(s1.getRoll() == s2.getRoll() && s1.getName().equals(s2.getName()) && s1.getMarks() == s2.getMarks()){
            return true;
        }

        return false;

    }

    @Override
    public int hashCode() {
        return Objects.hash(roll, marks, name);

//        return roll;
//        return roll+marks;
//        return marks+name.hashCode();
    }
    //can return any number which should be unique like combination roll+marks or name.hashCode() etc



}
