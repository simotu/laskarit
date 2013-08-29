package laskarit.tehtavat;

import laskarit.esitys.Binaarioperaattori;
import laskarit.esitys.Esitys;
import laskarit.esitys.Kokonaisluku;
import laskarit.esitys.Potenssi;
import laskarit.esitys.Symboli;
import laskarit.esitys.Teksti;
import laskarit.esitys.Yhdiste;

/**
 * Tehtava, joka toteuttaa muotoa n^x=n olevan logaritmilaskutehtävän.
 * @author simo
 */
class Logaritmilaskutehtava implements Tehtava {

    private final int m;

    private final int n;

    /**
     * Toteuttaa potenssilaskutehtävän m^x=n
     * @param m juuri
     * @param n eksponentti
     */
    public Logaritmilaskutehtava(int m, int n) {
        this.m = m;
        this.n = n;
    }

    @Override
    public Esitys annaKysymys() {
        return new Yhdiste(new Teksti("Ratkaise x: "),
                new Binaarioperaattori("=",new Potenssi(new Kokonaisluku(m),
                new Symboli('x')), new Kokonaisluku((int)Math.pow(m, n))));
    }

    @Override
    public boolean tarkistaVastaus(String vastaus) {
        try {
            return (Integer.parseInt(vastaus) == n);
        }
        catch(NumberFormatException e) {
            return false;
        }
    }

}
