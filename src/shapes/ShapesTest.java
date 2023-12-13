package shapes;

public class ShapesTest {
    public static Measurable myShape;
    public static void main(String[] args) {
//        myShape = new Square(5);
          myShape = new Rectangle(5, 4);
        System.out.println("Area of square is " + myShape.getArea());
        System.out.println("Perimeter of square is " + myShape.getPerimeter());
    }

}
