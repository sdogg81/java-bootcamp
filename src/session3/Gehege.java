package session3;

import java.util.ArrayList;

public class Gehege {
    private double flaeche;
    private ArrayList<Tier> tiere = new ArrayList<>();

    public Gehege(double flaeche){
        this.flaeche = flaeche;
    }

    public double getFlaeche() {
        return flaeche;
    }

    public void setFlaeche(double flaeche) {
        this.flaeche = flaeche;
    }

    public void add(Tier tier) {
        tiere.add(tier);
    }

    public ArrayList<Tier> getTiere() {
        return tiere;
    }

    public void setTiere(ArrayList<Tier> tiere) {
        this.tiere = tiere;
    }

    public void beschreibung(){
//        System.out.println("Normale for-Schleife:");
//        for(int i = 0; i < this.tiere.size(); i++){
//            System.out.println(this.tiere.get(i).getName());
//        }

        System.out.println("For-Each-Schleife bzw. erweiterte for-Schleife:");
        for(Tier tier : this.tiere){
//            System.out.println(tier.getClass().getSimpleName() + " " +  tier.getName());
//            System.out.println(tier.getTierart() + " " +  tier.getName());
//            System.out.printf("%s %s (Gewicht: %.2f Pfund)\n", tier.getTierart(), tier.getName(), tier.getGewicht());

            StringBuilder str = new StringBuilder();
            str.append(tier.getTierart())
                    .append(" ")
                    .append(tier.getName())
                    .append(" (Gewicht: ")
                    .append(tier.getGewicht())
                    .append(" Pfund)")
                    .append("\n");
            System.out.println(str.toString());

            str.append("JUHU");


        }

//        System.out.println("Mit Lambda-Ausdruck:");
//        this.tiere.forEach(tier -> System.out.println(tier.getName()));
//
//        System.out.println("Das Gehege hat eine Fläche von " + this.flaeche + " Quadratmetern.");
    }
}
