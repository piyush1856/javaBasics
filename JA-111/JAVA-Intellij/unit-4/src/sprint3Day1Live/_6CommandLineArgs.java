package sprint3Day1Live;



public class _6CommandLineArgs {
    public static void main(String[] args) {
        // default length :- 0

        //after modifying run command
        System.out.println(args.length); //2

        // weProblem - use foreach loop to print all  the args;

        for (String i : args) {
            System.out.println(i);
        }
    }
}
//right click --> modify run command
// Strings[][] args = {"one", "two"}
