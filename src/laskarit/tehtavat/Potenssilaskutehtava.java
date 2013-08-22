package laskarit.tehtavat;

import laskarit.muotoilu.Esitys;
import laskarit.muotoilu.Kokonaisluku;
import laskarit.muotoilu.Potenssi;

/**
 * Tehtava, joka toteuttaa potenssilaskutehtävän.
 * @author simo
 */
class Potenssilaskutehtava implements Tehtava {

    private final int m;

    private final int n;

    /**
     * Toteuttaa potenssilaskutehtävän m^n
     * @param m juuri
     * @param n eksponentti
     */
    public Potenssilaskutehtava(int m, int n) {
        this.m = m;
        this.n = n;
    }

    @Override
    public Esitys annaKysymys() {
        return new Potenssi(new Kokonaisluku(m), new Kokonaisluku(n));
    }

    @Override
    public boolean tarkistaVastaus(String vastaus) {
        try {
            return (Integer.parseInt(vastaus) == (int)Math.pow(m, n));
        }
        catch(NumberFormatException e) {
            return false;
        }
    }

}
