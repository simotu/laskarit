package laskarit.tehtavat;

import laskarit.muotoilu.Esitys;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author simo
 */
public class YhteenlaskutehtavaTest {

    public YhteenlaskutehtavaTest() {
    }

    @Test
    public void testTarkistaVastaus() {
        for(int i = -100; i < 100; i++) {
            for(int j = -100; j < 100; j++) {
                assertTrue(new Yhteenlaskutehtava(i, j).tarkistaVastaus("" + (i+j)));
                assertFalse(new Yhteenlaskutehtava(i, j).tarkistaVastaus("" + (i+j+1)));
            }
        }
    }
}