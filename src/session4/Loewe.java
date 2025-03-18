package session4;

public class Loewe extends Saeugetier{

    public Loewe() {
        super("ROAR", "orangebraun", Tierart.Löwe);
    }

    @Override
    public void beschreiben() {
        System.out.printf("Dieser Löwe hat ein Fell, das ist %s\n", this.getFellfarbe());
    }
}
