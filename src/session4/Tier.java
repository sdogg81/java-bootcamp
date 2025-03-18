package session4;

public abstract class Tier {
    private String laut;
    private String farbe;

    private Tierart tierart;

    public Tier(String laut, String farbe, Tierart tierart){
        this.laut = laut;
        this.farbe = farbe;
        this.tierart = tierart;
    }

    public String getLaut() {
        return laut;
    }

    public void setLaut(String laut) {
        this.laut = laut;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public Tierart getTierart() {
        return tierart;
    }

    public void setTierart(Tierart tierart) {
        this.tierart = tierart;
    }

    public void gibLaut(){
        System.out.println(this.laut);
    }

    public abstract void beschreiben();
}
