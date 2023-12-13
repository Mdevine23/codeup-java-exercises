package shapes;

abstract class Quadrilateral extends Shape implements IMeasurable {
    protected double length;
    protected double width;

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Quadrilateral() {

    }

    abstract void setLength(double length);
    abstract void setWidth(double width);
    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }
    public double getArea() {
        return length * width;
    }

}
