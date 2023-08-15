package demo.shape;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    public void whenWidthAndHeight10_thenArea100() {
        // arrange
        Rectangle rect = new Rectangle(0, 0, 10, 10);

        // act
        double area = rect.calculateArea();

        // assert
        assertEquals(100, area, 0);
    }
}
