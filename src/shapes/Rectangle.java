package shapes;

public class Rectangle {
    public Rectangle() {

    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 7);
        System.out.println("Area of rectangle is " + r.getArea());
    }
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width  = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return 2 * (width + height);
    }

}
