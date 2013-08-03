package laskarit.muotoilu;

/**
 *
 * @author simo
 */
public class Kokonaisluku implements Esitys {

    private final int luku;

    /**
     * @param luku Luku, jota tämä instanssi kuvaa.
     */
    public Kokonaisluku(int luku) {
        this.luku = luku;
    }

    @Override
    public String toString() {
        return String.format("%d", luku);
    }
    
}
