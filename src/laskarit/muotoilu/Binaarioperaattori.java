package laskarit.muotoilu;

/**
 * Binaarioperaattori on Esitys, joka kuvaa binääristä operaattoria,
 * jossa annettu symboli yhdistää kahta Esitys-instanssia.
 * Esityksiä voi listata enemmänkin, jolloin esityksen katsotaan kuvaavan
 * liitännäistä operaattoria.
 *
 * @author simo
 */
public class Binaarioperaattori implements Esitys {

    private final Esitys eka;

    private final Esitys toka;
    
    private final String operaattorisymboli;

    /**
     *
     * @param eka Toinen parametri
     * @param toka Ensimmäinen parametri
     * @param operaattorisymboli Operaation symboli
     */
    public Binaarioperaattori(String operaattorisymboli, Esitys eka, Esitys toka) {
        this.eka = eka;
        this.toka = toka;
        this.operaattorisymboli = operaattorisymboli;
    }
    
    @Override
    public String toString(Esitys context) {
        return new StringBuilder()
                .append(eka.toString(context))
                .append(operaattorisymboli)
                .append(toka.toString(context))
                .toString();
    }
    
}
