package shapes;

public class ShapeTest {
    public static void main(String[] args) {
        Square square = new Square(10);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());

        Rectangle box1 = new Rectangle(4,5);
        System.out.println("This the area of box1: " + box1.getArea());
        System.out.println("This is the perimeter of box1: " + box1.getPerimeter());

        Rectangle box2 = new Square(5);
        System.out.println("This the area of box2: " + box2.getArea());
        System.out.println("This is the perimeter of box2: " + box2.getPerimeter());




    }
}
