package demo.shape;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ShapeTest {

    @Mock Shape mockedShape;

    @Test
    public void testMoveTo() {
        // arrange
        Mockito.doCallRealMethod()
                .when(mockedShape)
                .moveTo(anyInt(), anyInt());

        // act
        mockedShape.moveTo(5, 5);

        // assert
        assertEquals(5, mockedShape.x);
        assertEquals(5, mockedShape.y);
    }
}