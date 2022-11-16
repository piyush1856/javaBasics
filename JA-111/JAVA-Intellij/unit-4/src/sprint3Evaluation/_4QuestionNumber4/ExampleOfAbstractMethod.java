package sprint3Evaluation._4QuestionNumber4;

public class ExampleOfAbstractMethod {
    public static void main(String[] args) {
        MathShape square = new Square();
        MathShape rectangle = new Rectangle();

        double areaSquare = square.calculateArea();
        double areaRectangle = rectangle.calculateArea();

        System.out.println(areaSquare);
        System.out.println(areaRectangle);
    }
}
abstract class MathShape{
    double pi = 22/7;

    //since we don't know thw shape, we can't define a proper method to calculate area
    // so defining an abstract method;

    abstract double calculateArea();
}

class Square extends MathShape{
    double r=7;

    @Override
    double calculateArea(){
        return r*r;
    }
}

class Rectangle extends MathShape{
    double l=7;
    double b=2;

    @Override
    double calculateArea(){
        return l*b;
    }
}
