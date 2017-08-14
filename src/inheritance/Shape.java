package inheritance;

public class Shape {

    public String Name;

    public void area() {
        System.out.println("To find area of the shape inherited");
    }

    public void perimeter() {
        System.out.println("To find perimeter of the shape inherited");
    }

    // to display based on
    public void display(String s, double d) {
        System.out.println(this.Name + " " + s + " : " + d);
    }

}
