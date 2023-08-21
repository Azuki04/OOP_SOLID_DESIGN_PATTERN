package demo.shape;

public class Circle extends Shape {

    private double diameter;
    private double radius;

    public Circle(int x, int y, double diameter) {
        super(x, y);

        this.diameter = diameter;
        this.radius = diameter / 2.0;
    }

    @Override
    public void draw() {
        System.out.printf("Drawing a circle at (%d,%d) with diameter %f\n", x, y, diameter);

    }

    @Override
    public double calculateArea() {
        double area = Math.PI * Math.pow((diameter / 2.0), 2);
        System.out.printf("Area of circle with diameter %f  and radius %f is %f\n", diameter,radius, area);
        return area;
    }

    public double getSector(int angle) {
        return (angle / 360.0) * calculateArea();
    }


    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
