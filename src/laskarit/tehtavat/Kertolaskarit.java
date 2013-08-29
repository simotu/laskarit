package laskarit.tehtavat;

import java.util.Random;
import laskarit.esitys.Binaarioperaattori;
import laskarit.esitys.Esitys;
import laskarit.esitys.Kokonaisluku;

/**
 * Tehtävätehdas, joka tuottaa kertolaskuharjoituksia.
 * @author simo
 */
public class Kertolaskarit implements Tehtavatehdas {

    private final int raja;

    private final Random random = new Random();

    public Kertolaskarit(int raja) {
        this.raja = raja;
    }

    @Override
    public Tehtava annaTehtava() {
        final int m = random.nextInt(raja + 1);
        final int n = random.nextInt(raja + 1);
        return new Kertolaskutehtava(m, n);
    }

}
