package laskarit.muotoilu;

/**
 * 
 * @author simo
 */
public class Teksti implements Esitys {
    private final String teksti;

    public Teksti(String teksti) {
        this.teksti = teksti;
    }

    @Override
    public String toString() {
        return teksti;
    }

}
