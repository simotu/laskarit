package laskarit.muotoilu;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author simo
 */
public class PotenssiTest {

    public PotenssiTest() {
    }

    /**
     * Test of toString method, of class Potenssi.
     */
    @Test
    public void testToString() {
        assertEquals(new Potenssi(new Kokonaisluku(5), new Symboli('x')).toString(null), "5^x");
    }
}