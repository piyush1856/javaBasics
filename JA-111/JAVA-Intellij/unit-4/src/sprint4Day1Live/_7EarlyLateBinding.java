package sprint4Day1Live;

public class _7EarlyLateBinding {


    public static void main(String[] args) {
        Parent parent= new Parent();
        parent.hi();

        Parent p;
      /*  p=new Parent();
        p=new Child();
        p=null;
        */
        //late binding
        //p.hi();

        EarlyBinding earlyBinding= new EarlyBinding();
        //early binding
        earlyBinding.hi();
    }
}


class Parent{
    void hi(){
        System.out.println("line 17");
    }
}
class Child extends Parent{
    void hi(){
        System.out.println("line 22");
    }
}

class EarlyBinding{
    void hi(){
        System.out.println("line 29");
    }
}
