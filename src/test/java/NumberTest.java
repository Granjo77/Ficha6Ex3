import org.example.Number;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberTest {
    @Test
    public void assertMethodsTest(){
        Number number = new Number();

        int average = Number.numberOfDigits(1344);

        assertEquals(average,3);
    }
}
