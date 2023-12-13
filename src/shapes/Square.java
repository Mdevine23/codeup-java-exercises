package shapes;

public class Square extends Quadrilateral implements Measurable{
    public Square(double side) {
        super(side, side);
    }

    public void setLength(double side) {
        this.length = side;
    }
    public void setWidth(double side) {
        this.width = side;
    }

    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    public double getArea() {
        return length * width;
    }

}
