package session3;

public class Saeugetier extends Tier {
    private String fellFarbe = "schwarz";

    public Saeugetier(){

    }

    public Saeugetier(String name, double gewicht, String laut){
        super(name, gewicht, laut);
    }

    public String getFellFarbe() {
        return fellFarbe;
    }

    public void setFellFarbe(String fellFarbe) {
        this.fellFarbe = fellFarbe;
    }
}
