package session4;

public class Zoo {
    public static void main(String[] args){
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


        System.out.println(schnabeltier.eierLegen());


        Nest nest = new Nest();
        nest.setTierImNest(moewe);
        nest.eierZaehlen();

        nest.setTierImNest(schnabeltier);
        nest.eierZaehlen();
    }
}
