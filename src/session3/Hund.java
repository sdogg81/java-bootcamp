package session3;

import java.util.Random;

/**
 * Die Klasse "Hund" repräsentiert ganz allgemein einen Hund.
 */
public class Hund extends Saeugetier {

    private boolean kampfhund = true;

    public Hund(String name){
        super(Tierart.Hund, name, 0, "WAU");
        Random rnd = new Random();
        this.setGewicht(rnd.nextDouble(100) + 10);
    }

    /*
        Getter, die den Wert eines boolean-Attributs zurückgeben, werden gerne statt mit get... mit is... bezeichnet.
     */
    public boolean isKampfhund() {
        return kampfhund;
    }

    public void setKampfhund(boolean kampfhund) {
        this.kampfhund = kampfhund;
    }
}
