package session4;


import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Zoo {
    private static Logger logger = LogManager.getLogger(Zoo.class);

    public static void main(String[] args) {
        Loewe loewe = new Loewe();
        loewe.gibLaut();
        loewe.beschreiben();

        Kuh kuhLieselotte = new Kuh();
        kuhLieselotte.gibLaut();
        kuhLieselotte.beschreiben();

        Kuh kuhFranziska = new Kuh();
        kuhFranziska.setFellfarbe("braun");
        kuhFranziska.gibLaut();
        kuhFranziska.beschreiben();

        Moewe moewe = new Moewe();
        moewe.gibLaut();
        moewe.beschreiben();

        Schnabeltier schnabeltier = new Schnabeltier();

        Gehege<Kuh> kuhWeide = new Gehege<Kuh>();
        kuhWeide.addTier(kuhLieselotte);
        kuhWeide.addTier(kuhFranziska);
        kuhWeide.beschreiben();

        Gehege<Loewe> loewenGehege = new Gehege<Loewe>();
        loewenGehege.addTier(loewe);
        loewenGehege.beschreiben();

        Gehege<LegtEier> eierLegerGehege = new Gehege<LegtEier>();
        eierLegerGehege.addTier(schnabeltier);
        eierLegerGehege.addTier(moewe);
        eierLegerGehege.beschreiben();

        Moewe moewe2 = new Moewe();

        System.out.println(schnabeltier.eierLegen());


        Nest nest = new Nest();
        nest.setTierImNest(moewe);
        nest.eierZaehlen();

        nest.setTierImNest(schnabeltier);
        nest.eierZaehlen();

        Loewe clarence = new Loewe();

        Zoowaerter karl = new Zoowaerter();
        karl.setGehege(loewenGehege);

        try {
            karl.removeTier(clarence);
        }
        catch (AnimalNotFoundException anf){
            logger.log(Level.ERROR, "Dieser Löwe ist gar nicht in diesem Gehege. Hast du Lack gesoffen?");
        }

        System.out.println("Auf Wiedersehen in unserem schönen Zoo!");
    }
}
