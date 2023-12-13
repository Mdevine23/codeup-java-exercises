package shapes;

public interface IMeasurable {
    public static void main(String[] args) {

    }

    default double getPerimeter() {
        return 0;
    }

    default double getArea() {
        return 0;
    }

}
