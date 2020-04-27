public class Rectangle extends Shape {
    private double height;
    private double width;

        public Rectangle( double width,double height) {
        this.height = height;
        this.width = width;
    }

    @Override
    protected double getPerimeter() {
        return (height+width)*2;
    }

    @Override
    protected double getArea() {
        return height*width;
    }

    @Override
    public String toString() {
        return "Rectangle : " + "\n"+ super.toString();
    }
}
