package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        System.out.println("Area of box1 is " + box1.getArea());
        System.out.println("Perimeter of box1 is " + box1.getPerimeter());

        System.out.println("Area of box2 is " + box2.getArea());
        System.out.println("Perimeter of box2 is " + box2.getPerimeter());
    }
    static Rectangle box1 = new Rectangle(4, 5);
    static Square box2 = new Square(5) {
    };
}
