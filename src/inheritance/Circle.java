package inheritance;

import static java.lang.Math.PI;

public class Circle extends Shape {

    public double radius;

    public Circle(double r) {
        Name = "Circle";
        this.radius = r;
    }

    @Override
    public void area() {
        display("Area", PI * radius * radius);
    }

    public void perimeter() {
        display("Perimeter", 2 * PI * radius);
    }

}
