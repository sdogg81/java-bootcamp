package session1.III_expressionsAndOperators.examples;

public class OperatorExample {
    public static void main(String[] args) {
        // Zuweisungsoperator '='
        int zahl1 = 10; // Wir weisen der Variable zahl1 den Wert 10 zu
        int zahl2 = 20; // Wir weisen der Variable zahl2 den Wert 20 zu

        // Vergleichsoperator '=='
        boolean sindGleich = (zahl1 == zahl2); // Prüft, ob zahl1 und zahl2 gleich sind
        System.out.println("Sind zahl1 und zahl2 gleich? " + sindGleich);

        // Arithmetische Operatoren: +, -, *, /
        int summe = zahl1 + zahl2; // Addition
        int differenz = zahl2 - zahl1; // Subtraktion
        int produkt = zahl1 * zahl2; // Multiplikation
        int quotient = zahl2 / zahl1; // Division

        System.out.println("Summe: " + summe);
        System.out.println("Differenz: " + differenz);
        System.out.println("Produkt: " + produkt);
        System.out.println("Quotient: " + quotient);

        // Logische Operatoren: &&, ||, !
        boolean istGroesser = (zahl1 > 5) && (zahl2 > 15); // Beide Bedingungen müssen wahr sein
        boolean istEinesWahr = (zahl1 > 15) || (zahl2 > 15); // Eine der beiden Bedingungen muss wahr sein
        boolean istNichtWahr = !(zahl1 > zahl2); // Negiert das Ergebnis des Vergleichs

        System.out.println("Ist zahl1 größer als 5 UND zahl2 größer als 15? " + istGroesser);
        System.out.println("Ist zahl1 größer als 15 ODER zahl2 größer als 15? " + istEinesWahr);
        System.out.println("Ist zahl1 NICHT größer als zahl2? " + istNichtWahr);
    }
}
