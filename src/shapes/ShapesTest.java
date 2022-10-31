package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Polymorphism polymorphism = new Polymorphism(10);
//        System.out.println(polymorphism.getArea());
//        System.out.println(polymorphism.getPerimeter());
//
//        Inheritance box1 = new Inheritance(4,5);
//        System.out.println("This the area of box1: " + box1.getArea());
//        System.out.println("This is the perimeter of box1: " + box1.getPerimeter());
//
//        Inheritance box2 = new Polymorphism(5);
//        System.out.println("This the area of box2: " + box2.getArea());
//        System.out.println("This is the perimeter of box2: " + box2.getPerimeter());
        Measurable myShape = new Rectangle(5,7);
        System.out.println(myShape.getArea());
        System.out.println((myShape.getPerimeter()));




    }
}
