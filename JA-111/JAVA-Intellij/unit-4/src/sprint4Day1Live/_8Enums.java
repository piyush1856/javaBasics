package sprint4Day1Live;

public class _8Enums {
    public static void main(String[] args) {


        Direction d1 = Direction.EAST;

        Direction d2 = Direction.WEST;

        System.out.println(d1==d2);
        System.out.println(d1 == Direction.WEST);
    }
}

enum Direction{
    EAST, WEST, NORTH, SOUTH;
}
enum Color{
    RED,
    GREEN,
    BLUE,
    QWEEN_BLUE;
}


//final class Direction extends Enum{
//    public static final Direction EAST = new Direction();
//    public static final Direction WEST = new Direction();
//    public static final Direction NORTH = new Direction();
//    public static final Direction SOUTH = new Direction();
//}
