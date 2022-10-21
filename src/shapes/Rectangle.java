package shapes;

public class Rectangle {

    private int length;

    private int width;

    // Getters

    public int getLength() {
        return length;
    }

    // Setters

    public void setLength(int length) {
        this.length = length;
    }

    // Getters

    public int getWidth() {
        return width;
    }

    // Setters

    public void setWidth(int width) {
        this.width = width;
    }

    public double getArea(){
        return this.getLength() * this.getWidth();
    }

    public double getPerimeter(){
        return 2 * this.getLength() + 2 * getWidth();
    }




    // Constructors

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(){}
}



