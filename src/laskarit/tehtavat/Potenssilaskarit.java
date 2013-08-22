package laskarit.tehtavat;

import java.util.Random;

/**
 * Tehtävätehdas, joka tuottaa potenssilaskuharjoituksia.
 * @author simo
 */
public class Potenssilaskarit implements Tehtavatehdas {

    private final int juuriraja;

    private final int eksponenttiraja;
    
    private final Random random = new Random();

    public Potenssilaskarit(int juuriraja, int eksponenttiraja) {
        this.juuriraja = juuriraja;
        this.eksponenttiraja = eksponenttiraja;
    }

    @Override
    public Tehtava annaTehtava() {
        int m = random.nextInt(juuriraja + 1);
        int n;
        if(m == 0)
            n = random.nextInt(eksponenttiraja) + 1;
        else
            n = random.nextInt(eksponenttiraja + 1);
        return new Potenssilaskutehtava(m, n);
    }

}
