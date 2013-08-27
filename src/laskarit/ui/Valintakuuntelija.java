package laskarit.ui;

/**
 * Valintapaneli antaa tämän rajapinnan kautta tietoa tehdystä
 * valinnasta.
 * @author simo
 */
public interface Valintakuuntelija<T extends Valinta> {

    public void valintaTehty(T valinta);
    
}
