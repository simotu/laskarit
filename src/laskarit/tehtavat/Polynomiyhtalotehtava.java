package laskarit.tehtavat;

import laskarit.muotoilu.Binaarioperaattori;
import laskarit.muotoilu.Esitys;
import laskarit.muotoilu.Kokonaisluku;
import laskarit.muotoilu.Potenssi;
import laskarit.muotoilu.Symboli;
import laskarit.muotoilu.Tyhja;

/**
 * Luokka, joka edustaa yksittäistä polynomiyhtälötehtävää,
 * joka on muodossa a_0*x^(n-1) + ... + a_(n-1)*x^0=0.
 * 
 * @author simo
 */
class Polynomiyhtalotehtava {

    private final int[] kertoimet;

    /**
     * Luo Polynomiyhtalotehtava-instanssin. Vakiokertoimet annetaan
     * suurimman asteluvun termistä alkaen.
     * @param a Polynomin vakiokertoimet
     */
    public Polynomiyhtalotehtava(int... a) {
        if(a.length == 0)
            throw new IndexOutOfBoundsException("Polynomiyhtälöllä on oltava ainakin vakiotermi.");
        this.kertoimet = a;
    }

    public Esitys annaEsitys() {
        Esitys x = new Symboli('x');
        Esitys poly = null;
        for(int i = 0; i < kertoimet.length; i++) {
            int vakiokerroin = kertoimet[i];
            if(vakiokerroin != 0) {
                int eksponentti = kertoimet.length - i - 1;
                if(poly == null) {
                    if(eksponentti == 0) {
                        poly = new Kokonaisluku(vakiokerroin);
                    }
                    else {
                        poly = annaTermi(vakiokerroin,
                                annaMuuttujatekija(x, eksponentti));
                    }
                }
                else {
                    if(eksponentti == 0) {
                        poly = lisaaPolynomiin(poly, vakiokerroin,
                                new Kokonaisluku(Math.abs(vakiokerroin)));
                    }
                    else {
                        poly = lisaaTermi(poly, vakiokerroin,
                                annaMuuttujatekija(x, eksponentti));
                    }
                }
            }
        }
        if(poly == null)
            poly = new Kokonaisluku(0);
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
        } else {
            return new Binaarioperaattori("-", poly, abs);
        }
    }

    private Esitys annaTermi(int vakio, Esitys muuttujatermi) {
        if(vakio == 1)
            return muuttujatermi;
        if(vakio == -1)
            return new Binaarioperaattori("-", new Tyhja(), muuttujatermi);
        return new Binaarioperaattori("", new Kokonaisluku(vakio), muuttujatermi);
    }

    private Esitys annaMuuttujatekija(Esitys x, int eksponentti) {
        if(eksponentti == 1)
            return x;
        return new Potenssi(x, new Kokonaisluku(eksponentti));
    }

    public boolean onkoJuuri(int x) {
        int xe = 1;
        int summa = 0;
        for(int i = 0; i < kertoimet.length; i++) {
            summa += xe*kertoimet[kertoimet.length - i - 1];
            xe *= x;
        }
        return summa == 0;
    }

}
