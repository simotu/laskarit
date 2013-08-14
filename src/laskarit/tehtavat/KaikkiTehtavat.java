package laskarit.tehtavat;

/**
 * Tehtavakokoelma, joka sisältää kaikki järkevät tehtävät.
 * @author simo
 */
public class KaikkiTehtavat extends Tehtavakokoelma {

    public KaikkiTehtavat() {
        super(new Yhteenlaskarit(10),
              new Kertolaskarit(10),
              new ToisenAsteenYhtalo(10, true));
    }

}
