package sprint3Day3Assingment._1QuestionNumber1;

public class Person {

    String name;
    String gender;
    Address address;

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address=" + address +
        '}';
    }
}
