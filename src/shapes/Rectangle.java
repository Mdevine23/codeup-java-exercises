package shapes;

public class Rectangle extends Quadrilateral implements IMeasurable{
    public Rectangle() {
        super();
    }


    @Override
    void setLength(double length) {

    }

    @Override
    void setWidth(double width) {

    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(4, 5);
        System.out.println("Area of rectangle is " + r.getArea());
    }
    double width;
    private double height;

    public Rectangle(double width, double height) {
        super(width, height);
        this.width  = width;
        this.height = height; }

    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return 2 * (width + height);
    }

}
