package CH9Inheritance;

public class ShapeClientV1 {
    public static void main(String[] args) {
        ShapeV1[] shapes = {new Circle(5), new Rectangle(8, 11),
        new Triangle(3, 4, 5)};

        //shapeInfo should print the area and perimeter of all the
        //shapes in the array
        shapeInfo(shapes);
    }

    public static void shapeInfo(ShapeV1[] shapes) {
        for(int i = 0; i < shapes.length; i++) {
            System.out.println("Area: " + shapes[i].area());
            System.out.println("Perimeter: " + shapes[i].perimeter() + "\n");
        }

    //datatype     var   : container
    for(ShapeV1 s : shapes) {
        System.out.println("Area: " + s.area());
        System.out.println("Perimeter: " + s.perimeter() + "\n");
    }
    }
}
