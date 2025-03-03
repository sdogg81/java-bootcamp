package session3;

public class Tier {
    private Tierart tierart;
    private String name;
    private int beine;
    private String laut = "";
    private double gewicht;

    public Tier(Tierart tierart, String name, double gewicht, String laut) {
        this.tierart = tierart;
        this.name = name;
        this.gewicht = gewicht;
        this.laut = laut;
    }

    public Tierart getTierart() {
        return tierart;
    }

    public void setTierart(Tierart tierart) {
        this.tierart = tierart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!(name == null)) {
            if (!name.isEmpty()) {
                this.name = name;
            }
        } else {
            System.out.println("Der Name darf nicht leer sein.");
        }
    }

    public int getBeine() {
        return beine;
    }

    public void setBeine(int beine) {
        this.beine = beine;
    }

    public String getLaut() {
        return laut;
    }

    public void setLaut(String laut) {
        this.laut = laut;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public String gibLaut() {
        return this.laut;
    }
}
