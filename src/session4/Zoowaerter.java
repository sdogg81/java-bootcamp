package session4;

public class Zoowaerter {
    private Gehege gehege;

    public Gehege getGehege() {
        return gehege;
    }

    public void setGehege(Gehege gehege) {
        this.gehege = gehege;
    }

    public void removeTier(Tier tier) throws AnimalNotFoundException{
        System.out.println("Ich entferne das Tier aus dem Gehege.");
        this.gehege.removeTier(tier);
    }
}
