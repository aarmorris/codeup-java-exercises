package shapes;

public class Polymorphism extends Inheritance {
    private int side;
    public double getArea(){
        System.out.println("Override");
        return getSide() * getSide();
    }



    public double getPerimeter(){
        System.out.println("Override");
        return 4 * getSide();
    }

    public Polymorphism(){}

    public Polymorphism(int  side){
        this.setSide(side);
    }

//    public Square(int side) {
//            super.setLength(side);
//            super.setWidth(side);
//
//
//
//    }
//
    public int getSide(){
        return this.side;
    }

    public void setSide(int side){
        this.side = side;
    }
}
