import org.junit.Test;

import static org.testng.Assert.assertEquals;


public class EvenOrOddTest {

    @Test
    public void testEvenOrOdd() {
        EvenOrOdd eoo = new EvenOrOdd();
        assertEquals("Even", eoo.evenOrOdd(2));
        assertEquals("Odd", eoo.evenOrOdd(7));
        assertEquals("Even", eoo.evenOrOdd(0));
        assertEquals("Odd", eoo.evenOrOdd(-1));
    }
}



