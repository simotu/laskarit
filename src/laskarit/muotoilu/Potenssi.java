package laskarit.muotoilu;

/**
 * Kuvaa binäärioperaattoria, joka näytetään potenssimerkinnän
 * tapaan.
 * @author simo
 */
public class Potenssi implements Esitys {

    private final Esitys eka;
    
    private final Esitys toka;

    public Potenssi(Esitys eka, Esitys toka) {
        this.eka = eka;
        this.toka = toka;
    }

    @Override
    public String toString(Esitys context) {
        return new StringBuilder()
                .append(eka.toString(this))
                .append("^")
                .append(toka.toString(this))
                .toString();
    }

}
