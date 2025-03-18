package session4;

import java.util.LinkedList;

public class Gehege<T> {
    private LinkedList<T> tiere = new LinkedList<>();

    public void addTier(T tier){
        if(!this.tiere.contains(tier)){
            this.tiere.add(tier);
        }
        else{
            System.out.println("Dieses Tier befindet sich schon in diesem Gehege.");
        }
    }

    public LinkedList<T> getTiere() {
        return this.tiere;
    }

    public void setTiere(LinkedList<T> tiere) {
        this.tiere = tiere;
    }

    public void removeTier(T tier){
        if(this.tiere.contains(tier)){
            this.tiere.remove(tier);
        }
        else{
            System.out.println("Das Tier befindet sich nicht in diesem Gehege.");
        }
    }

    public void beschreiben(){
        if(this.tiere.size() == 0){
            System.out.println("Das Gehege ist leer.");
        }
        else{
            System.out.println("In diesem Gehege sind folgende Tiere:");
            for(T tier: this.tiere){
                if(tier instanceof Tier){
                    ((Tier)tier).beschreiben();
                }
            }
        }
    }
}
