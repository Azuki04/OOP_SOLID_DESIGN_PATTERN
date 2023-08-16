package demo.shape;

public class Cube extends Shape implements ShapeWithArea, ShapeWithVolume{

    private double side;
    public Cube(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw() {

    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2) * 6;
    }


    @Override
    public double calculateVolume() {
        return Math.pow(side, 3);
    }
}
