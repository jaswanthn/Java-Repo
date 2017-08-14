package inheritance;

public class ShapeDemo {

    public static void main(String[] args) {
        // calculate area and perimeter of Rectangle, display using inheritance
        Rectangle rc = new Rectangle(6, 5);
        rc.area();
        rc.perimeter();

        // Square
        Square sq = new Square(12);
        sq.area();
        sq.perimeter();

        // Circle
        Circle c = new Circle(4);
        c.area();
        c.perimeter();

    }
}
