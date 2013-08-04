package laskarit.ui;

import java.util.Scanner;
import laskarit.tehtavat.LukujenArvaus;
import laskarit.tehtavat.Tehtava;
import laskarit.tehtavat.Tehtavakokoelma;
import laskarit.tehtavat.Tehtavatehdas;
import laskarit.tehtavat.ToisenAsteenYhtalo;

/**
 * Luokka toteuttaa konsolikäyttöliittymän.
 * @author simo
 */
public class Konsoli {

    /**
     * @param args Komentoriviparametrit.
     */
    public static void main(String... args) {
        System.out.println("Tervetuloa laskareihin. Tyhjä vastaus päättää pelin.");
        Scanner scanner = new Scanner(System.in);
        Tehtavatehdas tehtavat = new ToisenAsteenYhtalo(10, true);
        ulko:
        while(true) {
            Tehtava tehtava = tehtavat.annaTehtava();
            System.out.println(tehtava.annaKysymys().toString(null));
            String vastaus = scanner.nextLine();
            if("".equals(vastaus.trim()))
                break;
            while(!tehtava.tarkistaVastaus(vastaus)) {
                System.out.println("Väärin! Yritä uudelleen.");
                vastaus = scanner.nextLine();
                if("".equals(vastaus.trim()))
                    break ulko;
            }
            System.out.println("Oikein!");
        }
    }
    
}
