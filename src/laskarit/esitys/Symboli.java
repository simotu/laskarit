package laskarit.esitys;

/**
 * Esitys, joka kuvaa yhden merkin symbolia esimerkiksi muuttuja-
 * tai vakiosymboli kaavassa.
 * @author simo
 */
public class Symboli implements Esitys {

    private final char symboli;

    /**
     * Luo symbolin <code>symboli</code> esityksen.
     * @param symboli
     */
    public Symboli(char symboli) {
        this.symboli = symboli;
    }

    @Override
    public String toString(Esitys context) {
        return "" + symboli;
    }

}
