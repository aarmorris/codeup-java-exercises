package shapes;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2,5);
        System.out.println("The area of an rectangle is: "  + rectangle.getArea());
        System.out.println("The perimeter of an rectangle is: " + rectangle.getPerimeter());
    }
}
