package session3;

import java.util.ArrayList;

/**
 *  Die KLasse Zoo repräsentiert unseren kleinen virtuellen Tierpark.
 *  Sie ist der Einsprungspunkt für unser Programm, weil sie die main()-Methode enthält.
 */
public class Zoo {
    public static void main(String[] args) {
        /*
            Wir erzeugen uns ein paar Tier-Objekte.

            Zunächst wird der Ausdruck auf der rechten Seite des "=" (Zuweisungsoperator) ausgeführt.
            Dieser erzeugt ein neues Objekt (man sagt auch eine neue Instanz) vom Typ der jeweiligen Klasse.

            Dann wird das erzeugte Objekt in der Variable auf der linken Seite des "=" gespeichert.

            Diese Variable muss mit dem passenden Typ (Name der Klasse) deklariert werden, damit im Arbeitsspeicher
            entsprechend viel Platz belegt wird.
         */
        Hund bello = new Hund("Bello");
        bello.setFellFarbe("schwarz");
        bello.setKampfhund(true);

        Hund waldi = new Hund("Waldi");
        waldi.setFellFarbe("braun");
        waldi.setKampfhund(false);

        Katze katti = new Katze("Katti", 12);

        Katze robert = new Katze("Robert", 11);

        Maus mausi = new Maus("Mausi", 0.1);
        mausi.setFellFarbe("weiß");

        Ente quacki = new Ente("Quacki", 0.25);

        Gehege friedeFreudeEierkuchenGehege = new Gehege(150);
        friedeFreudeEierkuchenGehege.add(bello);
        friedeFreudeEierkuchenGehege.add(waldi);
        friedeFreudeEierkuchenGehege.add(katti);
        friedeFreudeEierkuchenGehege.add(robert);
        friedeFreudeEierkuchenGehege.add(mausi);
        friedeFreudeEierkuchenGehege.add(quacki);

        Gehege raubtierGehege = new Gehege(50);
        Loewe leon = new Loewe("Leon", 100, "GRRRR");
        raubtierGehege.add(leon);

        friedeFreudeEierkuchenGehege.beschreibung();
        raubtierGehege.beschreibung();
    }
}
