package laskarit.esitys;

/**
 * Esitys-rajapinta määrittää strukturoidun esityksen, joka voidaan
 * näyttää eri muodoissa.
 * @author simo
 */
public interface Esitys {

    /**
     * Palauttaa esityksen merkkijonoksi muotoiltuna.
     * @return Esityksen merkkijonoesitys.
     */
    public String toString(Esitys context);

}
