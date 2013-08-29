package laskarit.esitys;

/**
 * Tyhjä esitys toimii esimerkiksi täytteenä kompleksisissa
 * esityksissä.
 *
 * @author simo
 */
public class Tyhja implements Esitys {

    /**
     * Luo tyhjän esityksen.
     */
    public Tyhja() {
    }

    @Override
    public String toString(Esitys context) {
        return "";
    }

}
