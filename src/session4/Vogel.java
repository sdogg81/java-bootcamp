package session4;

public abstract class Vogel extends Tier implements LegtEier{
    private double spannweite;
    public Vogel(String laut, String farbe, Tierart tierart){
        super(laut, farbe, tierart);
    }

    public double getSpannweite() {
        return spannweite;
    }

    public void setSpannweite(double spannweite) {
        this.spannweite = spannweite;
    }
}
