package laskarit.muotoilu;

/**
 * Esitys yhdistää kaksi esitystä sellaisenaan.
 * @author simo
 */
public class Yhdiste implements Esitys {

    private final Esitys[] yhdistettavat;

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
