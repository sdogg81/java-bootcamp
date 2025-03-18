package session4;

public class Kuh extends Saeugetier{
    public Kuh(){
        super("MUH", "schwarzweiß", Tierart.Kuh);
    }

    @Override
    public void beschreiben() {
        System.out.printf("Diese Kuh hat ein Fell, das ist %s\n", this.getFellfarbe());
    }
}
