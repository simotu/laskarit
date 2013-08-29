package laskarit.esitys;

/**
 * Esitys, joka kuvaa kokonaislukua.
 * @author simo
 */
public class Kokonaisluku implements Esitys {

    private final int luku;

    /**
     * Luo esityksen, joka kuvaa kokonaislukua <code>luku</code>.
     * @param luku Luku, jota tämä instanssi kuvaa.
     */
    public Kokonaisluku(int luku) {
        this.luku = luku;
    }

    @Override
    public String toString(Esitys context) {
        return String.format("%d", luku);
    }
    
}
