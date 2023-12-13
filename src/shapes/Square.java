package shapes;

public class Square extends Rectangle{
    public static void main(String[] args) {
        Square s = new Square(5);
        System.out.println("Area of square is " + s.getArea());
        System.out.println("Perimeter of square is " + s.getPerimeter());
    }
    private double side;

    public Square(double side) {
        super();
        this.side = side;
    }


}
