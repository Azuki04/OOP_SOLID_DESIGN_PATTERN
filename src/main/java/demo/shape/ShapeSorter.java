package demo.shape;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShapeSorter {
    List<ShapeWithArea> shapesToSort = new ArrayList<>();

    public void addShapeToSort(ShapeWithArea shapeToSort) {
        shapesToSort.add(shapeToSort);
    }


    public List<ShapeWithArea> getSortedShapesAsc() {
        System.out.println("getSortedShapesAsc");
        return shapesToSort.stream()
                .sorted((s1, s2) -> (int) (s1.calculateArea() - s2.calculateArea()))
                .collect(Collectors.toList());
    }


    public List<ShapeWithArea> getSortedShapesDesc() {
        System.out.println("getSortedShapesDesc");
        return shapesToSort.stream()
                .sorted((s1, s2) -> (int) (s2.calculateArea() - s1.calculateArea()))
                .collect(Collectors.toList());
    }
}
