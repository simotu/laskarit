package laskarit.muotoilu;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author simo
 */
public class TyhjaTest {

    public TyhjaTest() {
    }

    @Test
    public void testToString() {
        assertEquals("", new Tyhja().toString(null));
    }
}