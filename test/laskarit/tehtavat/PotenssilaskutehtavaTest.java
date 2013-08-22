package laskarit.tehtavat;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author simo
 */
public class PotenssilaskutehtavaTest {

    public PotenssilaskutehtavaTest() {
    }

    @Test
    public void testAnnaKysymys() {
        assertEquals("1^5", new Potenssilaskutehtava(1, 5).annaKysymys().toString(null));
    }

    @Test
    public void testTarkistaVastaus() {
        assertTrue("1^0=1", new Potenssilaskutehtava(1, 0).tarkistaVastaus("" + 1));
        assertTrue("2^0=1", new Potenssilaskutehtava(2, 0).tarkistaVastaus("" + 1));
        assertTrue("0^2=0", new Potenssilaskutehtava(0, 2).tarkistaVastaus("" + 0));
        assertTrue("2^5=32", new Potenssilaskutehtava(2, 5).tarkistaVastaus("" + 32));
    }
}