package laskarit.tehtavat;

import java.util.Random;
import laskarit.muotoilu.Binaarioperaattori;
import laskarit.muotoilu.Esitys;
import laskarit.muotoilu.Kokonaisluku;

/**
 * Tehtävätehdas, joka tuottaa yhteenlaskuharjoituksia.
 * @author simo
 */
public class Yhteenlaskarit implements Tehtavatehdas {

    private final int raja;
    
    private final Random random = new Random();

    public Yhteenlaskarit(int raja) {
        this.raja = raja;
    }

    @Override
    public Tehtava annaTehtava() {
        final int m = random.nextInt(raja + 1);
        final int n = random.nextInt(raja + 1);
        return new Tehtava() {

            @Override
            public Esitys annaKysymys() {
                return new Binaarioperaattori("+",
                        new Kokonaisluku(m), new Kokonaisluku(n));
            }

            @Override
            public boolean tarkistaVastaus(String vastaus) {
                try {
                    return (Integer.parseInt(vastaus) == m+n);
                }
                catch(NumberFormatException e) {
                    return false;
                }
            }
        };
    }

}
