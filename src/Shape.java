public abstract class Shape {
    protected abstract double getPerimeter();
    protected abstract double getArea();
    public String toString(){
        return "Perimeter : " + getPerimeter() +"\n"+"Area : "+getArea() +"\n";
    }
}
