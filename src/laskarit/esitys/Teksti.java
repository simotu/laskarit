package laskarit.esitys;

/**
 * Teksti kuvaa yksinkertaista merkkijonoa.
 * 
 * @author simo
 */
public class Teksti implements Esitys {
    private final String teksti;

    /**
     * Luo tekstin <code>teksti</code> esityksen.
     * @param teksti Teksti, jota esitys kuvaa.
     */
    public Teksti(String teksti) {
        this.teksti = teksti;
    }

    @Override
    public String toString(Esitys context) {
        return teksti;
    }

}
