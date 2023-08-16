package demo.shape;

import java.util.List;

public class ShapePrinter {


 private final IAreaCalculator areaCalculator;

    public ShapePrinter(IAreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
        }

  /*
 private final List<IAreaCalculator>  areaCalculators;


 public ShapePrinter(List<IAreaCalculator> areaCalculators) {
    this.areaCalculators = areaCalculators;
    }

 public String jsonShapesArea(List<Shape> shapes) {
    StringBuilder sb = new StringBuilder();
    for (IAreaCalculator calc : areaCalculators) {
        sb.append(calc.sum(shapes));
    }
     return sb.toString();
 }
 */


    // if use list put .get() in the method
 public String jsonShapeArea(List<Shape> shapes) {
        return String.format("{\"sum\": %f}", areaCalculator.sum(shapes));
    }

 public String xmlShapesArea(List<Shape> shapes) {
  return String.format("<area>%f</area>", areaCalculator.sum(shapes));
 }

 public String csvArea(Shape shape) {
  return String.format("area from %s is: %f",  shape.getClass().getSimpleName(),shape.calculateArea());
 }

}
