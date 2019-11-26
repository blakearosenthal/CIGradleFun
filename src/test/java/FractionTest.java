import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FractionTest {
    Fraction fraction;

    @Before
    public void setup() {
        fraction = new Fraction(1, 2);
    }

    @After
    public void tearDown() {
        fraction = null;
    }

    @Test
    public void testConstructor() {
        assertEquals(fraction.toString(), "1/2");
    }

    @Test
    public void testToString() {
        assertEquals(fraction.toString(), "1/2");
    }

    @Test
    public void testGetRealValue() {
        assertEquals(fraction.getRealValue(), 0.5);
    }

    @Test
    public void testReduce() {

    }

    @Test
    public void testAdd() {

    }

    @Test
    public void testEquals() {

    }

    @Test
    public void testCompareTo() {

    }
}
