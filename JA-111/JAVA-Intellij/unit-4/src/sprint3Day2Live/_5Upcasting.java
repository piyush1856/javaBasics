package sprint3Day2Live;

public class _5Upcasting {
    public static void main(String[] args) {
        Mother mother = new Mother();
        Daughter daughter = new Daughter();

        //base class (variable) can have subclass reference.
        Mother mother1 = new Daughter(); //upcasting

        String s="aasdfasdf";
        Object o="asdf";//upcasting. Since Object class is super class of all object it can also hold string or anything
        Object o1;
        o1=new Mother();//upcasting.  //same as above

        //parent class object referring to child class is called upcasting
    }
}

class Mother{

}

class Daughter extends Mother{

}