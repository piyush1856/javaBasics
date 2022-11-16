package sprint3Day2Live;

import sprint2Day4Live.Student;

//methods and notes in Object class
public class _2ObjectClass {
    public static void main(String[] args) {
        //Object object;
        // all the java class has object as the root class

        //Object id a class, and it is a super class of everything in java
        //it is the root class

        Object object;

        MyClass myClass = new MyClass();
        System.out.println(myClass);  //it will simply print the address of myClass if nothing is there in myClass object
        //whatever written inside toString() method inside Object class will be printed
        //myClass.toString();

        Student student = new Student("Piyush");
        System.out.println(student);
        //if toString method is not present it will print the address on default Object class
        //after override toString method is introduced it is printing the input message


        Student[] students = {student, new Student("tyagi")};

        for (Student s:students
             ) {
            System.out.println(s);
        }


    }
}

class MyClass extends Object{
    String message = "How have you been ?";

    @Override  //because toString is also present on Object class
    public String toString(){
//        System.out.println("abcd");
        return message;
    }
    // toString is already present inside Object class so, it will print the string (message)


}


