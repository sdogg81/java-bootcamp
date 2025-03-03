package session3;

/**
 * Die KLasse "Maus" repräsentiert ganz allgemein eine Maus.
 */
public class Maus extends Saeugetier {
    public Maus(String name, double gewicht) {
        super(Tierart.Maus, name, gewicht, "PIEP");
    }
}
