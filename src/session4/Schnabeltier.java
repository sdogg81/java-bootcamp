package session4;

import java.util.Random;

public class Schnabeltier extends Saeugetier implements LegtEier{
    public Schnabeltier() {
        super("Quiek", "braun", Tierart.Schnabeltier);
    }

    @Override
    public void beschreiben() {
        System.out.printf("Das Schnabeltier legt Eier und sein Fell ist %s\n",this.getFellfarbe());
    }

    @Override
    public int eierLegen() {
        Random rnd = new Random();
        int anzahl = rnd.nextInt(5);
        return anzahl;
    }
}
