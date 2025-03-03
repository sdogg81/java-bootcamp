package session3;

public class Saeugetier extends Tier {
    private String fellFarbe = "schwarz";

    public Saeugetier(Tierart tierart, String name, double gewicht, String laut) {
        super(tierart, name, gewicht, laut);
    }

    public String getFellFarbe() {
        return fellFarbe;
    }

    public void setFellFarbe(String fellFarbe) {
        this.fellFarbe = fellFarbe;
    }
}
