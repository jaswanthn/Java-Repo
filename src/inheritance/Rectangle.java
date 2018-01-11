package inheritance;

public class Rectangle extends Shape {

    public double length;
    public double breadth;

    public Rectangle(double length, double breadth) {
        super.Name = "Rectangle";
        this.length = length;
        this.breadth = breadth;
    }

    public void area() {
        display("Area" , this.length * this.breadth);
    }

    public void perimeter() {
        display("Perimeter", 2 * (this.length + this.breadth));
    }

    public void display(String s, double d){
        super.display(s, d);
    }

}
