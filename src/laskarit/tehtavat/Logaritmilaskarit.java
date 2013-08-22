package laskarit.tehtavat;

import java.util.Random;

/**
 * Tehtävätehdas, joka tuottaa muotoa n^x=m olevia potenssiyhtälöjä.
 * @author simo
 */
public class Logaritmilaskarit implements Tehtavatehdas {

    private final int juuriraja;

    private final int eksponenttiraja;
    
    private final Random random = new Random();

    public Logaritmilaskarit(int juuriraja, int eksponenttiraja) {
        this.juuriraja = juuriraja;
        this.eksponenttiraja = eksponenttiraja;
    }

    @Override
    public Tehtava annaTehtava() {
        int m = random.nextInt(juuriraja - 1) + 2;
        int n = random.nextInt(eksponenttiraja) + 1;
        return new Logaritmilaskutehtava(m, n);
    }

}
