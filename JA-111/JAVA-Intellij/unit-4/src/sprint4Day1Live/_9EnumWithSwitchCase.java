package sprint4Day1Live;

public class _9EnumWithSwitchCase {
    public static void main(String[] args) {
        Color color = Color.BLUE;

        switch (color){
            case RED -> System.out.println("red");
            case BLUE -> System.out.println("blue");
            case QWEEN_BLUE -> System.out.println("Queen Blue");
        }
    }
}
