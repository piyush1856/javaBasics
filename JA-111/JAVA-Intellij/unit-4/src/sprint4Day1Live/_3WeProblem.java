package sprint4Day1Live;

//create an interface printer-- Print() -- create concrete class
//create concrete classs File Printer

interface Printer{
    void print();
}

class FilePrinter implements Printer{
    @Override
    public void print(){
        System.out.println("File printing ..");
    }
}

class  ConsolePrinter extends FilePrinter{
    @Override
    public void print() {
        System.out.println("Printing in console ..");
    }
}


public class _3WeProblem {
    public static void main(String[] args) {
        FilePrinter filePrinter = new FilePrinter();
        filePrinter.print();

        ConsolePrinter consolePrinter = new ConsolePrinter();
        consolePrinter.print();

        System.out.println(filePrinter instanceof Printer);
        System.out.println(consolePrinter instanceof Printer);
        //class objects variable(not object class) are subType of parent Interface(super Type)
        //
        //System.out.println(FilePrinter instanceof Printer); //--> error
    }
}
