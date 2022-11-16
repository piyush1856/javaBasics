package sprint2Day2Live;

public class _2ObjectCollaboration {
    //object interact each other
    // Has-A relationship

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "xyz";
        person.city = "city-godda";
        person.zip ="656535";
        System.out.println(person.city);


        Office office = new Office();
        office.companyName ="Masai School";
        //creating address
        Address masaiAddress = new Address();
        masaiAddress.city = "BLR";
        masaiAddress.zip= "524553";
        //assigning this address to office
        office.address = masaiAddress;
        System.out.println(office.companyName);
        System.out.println(office.address.city);
    }
}

class Person{
    String name;
    String city;
    String zip;
}

class Office{
    String companyName;
//    String city;
//    String zip;
    Address address;  //composition - one object is present nested inside other obj

    //or
//    static class Address{
//        String city;
//        String zip;
//    }
    // this is static inner class --> it restrict the reuse of address class
}

//claas address is introduced because some things are common in both the above object
class Address{
    String city;
    String zip;
}
