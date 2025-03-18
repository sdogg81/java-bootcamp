package session4;

public class Nest {
    private LegtEier tierImNest;

    public LegtEier getTierImNest() {
        return tierImNest;
    }

    public void setTierImNest(LegtEier tierImNest) {
        this.tierImNest = tierImNest;
    }

    public void eierZaehlen(){
        if(this.tierImNest instanceof Saeugetier){
            System.out.println("Ach, das ist ein Säugetier.");
        }
        else{
            System.out.println("Ach, das ist ein Vogel.");
        }
        System.out.printf("In diesem Nest sitzt ein(e) %s und darin liegen %d Eier.\n", ((Tier)this.tierImNest).getTierart(), this.tierImNest.eierLegen());
    }
}
