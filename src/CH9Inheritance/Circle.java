//circle implements the Shape class therefore it's circles
//responsibility to implement area and perimeter methods from
//Shape


package CH9Inheritance;

import java.awt.*;

public class Circle implements ShapeV1 {
    private double radius;

    //constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    //area
    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    //perimeter

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
