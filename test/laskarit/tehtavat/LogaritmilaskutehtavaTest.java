/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laskarit.tehtavat;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author simo
 */
public class LogaritmilaskutehtavaTest {

    public LogaritmilaskutehtavaTest() {
    }

    @Test
    public void testTarkistaVastaus() {
        assertTrue("2^3=8", new Logaritmilaskutehtava(2, 3).tarkistaVastaus("" + 3));
        assertTrue("5^2=25", new Logaritmilaskutehtava(5, 2).tarkistaVastaus("" + 2));
    }
}