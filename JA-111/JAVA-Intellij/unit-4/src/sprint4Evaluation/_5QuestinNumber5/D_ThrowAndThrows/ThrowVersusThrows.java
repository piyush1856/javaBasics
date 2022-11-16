package sprint4Evaluation._5QuestinNumber5.D_ThrowAndThrows;

public class ThrowVersusThrows {
    public static void main(String[] args) {
        p();
    }
    static  void p(){

        try{
            n();
        }catch (Exception e){
            System.out.println("Exception Handled ..");
        }
    }

    static  void  n() throws Exception{  // 'throws' keyword
        m();
    }

    static  void m() throws Exception {// 'throws' keyword
        throw  new Exception("Error Occurred"); //'throw' keyword
    }
}
