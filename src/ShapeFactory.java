public class ShapeFactory {
    public Shape creatShape(double width,double height) throws Exception {
        if(width >=0 && height>=0) {
            if (width == height)
                return new Square(width);
            if (width == 0 || height == 0)
                return new Circle(width + height);
            return new Rectangle(width, height);
        } else {
            throw new Exception();
        }
    }
}

