public class Demo {
    public static void main(String[] args) throws Exception {
        ShapeFactory shapes = new ShapeFactory();
        Shape shape1 = shapes.creatShape(30,30);
        Shape shape2 = shapes.creatShape(10,30);
        Shape shape3 = shapes.creatShape(0,20);
        Shape shape4 = shapes.creatShape(30,0);

        System.out.println(shape1.toString());
        System.out.println(shape2.toString());
        System.out.println(shape3.toString());
        System.out.println(shape4.toString());

    }
}
