package sprint4Day1Live;

public class _11VarArgs {
    void print(int a){
        System.out.println(a);
    }

    void print(Integer ... integers){
        for (Integer i: integers
             ) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        _11VarArgs obj = new _11VarArgs();
        obj.print(1);
        obj.print(1,2,3,4,5);
    }
}
