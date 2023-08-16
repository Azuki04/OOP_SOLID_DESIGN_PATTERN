package demo.shape;

import java.util.List;

public class FirstShapeCalculator implements IAreaCalculator{
    @Override
    public double sum(List<Shape> shapes){
        double sum = shapes.get(0).calculateArea();;
        return sum;
    }

}
