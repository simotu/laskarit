package laskarit.muotoilu;

import laskarit.esitys.Kokonaisluku;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author simo
 */
public class KokonaislukuTest {

    public KokonaislukuTest() {
    }

    /**
     * Test of toString method, of class Kokonaisluku.
     */
    @Test
    public void testToString() {
        assertEquals(new Kokonaisluku(5).toString(null), "5");
    }
}