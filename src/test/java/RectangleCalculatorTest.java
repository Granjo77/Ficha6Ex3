import org.example.RectangleCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RectangleCalculatorTest {

    @Test
    public void AssertMethodsTest(){
        RectangleCalculator rectangleCalculator = new RectangleCalculator();

        int perimeter1 = rectangleCalculator.perimeter(3,5);
        int perimeter2 = rectangleCalculator.perimeter(5,8);
        int perimeter3 = rectangleCalculator.perimeter(2,4);

        int area1 = rectangleCalculator.area(3,5);
        int area2 = rectangleCalculator.area(5,8);
        int area3 = rectangleCalculator.area(2,4);

        boolean isTriangle = rectangleCalculator.isTriangle(2,3,4);

        assertEquals(perimeter1, 16);
        assertEquals(perimeter2, 26);
        assertEquals(perimeter3, 12);

        assertEquals(area1, 15);
        assertEquals(area2, 40);
        assertEquals(area3, 8);

        assertTrue(isTriangle);
    }
}
