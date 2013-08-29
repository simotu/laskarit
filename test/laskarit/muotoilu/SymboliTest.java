package laskarit.muotoilu;

import laskarit.esitys.Symboli;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author simo
 */
public class SymboliTest {

    public SymboliTest() {
    }

    /**
     * Test of toString method, of class Symboli.
     */
    @Test
    public void testToString() {
        assertEquals(new Symboli('x').toString(null), "x");
    }
}