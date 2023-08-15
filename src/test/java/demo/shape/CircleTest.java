package demo.shape;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CircleTest {
    @Test
    public void whenWidthAndHeight10_thenArea100() {
        // arrange
        Circle circle = new Circle(0, 0, 3);

        // act
        double area = circle.calculateArea();

        // assert
        assertEquals(7.069, area, 0.001);
    }
}
