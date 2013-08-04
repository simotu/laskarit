package laskarit.tehtavat;

import java.util.Random;

/**
 *
 *
 * @author simo
 */
public class Tehtavakokoelma implements Tehtavatehdas {

    private final Tehtavatehdas[] lahteet;

    private final Random random = new Random();
    
    /**
     * Luo Tehtavakokoelman, johon kuuluvat annetut tehtävätehtaat.
     * @param lahteet Tehtavatehdas-instanssit, joiden joukosta tehtävä
     * kulloinkin valitaan. Lähteitä on oltava vähintään yksi.
     * @throws IndexOutOfBoundsException Jos ei annettu yhtään lähdettä.
     */
    public Tehtavakokoelma(Tehtavatehdas... lahteet) {
        if(lahteet.length == 0)
            throw new IndexOutOfBoundsException("Parametrina on annettava ainakin yksi Tehtavatehdas.");
        this.lahteet = lahteet;
    }

    @Override
    public Tehtava annaTehtava() {
        return lahteet[random.nextInt(lahteet.length)].annaTehtava();
    }

}
