package session4;

public abstract class Saeugetier extends Tier{
    private String fellfarbe;

    public Saeugetier(String laut, String fellfarbe, Tierart tierart){
        super(laut, fellfarbe, tierart);
        this.fellfarbe = fellfarbe;
    }

    public String getFellfarbe() {
        return fellfarbe;
    }

    public void setFellfarbe(String fellfarbe) {
        this.fellfarbe = fellfarbe;
    }

}
