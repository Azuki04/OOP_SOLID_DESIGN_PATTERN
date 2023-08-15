package demo.shape;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ShapeSorterTest {

    @Mock
    ShapeWithArea shape1;

    @Mock
    ShapeWithArea shape2;

    @Mock
    ShapeWithArea shape3;

    @Mock
    ShapeWithArea shape4;

    @Mock
    ShapeWithArea shape5;

    @Spy
    ShapeSorter sorter;

    @BeforeEach
    public void setup() {
        // arrange
        sorter = spy(new ShapeSorter());

        sorter.addShapeToSort(shape1);
        sorter.addShapeToSort(shape2);
        sorter.addShapeToSort(shape3);
        sorter.addShapeToSort(shape4);
        sorter.addShapeToSort(shape5);

        lenient().when(shape1.calculateArea()).thenReturn(100d);
        lenient().when(shape2.calculateArea()).thenReturn(400d);
        lenient().when(shape3.calculateArea()).thenReturn(225d);
        lenient().when(shape4.calculateArea()).thenReturn(25d);
        lenient().when(shape5.calculateArea()).thenReturn(144d);
    }

    @Test
    public void whenAddShapeToSort_thenShapeIsAddedOnce() {
        // arrange
        Shape shape = mock(Shape.class);

        // act
        sorter.addShapeToSort(shape);

        // assert
        verify(sorter, times(1)).addShapeToSort(shape);
        assertEquals(6, sorter.shapesToSort.size());
        assertEquals(shape, sorter.shapesToSort.get(5));
    }

    @Test
    public void whenGetSortedShapesAsc_thenReturnCorrectAscSort() {
        // act
        List<ShapeWithArea> result = sorter.getSortedShapesAsc();

        // assert
        assertEquals(shape4.calculateArea(), result.get(0).calculateArea(), 0);
        assertEquals(shape1.calculateArea(), result.get(1).calculateArea(), 0);
        assertEquals(shape5.calculateArea(), result.get(2).calculateArea(), 0);
        assertEquals(shape3.calculateArea(), result.get(3).calculateArea(), 0);
        assertEquals(shape2.calculateArea(), result.get(4).calculateArea(), 0);
    }

    @Test
    public void whenGetSortedShapesDesc_thenReturnCorrectDescSort() {
        // act
        List<ShapeWithArea> result = sorter.getSortedShapesDesc();

        // assert
        assertEquals(shape2.calculateArea(), result.get(0).calculateArea(), 0);
        assertEquals(shape3.calculateArea(), result.get(1).calculateArea(), 0);
        assertEquals(shape5.calculateArea(), result.get(2).calculateArea(), 0);
        assertEquals(shape1.calculateArea(), result.get(3).calculateArea(), 0);
        assertEquals(shape4.calculateArea(), result.get(4).calculateArea(), 0);
    }
}
