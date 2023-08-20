import animal.Animal;
import animal.Cat;
import animal.Dog;
import animal.Printer;
import demo.shape.*;
import design_pattern.composite.MainComposite;
import design_pattern.strategy.MainStrategy;

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

        Cube cube1 = new Cube(0,0,3);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(circle2);
        shapes.add(cube1);

        //String areaResult = shapePrinter.jsonShapesArea(shapes);
        //String areaResult2 = shapePrinter.ShapesAreaIndex1(shapes);
        //System.out.println("calculate the first index from shape list: " + areaResult2);
        //System.out.println("calculate all shape area together: " + areaResult);


        String areaResult3 = allCalculatorPrinter.jsonShapeArea(shapes);
        String areaResult4 = firstCalculatorPrinter.jsonShapeArea(shapes);

        System.out.println("calculate all shape area together: " + areaResult3);

        System.out.println("calculate the first index from shape list: " + areaResult4);

        double areaCube = cube1.calculateArea();
        double volumeCube = cube1.calculateVolume();

        double sum = allAreaCalculator.sum(shapes);

        System.out.println("sum of all shape of area: "+sum);

        System.out.printf("Area of cube with side %f is: %f \n",cube1.getSide(),areaCube);
        System.out.printf("Volume of cube with side %f is: %f \n",cube1.getSide(),volumeCube);

        double result = circle.calculateArea();

        System.out.print(result);


        // Animal
        Cat cat = new Cat();

        Dog dog = new Dog();
        
        Printer printer1 = new Printer(cat);
        Printer printer2 = new Printer(dog);

        printer1.print();
        printer2.print();


        ShapeSorter shapeSorter = new ShapeSorter();

        shapeSorter.addShapeToSort(circle);
        shapeSorter.addShapeToSort(rectangle);
        shapeSorter.addShapeToSort(circle2);
        shapeSorter.addShapeToSort(cube1);

        shapeSorter.getSortedShapesAsc();



        MainStrategy.startStrategy();





    }



}
