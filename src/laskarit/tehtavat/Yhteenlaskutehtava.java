package laskarit.tehtavat;

import laskarit.muotoilu.Binaarioperaattori;
import laskarit.muotoilu.Esitys;
import laskarit.muotoilu.Kokonaisluku;

/**
 *
 * @author simo
 */
class Yhteenlaskutehtava implements Tehtava {

    private final int m;

    private final int n;

    public Yhteenlaskutehtava(int m, int n) {
        this.m = m;
        this.n = n;
    }

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

}
