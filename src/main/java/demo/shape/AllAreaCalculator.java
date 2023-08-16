package demo.shape;

import java.util.List;

public class AllAreaCalculator implements IAreaCalculator{
    @Override
    public double sum(List<Shape> shape){
        double sum = 0;
        for (Shape s : shape) {
            sum += s.calculateArea();
        }
        return sum;
    }
}
