import demo.shape.AllAreaCalculator;
import demo.shape.Circle;
import demo.shape.Rectangle;
import demo.shape.Shape;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        System.out.println("Hello World!");

        // AllAreaCalculator
        AllAreaCalculator areaCalculator = new AllAreaCalculator();

        // circle1
        Circle circle = new Circle(0, 0, 3);
        // square1
        Rectangle rectangle = new Rectangle(0, 0, 3, 3);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(rectangle);

        double sum = areaCalculator.sum(shapes);

        System.out.println(sum);

        double result = circle.calculateArea();

        System.out.print(result);

    }



}
