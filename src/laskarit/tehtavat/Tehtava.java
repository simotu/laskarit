package laskarit.tehtavat;

import laskarit.muotoilu.Esitys;

/**
 * Tehtava-luokka kuvaa yhtä laadittua tehtävää, jolla on kysymys ja
 * siihen tietty tai tietyt vastaukset.
 *
 * @author simo
 */
public interface Tehtava {
    /**
     * annaKysymys-metodi palauttaa kyseisen tehtävän kysymysosan.
     * @return Esitys-instanssi, joka kuvaa tehtävän kysymystä.
     */
    public Esitys annaKysymys();
    
    /**
     * tarkistaVastaus-metodi tarkistaa, kelpaako annettu vastaus
     * vastaukseksi tehtävään.
     * @param vastaus Vastausehdotus
     * @return Tieto siitä, kelpasiko vastaus.
     */
    public boolean tarkistaVastaus(String vastaus);
    
}
