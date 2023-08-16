package demo.shape;

import java.util.List;

public class AllAreaCalculator {
    public double sum(List<Shape> shape){
        double sum = 0;
        for (Shape s : shape) {
            sum += s.calculateArea();
        }
        return sum;
    }
}
