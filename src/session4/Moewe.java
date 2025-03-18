package session4;

public class Moewe extends Vogel{
    public Moewe() {
        super("KIÄÄÄÄK", "weiß", Tierart.Möwe);
    }

    @Override
    public void beschreiben() {
        System.out.printf("Diese Möew ist %s\n", this.getFarbe());
    }

    @Override
    public int eierLegen() {
        return 2;
    }
}
