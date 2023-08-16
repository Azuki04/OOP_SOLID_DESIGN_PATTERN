package demo.shape;

public class Cube extends Shape implements ShapeWithVolume{

    private double side;

    public Cube(int x, int y, double side) {
        super(x, y);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.printf("Drawing a cube at (%d,%d) with side %f\n", x, y, side);
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2) * 6;
    }


    @Override
    public double calculateVolume() {
        return Math.pow(side, 3);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
