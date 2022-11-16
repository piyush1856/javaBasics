package sprint4Day1Live;

public class _5IsThereConflictInMultipleImplementation {
    public static void main(String[] args) {
        Square square = new Square();
        square.draw();
        square.getS();

        System.out.println(square instanceof MathShape);
        System.out.println(square instanceof Rectangle);
    }
}

interface MathShape{
    String s= "Math Shape";
    void draw();
}
interface Rectangle{
    String s= "Rectangle";
    void draw();
}


//The visibility of subType method should have >= the visibility of parent type method
class Square implements MathShape,Rectangle {
    public void draw() {
        System.out.println("Square Shape ..");
    }

    void getS(){
        System.out.println(MathShape.s);
        System.out.println(Rectangle.s);
        //mention explicitly from where you require 's'
    }
}





