package laskarit.muotoilu;

/**
 *
 * @author simo
 */
public class Binaarioperaattori implements Esitys {

    private final Esitys eka;

    private final Esitys toka;

    public Binaarioperaattori(Esitys eka, Esitys toka) {
        this.eka = eka;
        this.toka = toka;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append(eka.toString())
                .append("∘")
                .append(toka.toString())
                .toString();
    }
    
}
