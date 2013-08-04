package laskarit.tehtavat;

import java.util.Arrays;
import java.util.Random;
import laskarit.muotoilu.Binaarioperaattori;
import laskarit.muotoilu.Esitys;
import laskarit.muotoilu.Kokonaisluku;
import laskarit.muotoilu.Potenssi;
import laskarit.muotoilu.Symboli;
import laskarit.muotoilu.Teksti;
import laskarit.muotoilu.Yhdiste;

/**
 * Tehtävä, jossa ratkotaan toisen asteen yhtälön juuria.
 *
 * @author simo
 */
public class ToisenAsteenYhtalo implements Tehtavatehdas {

    private final int rajoitus;

    private final boolean salliNegatiiviset;

    private final Random random = new Random();

    /**
     * Luo uuden ToisenAsteenYhtalo-instanssin. Jos
     * <code>salliNegatiiviset</code> on tosi, juuret ovat välillä
     * -rajoitus...rajoitus ja muutoin 0...rajoitus.
     * @param rajoitus Juurten itseisarvo voi olla korkeintaan
     * <code>rajoitus</code>.
     * @param salliNegatiiviset Määrittää, voivatko juuret olla negatiivisia.
     */
    public ToisenAsteenYhtalo(int rajoitus, boolean salliNegatiiviset) {
        this.rajoitus = rajoitus;
        this.salliNegatiiviset = salliNegatiiviset;
    }

    @Override
    public Tehtava annaTehtava() {
        final Yhtalo yhtalo = arvoYhtalo();
        return new Tehtava() {

            @Override
            public Esitys annaKysymys() {
                return new Yhdiste(
                        new Teksti("Etsi toinen juuri yhtälölle "),
                        yhtalo.annaEsitys());
            }

            @Override
            public boolean tarkistaVastaus(String vastaus) {
                try {
                    return yhtalo.onkoJuuri(Integer.parseInt(vastaus));
                }
                catch (NumberFormatException e) {
                    return false;
                }
            }
        };
    }

    private Yhtalo arvoYhtalo() {
        int x1 = arvoJuuri();
        int x2 = arvoJuuri();

        // (x-x1)(x-x2)=x-(x1+x2)x+x1x2
        // ax^2+bx+c=0
        int a = 1;
        int b = -(x1+x2);
        int c = x1*x2;

        // epäselvennys laventamalla joskus
        int n;
        if(random.nextInt(4) == 0)
            n = random.nextInt((rajoitus / 4) + 1) + 1;
        else
            n = 1;

        return new Yhtalo(a*n, b*n, c*n);

    }

    private int arvoJuuri() {
        if(salliNegatiiviset)
            return random.nextInt(rajoitus*2 + 1) - rajoitus;
        else
            return random.nextInt(rajoitus + 1);
    }

    private static class Yhtalo {

        final int a, b, c;

        public Yhtalo(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        private Esitys annaEsitys() {
            Esitys x = new Symboli('x');
            Esitys poly;
            poly = annaTermi(a, new Potenssi(x, new Kokonaisluku(2)));
            if(b != 0) {
                poly = lisaaTermi(poly, b, x);
            }
            if(c != 0) {
                poly = lisaaPolynomiin(poly, c, new Kokonaisluku(Math.abs(c)));
            }
            return new Binaarioperaattori("=", poly, new Kokonaisluku(0));
        }

        private Esitys lisaaTermi(Esitys poly, int vakio, Esitys muuttujatermi) {
            if(vakio == 0)
                return poly;
            Esitys abs = annaTermi(Math.abs(vakio), muuttujatermi);
            return lisaaPolynomiin(poly, vakio, abs);
        }

        private Esitys lisaaPolynomiin(Esitys poly, int vakio, Esitys abs) {
            if(vakio > 0) {
                return new Binaarioperaattori("+", poly, abs);
            }
            else {
                return new Binaarioperaattori("-", poly, abs);
            }
        }

        private Esitys annaTermi(int vakio, Esitys muuttujatermi) {
            if(vakio == 1)
                return muuttujatermi;
            return new Binaarioperaattori("", new Kokonaisluku(vakio),
                        muuttujatermi);
        }

        private boolean onkoJuuri(int x) {
            return ((a*x*x + b*x + c) == 0);
        }


    }


}
