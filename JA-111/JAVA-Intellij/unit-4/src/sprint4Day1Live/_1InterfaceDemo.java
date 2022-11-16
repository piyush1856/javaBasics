package sprint4Day1Live;

public class _1InterfaceDemo {
    // Basically A contract
    // To provide some rule and flexibility
    // defines behaviour of a class

    public static void main(String[] args) {
        StudentOfMasai student = new StudentOfMasai();
        System.out.println(MasaiStudentContract.fee);
    }
}

interface Shape {

}

interface MasaiStudentContract{
    public static final double fee =0;  //public static final ny nature(write or don't write it)

}

class StudentOfMasai implements MasaiStudentContract{

}
//hierarchy :-
// interface(100% abstraction -- before java 8)
// -> abstract class (partially abstract)
// -> concrete class(0% abstraction)
