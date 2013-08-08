package laskarit.muotoilu;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author simo
 */
public class YhdisteTest {

    public YhdisteTest() {
    }

    /**
     * Test of toString method, of class Yhdiste.
     */
    @Test
    public void testToString() {
        assertEquals(new Yhdiste(new Teksti("abc"), new Kokonaisluku(5)).toString(null), "abc5");
    }
}