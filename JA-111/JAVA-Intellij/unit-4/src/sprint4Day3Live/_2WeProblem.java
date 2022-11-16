package sprint4Day3Live;

import java.io.IOException;

public class _2WeProblem {
    public static void main(String[] args) {
        p();
    }
    static void p(){
        try {
            n();
        } catch (IOException e) {
            System.out.println("Exception handled by p() ..");
        }
    }
    static void n() throws IOException {
        m();
    }
    static void m() throws IOException {
        throw new IOException("Error Occurred in m");
    }
}
