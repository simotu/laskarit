package laskarit.muotoilu;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author simo
 */
public class TekstiTest {

    public TekstiTest() {
    }

    /**
     * Test of toString method, of class Teksti.
     */
    @Test
    public void testToString() {
        assertEquals(new Teksti("abcd").toString(null), "abcd");
    }
}