package laskarit.tehtavat;

import java.util.Random;
import laskarit.esitys.Esitys;
import laskarit.esitys.Teksti;

/**
 * Tehtävä, jossa arvaillaan lukua.
 * 
 * @author simo
 */
public class LukujenArvaus implements Tehtavatehdas {

    private final Random random = new Random();

    @Override
    public Tehtava annaTehtava() {
        final int numero = random.nextInt(10) + 1;
        return new Tehtava() {
            @Override
            public Esitys annaKysymys() {
                return new Teksti("Ajattelen lukua väliltä 1-10...");
            }

            @Override
            public boolean tarkistaVastaus(String vastaus) {
                try {
                    return (Integer.parseInt(vastaus) == numero);
                }
                catch (NumberFormatException e) {
                    return false;
                }
            }

        };
    }


}
