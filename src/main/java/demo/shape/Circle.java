package demo.shape;

public class Circle extends Shape {

    private int diameter;

    public Circle(int x, int y, int diameter) {
        super(x, y);

        this.diameter = diameter;
    }

    @Override
    public void draw() {
        System.out.printf("Drawing a circle at (%d,%d) with diameter %d\n", x, y, diameter);
    }

    @Override
    public double calculateArea() {
        double area = Math.PI * Math.pow((diameter / 2.0), 2);
        System.out.printf("Area of circle with diameter %d is %f\n", diameter, area);
        return area;
    }
}
