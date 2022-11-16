package day1;

import javax.sound.midi.SysexMessage;

public class _6Student {
    //state --> variable
    int age; // 4 byte
    String name;
    static String batchName = "JA-111";

    public static void main(String[] args){
        _6Student s1 = new _6Student();
        s1.age = 34;
        s1.name = "baklol";
        //s1.batchName = batchName; = s1.batchName
        System.out.println(s1.age+" "+s1.name+" "+ _6Student.batchName);
        //since batchname is static it is associated with Student class


        _6Student s180 = new _6Student();
        //System.out.println(s1);

        //syntax to call a method
        //<object name>.<method name>
        s1.play();

        //assigning object to null object
        _6Student student;
        student=s1;
        //System.out.println(student);
        //System.out.println(student.name);


        _6Student studentNullObject=null;
        //NPE: null pointer exception
        //System.out.println(studentNullObject.name); --> error(NPE)
        //this is something like accessing null.name



    }
    // 'new' will allocate some memory to instance variable
    // it also gives default value


    // behaviour --> method
    void play(){
        System.out.println(name+" is playing ...");
    }
}

//assignment : 5 min:
/*
* create another class
* how to print the batchName
* */
//assignment: 5 min:
//class AnotherClass{
//    public static void main(String[] args) {
//        Student s1= new Student();
//        s1.age=24;
//        s1.name="Abhinav";
//        //System.out.println(batchName); ? Why
//        //how to print the batch name?
//    }
//}
