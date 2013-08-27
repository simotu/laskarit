package laskarit.muotoilu;

/**
 * Tyhjä esitys toimii esimerkiksi täytteenä kompleksisissa
 * esityksissä.
 *
 * @author simo
 */
public class Tyhja implements Esitys {

    public Tyhja() {
    }

    @Override
    public String toString(Esitys context) {
        return "";
    }

}
