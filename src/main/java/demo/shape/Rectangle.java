package demo.shape;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        double area = width * height;
        System.out.printf("Area of rectangle with width %d and height %d is %f\n", width, height, area);
        return area;
    }

    @Override
    public void draw() {
        System.out.printf("Drawing a rectangle at (%d,%d) with width %d and height %d\n", x, y, width, height);
    }
}
