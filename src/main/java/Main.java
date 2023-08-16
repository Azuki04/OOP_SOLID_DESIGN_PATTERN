import demo.shape.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        // allAreaCalculator
        AllAreaCalculator allAreaCalculator = new AllAreaCalculator();

        FirstShapeCalculator firstShapeCalculator = new FirstShapeCalculator();

        List<IAreaCalculator> calculators = Arrays.asList(allAreaCalculator, firstShapeCalculator);

        // ShapePrinter shapePrinter = new ShapePrinter(calculators);

        ShapePrinter allCalculatorPrinter = new ShapePrinter(allAreaCalculator);

        ShapePrinter firstCalculatorPrinter = new ShapePrinter(firstShapeCalculator);

        //initialise shape
        //Shape test = new Shape(0,0,3,3);
        //shape is abstract, so we can't make a shape

        // circle1
        Circle circle = new Circle(0, 0, 3);
        // circle1
        Circle circle2 = new Circle(0, 0, 4);
        // square1
        Rectangle rectangle = new Rectangle(0, 0, 3, 3);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(circle2);

        //String areaResult = shapePrinter.jsonShapesArea(shapes);
        //String areaResult2 = shapePrinter.ShapesAreaIndex1(shapes);
        //System.out.println("calculate the first index from shape list: " + areaResult2);
        //System.out.println("calculate all shape area together: " + areaResult);


        String areaResult3 = allCalculatorPrinter.ShapesAreaIndex1(shapes);




        double sum = allAreaCalculator.sum(shapes);

        System.out.println("test: "+sum);

        double result = circle.calculateArea();

        System.out.print(result);

    }



}
