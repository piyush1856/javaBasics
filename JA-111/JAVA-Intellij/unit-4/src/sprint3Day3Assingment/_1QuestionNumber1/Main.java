package sprint3Day3Assingment._1QuestionNumber1;

public class Main {
    public static void main(String[] args) {

//        Address address = new Address();
//        address.city ="Ranchi";
//        address.state="Jharkhand";
//        address.pinCode="814133";
//
//        //System.out.println(address);
//
//        Student student = new Student();
//
//        student.courseEnrolled="Full Stack";
//        student.studentId=843;
//        student.courseFee=300000;
//        student.address=address;
//
//        System.out.println(generatePerson(student));

//        Person newStudent = generatePerson(new Student(843,"ja111",300000,address));
//        System.out.println(newStudent);




//        Instructor instructor = new Instructor();
//        instructor.address=address;
//        instructor.instructorId=658;
//        instructor.salary=3000000;
//        instructor.address.city ="Bangalore";
//        instructor.address.pinCode="546564";
//        instructor.address.state="Karnataka";
//
//        System.out.println(generatePerson(instructor));


        Person newStudent = generatePerson(new Student());
        System.out.println(newStudent);

        Person newInstructor = generatePerson(new Instructor());
        System.out.println(newInstructor);




    }


    public static Person generatePerson(Person person){
//        return person;



        if(person instanceof Student ){
            Address address = new Address();
            address.city ="Ranchi";
            address.state="Jharkhand";
            address.pinCode="814133";

            Student student = new Student();

            student.courseEnrolled="Full Stack";
            student.studentId=843;
            student.courseFee=300000;
            student.address=address;

            return student;

        }else if(person instanceof Instructor){
            Address address = new Address();
            address.city ="Bangalore";
            address.state="Karnataka";
            address.pinCode="546546";

            Instructor instructor = new Instructor();

            instructor.instructorId=546;
            instructor.salary=5000000;
            instructor.address=address;
            //instructor.name="Arjun";

            return instructor;
        }else{
            return null;
        }
    }
}
