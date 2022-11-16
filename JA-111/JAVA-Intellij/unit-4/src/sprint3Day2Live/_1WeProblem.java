package sprint3Day2Live;

public class _1WeProblem {
    /*
    * class RBIBank
    * getRoI() : Int 0
    *
    * class HDFC
    * override getRoI() : 8
    *
    * class SBI child of Bank
    * getRoI(): 7.5
    * */
    public static void main(String[] args) {
        RBIBank rbi = new RBIBank();
        System.out.println(rbi.getRoI());


        HDFC hdfc = new HDFC();
        System.out.println(hdfc.getRoI());


        SBI sbi = new SBI();
        System.out.println(sbi.getRoI());
    }

}

class RBIBank{
    int getRoI(){
        return 0;
    }
}

class HDFC extends RBIBank{
    @Override
    int getRoI(){
        return 8;
    }
}

class SBI extends RBIBank{
    @Override
    int getRoI(){
         return (int) 7.5;
    }
}
// you can use double type return