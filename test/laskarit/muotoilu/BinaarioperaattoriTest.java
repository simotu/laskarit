package laskarit.muotoilu;

import laskarit.esitys.Teksti;
import laskarit.esitys.Binaarioperaattori;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author simo
 */
public class BinaarioperaattoriTest {

    public BinaarioperaattoriTest() {
    }

    /**
     * Test of toString method, of class Binaarioperaattori.
     */
    @Test
    public void testToString() {
        Teksti t1 = new Teksti("öööööööö");
        Teksti t2 = new Teksti("ääääääää");
        String op = "=";
        Binaarioperaattori bin = new Binaarioperaattori(op, t1, t2);
        assertEquals(bin.toString(null), "öööööööö=ääääääää");
    }
}