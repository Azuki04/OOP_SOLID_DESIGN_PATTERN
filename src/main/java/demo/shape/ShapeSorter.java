package demo.shape;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShapeSorter {
    List<ShapeWithArea> shapesToSort = new ArrayList<>();

    public void addShapeToSort(ShapeWithArea shapeToSort) {
        shapesToSort.add(shapeToSort);
    }

    /**
     * Streams the stored shapes into a new list where all elements are sorted by
     * their calculated area in an ascending order.
     * 
     * @return a new list of shapes sorted by area in ascending order
     */
    public List<ShapeWithArea> getSortedShapesAsc() {
        return shapesToSort.stream()
                .sorted((s1, s2) -> (int) (s1.calculateArea() - s2.calculateArea()))
                .collect(Collectors.toList());
    }

    /**
     * Streams the stored shapes into a new list where all elements are sorted by
     * their calculated area in an descending order.
     * 
     * @return a new list of shapes sorted by area in descending order
     */
    public List<ShapeWithArea> getSortedShapesDesc() {
        return shapesToSort.stream()
                .sorted((s1, s2) -> (int) (s2.calculateArea() - s1.calculateArea()))
                .collect(Collectors.toList());
    }
}
