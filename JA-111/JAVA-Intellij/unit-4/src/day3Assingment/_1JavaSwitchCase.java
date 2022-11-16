package day3Assingment;

public class _1JavaSwitchCase {
    public static void main(String[] args) {
        printCity("Mumbai");
        printCity("Kolkata");
        printCity("Delhi");
        printCity("Bangalore");
        printCity("Godda");
    }
    public static void printCity(String city){
        switch (city){
            case "Mumbai":
                System.out.println("Financial city");
                break;
            case "Kolkata":
                System.out.println("City of Joy");
                break;
            case "Delhi":
                System.out.println("Capital of the country");
                break;
            case "Bangalore":
                System.out.println("Cyber City");
                break;
            default:
                System.out.println("May be Other Indian City");
        }
    }
}
