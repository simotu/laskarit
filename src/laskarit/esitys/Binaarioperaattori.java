package laskarit.esitys;

/**
 * Binaarioperaattori on Esitys, joka kuvaa binääristä operaattoria,
 * jossa annettu symboli yhdistää kahta Esitys-instanssia.
 *
 * @author simo
 */
public class Binaarioperaattori implements Esitys {

    private final Esitys vasen;

    private final Esitys oikea;
    
    private final String operaattorisymboli;

    /**
     * Luo binäärioperaattorin, jonka muoto on
     * <code>[vasen][operaattorisymboli][oikea]</code>.
     * @param vasen Toinen parametri
     * @param oikea Ensimmäinen parametri
     * @param operaattorisymboli Operaation symboli
     */
    public Binaarioperaattori(String operaattorisymboli, Esitys vasen, Esitys oikea) {
        this.vasen = vasen;
        this.oikea = oikea;
        this.operaattorisymboli = operaattorisymboli;
    }
    
    @Override
    public String toString(Esitys context) {
        return new StringBuilder()
                .append(vasen.toString(context))
                .append(operaattorisymboli)
                .append(oikea.toString(context))
                .toString();
    }
    
}
