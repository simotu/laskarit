package laskarit.tehtavat;

import laskarit.muotoilu.Binaarioperaattori;
import laskarit.muotoilu.Esitys;
import laskarit.muotoilu.Kokonaisluku;
import laskarit.muotoilu.Potenssi;
import laskarit.muotoilu.Symboli;
import laskarit.muotoilu.Teksti;
import laskarit.muotoilu.Yhdiste;

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
