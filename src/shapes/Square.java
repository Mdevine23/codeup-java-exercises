package shapes;

public class Square extends Quadrilateral implements IMeasurable{


    public Square(double side) {
        super(side, side);
    }

    public static void main(String[] args) {
        Square s = new Square(5) {
        };
        System.out.println("Area of square is " + s.getArea());
        System.out.println("Perimeter of square is " + s.getPerimeter());
    }

    @Override
    void setLength(double length) {

    }

    @Override
    void setWidth(double width) {

    }
}
