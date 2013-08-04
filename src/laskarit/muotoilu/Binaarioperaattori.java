package laskarit.muotoilu;

/**
 *
 * @author simo
 */
public class Binaarioperaattori implements Esitys {

    private final Esitys eka;

    private final Esitys toka;

    private final String operaattorisymboli;

    public Binaarioperaattori(Esitys eka, Esitys toka, String operaattorisymboli) {
        this.eka = eka;
        this.toka = toka;
        this.operaattorisymboli = operaattorisymboli;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append(eka.toString())
                .append(operaattorisymboli)
                .append(toka.toString())
                .toString();
    }
    
}
