package inheritance;

public class Square extends Shape {

    public double side;

    public Square(double side) {
        Name = "Square";
        this.side =  side;
    }

    public void area() {
        display("Area", side * side);
    }

    public void perimeter() {
        display("Perimeter", 4 * side);
    }
}
