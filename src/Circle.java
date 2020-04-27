public class Circle extends Shape {
    private double radius;
    private static final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    protected double getPerimeter() {
        return 2*radius*PI;
    }

    @Override
    protected double getArea() {
        return radius*radius*PI;
    }

    @Override
    public String toString() {
        return "Circle :" + "\n" + super.toString();
    }
}
