package laskarit.tehtavat;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author simo
 */
public class KertolaskutehtavaTest {

    public KertolaskutehtavaTest() {
    }

    @Test
    public void testAnnaKysymys() {
    }

    @Test
    public void testTarkistaVastaus() {
        for(int i = 0; i < 100; i++) {
            for(int j = 0; j < 100; j++) {
                assertTrue(new Kertolaskutehtava(i, j).tarkistaVastaus("" + (i*j)));
                assertFalse(new Kertolaskutehtava(i, j).tarkistaVastaus("" + (i*j+1)));
            }
        }
    }

}