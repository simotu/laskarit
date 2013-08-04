package laskarit.muotoilu;

/**
 * Teksti kuvaa yksinkertaista merkkijonoa.
 * 
 * @author simo
 */
public class Teksti implements Esitys {
    private final String teksti;

    /**
     * Luo esityksen annetulla tekstillä.
     * @param teksti Teksti, jota esitys kuvaa.
     */
    public Teksti(String teksti) {
        this.teksti = teksti;
    }

    @Override
    public String toString() {
        return teksti;
    }

}
