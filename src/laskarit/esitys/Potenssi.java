package laskarit.esitys;

/**
 * Kuvaa binäärioperaattoria, joka näytetään potenssimerkinnän
 * tapaan.
 * @author simo
 */
public class Potenssi implements Esitys {

    private final Esitys juuri;
    
    private final Esitys eksponentti;

    /**
     * Luo potenssimerkinnän, jonka sisältö on juuri^eksponentti.
     * @param juuri
     * @param eksponentti
     */
    public Potenssi(Esitys juuri, Esitys eksponentti) {
        this.juuri = juuri;
        this.eksponentti = eksponentti;
    }

    @Override
    public String toString(Esitys context) {
        return new StringBuilder()
                .append(juuri.toString(this))
                .append("^")
                .append(eksponentti.toString(this))
                .toString();
    }

}
