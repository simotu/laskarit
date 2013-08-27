package laskarit.tehtavat;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author simo
 */
public class PolynomiyhtalotehtavaTest {

    public PolynomiyhtalotehtavaTest() {
    }

    @Test
    public void testaaRajatapauksia() {
        try {
            new Polynomiyhtalotehtava();
            fail("Odotettiin virhettä.");
        }
        catch(IndexOutOfBoundsException e) {}
        assertTrue("1 on yhtälön 0=0 juuri,", new Polynomiyhtalotehtava(0).onkoJuuri(1));
        assertTrue("2 on yhtälön 0=0 juuri.", new Polynomiyhtalotehtava(0).onkoJuuri(2));
        assertTrue("5 on yhtälön 0=0 juuri.", new Polynomiyhtalotehtava(0).onkoJuuri(5));
        assertTrue("-10 on yhtälön 0=0 juuri", new Polynomiyhtalotehtava(0).onkoJuuri(-10));
        assertFalse("2 ei ole yhtälön 1=0 juuri.", new Polynomiyhtalotehtava(1).onkoJuuri(2));
        assertFalse("5 ei ole yhtälön 1=0 juuri.", new Polynomiyhtalotehtava(1).onkoJuuri(5));
        assertFalse("0 ei ole yhtälön 1=0 juuri.", new Polynomiyhtalotehtava(1).onkoJuuri(0));
    }

    @Test
    public void testAnnaEsitys() {
        assertEquals("x^2+2x+3=0",
                new Polynomiyhtalotehtava(1, 2, 3).annaEsitys().toString(null));
        assertEquals("0=0",
                new Polynomiyhtalotehtava(0, 0, 0).annaEsitys().toString(null));
        assertEquals("x=0",
                new Polynomiyhtalotehtava(0, 0, 0, 0, 1, 0).annaEsitys().toString(null));
        assertEquals("x^5=0",
                new Polynomiyhtalotehtava(1, 0, 0, 0, 0, 0).annaEsitys().toString(null));
        assertEquals("x^5+2x^2+x=0",
                new Polynomiyhtalotehtava(1, 0, 0, 2, 1, 0).annaEsitys().toString(null));
        assertEquals("x^2-4x-1=0",
                new Polynomiyhtalotehtava(1, -4, -1).annaEsitys().toString(null));
        assertEquals("-x^5=0",
                new Polynomiyhtalotehtava(-1, 0, 0, 0, 0, 0).annaEsitys().toString(null));
    }

    /**
     * Testataan korkeintaan kolmannen asteen yhtälöillä kaikki
     * juuret -10...10.
     */
    @Test
    public void testOnkoJuuri() {
        for(int a = -10; a <= 10; a++) {
            for(int b = -10; b <= 10; b++) {
                for(int c = -10; c <= 10; c++) {
                    if(a == 0 && b == 0 && c == 0)
                        continue;
                    Polynomiyhtalotehtava pyt
                            = new Polynomiyhtalotehtava(1, -(a+b+c), a*b + a*c+ b*c, -a*b*c);
                    for(int j = -10; j <= 10; j++) {
                        if(j == a || j == b || j == c)
                            assertTrue(j + " on x^3+(" + (a+b+c) + ")x^2+("
                                    + (a*b+a*c+b*c) + ")x+" + (a*b*c)
                                    + "=0 juuri.", pyt.onkoJuuri(j));
                        else
                            assertFalse(j + " ei ole x^3+(" + (a+b+c) + ")x^2+("
                                    + (a*b+a*c+b*c) + ")x+" + (a*b*c)
                                    + "=0 juuri.", pyt.onkoJuuri(j));
                    }
                }
            }
        }
    }
}