package session3;

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
        Hund bello = new Hund();
        bello.setName("Bello");
        bello.setLaut("WOUH");
        bello.setGewicht(73.5);
        bello.setFellFarbe("schwarz");
        bello.setKampfhund(true);

        Hund waldi = new Hund();
        waldi.setName("Waldi");
        waldi.setLaut("Wiff");
        waldi.setGewicht(25.5);
        waldi.setFellFarbe("braun");
        waldi.setKampfhund(false);

        Katze katti = new Katze();
        katti.setName("Katti");
        katti.setLaut("Miau");
        katti.setGewicht(12);

        Katze robert = new Katze();
        robert.setName("Robert");
        robert.setLaut("Miiiiiauuuuu");
        robert.setGewicht(11);

        Maus mausi = new Maus();
        mausi.setName("Mausi");
        mausi.setFellFarbe("weiß");
        mausi.setLaut("Piep");
        mausi.setGewicht(0.1);

        Ente quacki = new Ente();
        quacki.setName("Quacki");
        quacki.setLaut("Quak");
        quacki.setGewicht(0.250);

        System.out.println("Der Hund " + waldi.getName() + "hat ein Fell, das " + waldi.getFellFarbe() + " ist. Er wiegt " + waldi.getGewicht() + " Pfund und macht " + waldi.gibLaut() + ".");
        System.out.println("Der Hund " + bello.getName() + "hat ein Fell, das " + bello.getFellFarbe() + " ist. Er wiegt " + bello.getGewicht() + " Pfund und macht " + bello.gibLaut() + ".");
        System.out.println("Die Katze " + katti.getName() + "hat ein Fell, das " + katti.getFellFarbe() + " ist. Sie wiegt " + katti.getGewicht() + " Pfund und macht " + katti.gibLaut() + ".");
        System.out.println("Der Kater " + robert.getName() + "hat ein Fell, das " + robert.getFellFarbe() + " ist. Er wiegt " + robert.getGewicht() + " Pfund und macht " + robert.gibLaut() + ".");
        System.out.println("Die Maus " + mausi.getName() + "hat ein Fell, das " + mausi.getFellFarbe() + " ist. Sie wiegt " + mausi.getGewicht() + " Pfund und macht " + mausi.gibLaut() + ".");
        System.out.println("Die Ente " + quacki.getName() + " wiegt " + quacki.getGewicht() + " Pfund und macht " + quacki.gibLaut() + ".");


    }
}
