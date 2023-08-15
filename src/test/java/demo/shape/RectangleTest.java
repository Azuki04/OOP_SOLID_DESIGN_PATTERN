package demo.shape;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RectangleTest {

    Rectangle rect1;
    Rectangle rect2;
    @BeforeEach
    public void setup() {
        // arrange
        rect1 = new Rectangle(0, 0, 10, 10);
        rect2  = new Rectangle(0, 0, 5, 5);
    }
    @Test
    public void whenWidthAndHeight10_thenArea100() {
        // act
        double area = rect1.calculateArea();
        // assert
        assertEquals(100, area, 0);
    }

    @Test
    public void whenWidthAndHeight5_thenArea25() {
        // act
        double area = rect2.calculateArea();
        // assert
        assertEquals(25, area, 0);
    }


}
