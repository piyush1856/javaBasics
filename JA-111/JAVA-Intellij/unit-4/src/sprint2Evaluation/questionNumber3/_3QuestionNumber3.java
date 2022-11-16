package sprint2Evaluation.questionNumber3;
//Explain has-A relationship with a code example
public class _3QuestionNumber3 {
    /*
    *  has-A relationship means :
    *   1. It is known as composition
    *   2. It means instance of one class has relationship with other class.
    *   3. It can be used and shared between one or many classes.
    *   4. It is used for code re-usability.
    * */

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Piyush";
        person.city = "city-godda";

        System.out.println(person.city);


        Office office = new Office();
        office.companyName ="Piyush & Co.";
        //creating address
        Address masaiAddress = new Address();
        masaiAddress.city = "Delhi";
        masaiAddress.zip= "52454";
        //assigning this address to office
        office.address = masaiAddress;
        System.out.println(office.companyName);
        System.out.println(office.address.city);
    }
}

