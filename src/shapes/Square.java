package shapes;

public class Square extends Rectangle {

    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public double getArea(){
        System.out.println("OVerride");
        return this.getLength() * this.getWidth();
    }

    public double getPerimeter(){
        System.out.println("Override");
        return 2 * this.getLength() + 2 * getWidth();
    }

    public Square(){}

    public Square(int side) {
            super.setLength(side);
            super.setWidth(side);


    }
}
