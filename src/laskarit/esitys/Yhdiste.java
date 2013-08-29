package laskarit.esitys;

/**
 * Esitys, joka yhdistää useita esityksiä peräkkäin.
 * @author simo
 */
public class Yhdiste implements Esitys {

    private final Esitys[] yhdistettavat;

    /**
     * Luo uuden esityksen, joka on yhdiste esityksistä
     * <code>yhdistettavat[0], ..., yhdistettavat[yhdistettavat.length-1]</code>
     * @param yhdistettavat
     */
    public Yhdiste(Esitys... yhdistettavat) {
        this.yhdistettavat = yhdistettavat;
    }

    @Override
    public String toString(Esitys context) {
        StringBuilder sb = new StringBuilder();
        for(Esitys osa: yhdistettavat) {
            sb.append(osa.toString(this));
        }
        return sb.toString();
    }

}
