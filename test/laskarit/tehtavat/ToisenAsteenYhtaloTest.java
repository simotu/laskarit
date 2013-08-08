package laskarit.tehtavat;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author simo
 */
public class ToisenAsteenYhtaloTest {

    public ToisenAsteenYhtaloTest() {
    }

    /**
     * Test of annaTehtava method, of class ToisenAsteenYhtalo.
     */
    @Test
    public void testAnnaTehtava() {
        ToisenAsteenYhtalo tay = new ToisenAsteenYhtalo(10, true);
        for(int n = 0; n < 10000; n++) {
            Tehtava t = tay.annaTehtava();
            boolean loytyi = false;
            for(int i=-10; i <= 10; i++) {
                if(t.tarkistaVastaus(i + "")) {
                    loytyi = true;
                    break;
                }
            }
            if(!loytyi)
                fail("Ei ratkaisua odotetulla alueella.");
        }
    }
}