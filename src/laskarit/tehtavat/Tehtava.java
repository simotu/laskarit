package laskarit.tehtavat;

import laskarit.muotoilu.Esitys;

/**
 * Tehtava-luokka kuvaa yhtä laadittua tehtävää, jolla on kysymys ja
 * siihen tietty tai tietyt vastaukset.
 *
 * @author simo
 */
public interface Tehtava {
    public Esitys annaKysymys();
    
    public boolean tarkistaVastaus(String vastaus);
    
}
