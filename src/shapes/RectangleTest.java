package shapes;

public class RectangleTest {
    public static void main(String[] args) {
        Inheritance inheritance = new Inheritance(2,5);
        System.out.println("The area of an rectangle is: "  + inheritance.getArea());
        System.out.println("The perimeter of an rectangle is: " + inheritance.getPerimeter());
    }
}
