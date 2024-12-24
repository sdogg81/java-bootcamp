package session1.III_expressionsAndOperators;

/**
 *  Die verschiedenen Operatoren und ihre Anwendung
 */
public class Operators {
    public static void main(String[] args) {
        /*
            In Java dient das Gleichheitszeichen = der Zuweisung (engl. assignment ).
            Der Zuweisungsoperator ist ein binärer Operator, bei dem auf der linken Seite die zu
            belegende Variable steht und auf der rechten Seite ein Ausdruck.
         */

        int i = 2 * 12;
        /*
            Erst NACH dem Auswerten des Ausdrucks auf der rechten Seite kopiert der Zuweisungsoperator
            das Ergebnis in die Variable.
         */

        // mehrere Zuweisungen in einem Schritt sind möglich:
        int a;
        int b;
        int c;

        a = b = c = 0;

        /*
        Ein arithmetischer Operator verknüpft die Operanden mit den Operatoren
            - Addition ( + ),
            - Subtraktion (–),
            - Multiplikation ( * ) und
            - Division ( / ).

            Zusätzlich gibt es den Restwert-Operator ( % ), der den bei der Division verbleibenden Rest betrachtet (Modulo).
         */

        b = 5 - 3; // b = 2
        c = 7 * 2; // c = 14
        a = b + c; // a = 16
        a = a / 2; // a = 8
        int d = a % b; // d = 0, da 8 / 2 = 4 ist und eben keinen Rest ergibt, also 0

        /*
            Das Herauf- und Heruntersetzen von Variablen ist eine sehr häufige Operation, wofür die Entwickler
            in der Vorgängersprache C auch einen Operator spendiert hatten. Die praktischen Operatoren ++ und --
            kürzen die Programmzeilen zum Inkrement und Dekrement ab:
        */

        i++;    // Abkürzung für i = i + 1 - "Post"-Inkrement, da die Erhöhung NACH dem Auslesen stattfindet
        ++i;    // Abkürzung für i = i + 1 - "Pre"-Inkrement, da die Erhöhung VOR dem Auslesen stattfindet

        a--;    // Abkürzung für a = a - 1 - "Post"-Dekrement, da die Reduzierung NACH dem Auslesen stattfindet
        --a;    // Abkürzung für a = a - 1 - "Pre"-Dekrement, da die Reduzierung VOR dem Auslesen stattfindet

        /*
            Eine lokale Variable muss allerdings vorher initialisiert sein, da ein Lesezugriff vor einem
            Schreibzugriff stattfindet.
            Der ++ / –– -Operator erfüllt somit zwei Aufgaben: Neben der Wertrückgabe gibt es eine Veränderung der Variablen.
         */

        //Beispiele für Prefix- In- und Dekrement:
        int x = 10, y = 20;
        System.out.println( ++x ); // 11
        System.out.println( --y ); // 19
        System.out.println( x ); // 11
        System.out.println( y ); // 19

        //Beispiele für Postfix- In- und Dekrement:
        int u = 10, v = 20;
        System.out.println( u++ ); // 10
        System.out.println( v--); // 20
        System.out.println( u ); // 11
        System.out.println( v ); // 19

        /*
            In Java sind Inkrement ( ++ ) und Dekrement ( -- ) für alle numerischen Datentypen erlaubt,
            also auch für Fließkommazahlen:
         */
        double t = 12;
        System.out.println( --d ); // 11.0

        double e = 12.456;
        System.out.println( --e ); // 11.456


        /*
            In Java lassen sich Zuweisungen auch mit numerischen Operatoren kombinieren:
         */
        a += 2;     // Abkürzung für a = a + 2
        a -= 10;    // Abkürzung für a = a - 10
        a *= -1;    // Abkürzung für a = a * –1
        a /= 10;    // Abkürzung für a = a / 10


        /*
            Relationale Operatoren sind Vergleichsoperatoren , die Ausdrücke miteinander vergleichen und
            einen Wahrheitswert vom Typ boolean ergeben.

            Die von Java für NUMERISCHE Vergleiche zur Verfügung gestellten Operatoren sind:
             - größer ( > )
             - kleiner ( < )
             - größer/gleich ( ≥ )
             - kleiner/gleich ( ≤ )
             - Test auf Gleichheit ( == )
             - Test auf Ungleichheit ( != )
         */

        boolean isOrange = true; // Zuweisung (nur ein "="-Zeichen)

        boolean hasColor = isOrange == true;    // zuerst wird die rechte Seite ausgewertet - hier haben wir einen Vergleich
                                                // (doppeltes "="-Zeichen), der einen Wahrheitswert liefert (true/false) -
                                                // dieser Wert wird dann der Variablen hasColor zugewiesen (nur ein "=")


        System.out.println(hasColor); // gibt den Wert "true" aus, isOrange den Wert "true" hat (sh. oben)


        /*
            Logische Operatoren:
            Die Abarbeitung von Programmcode ist oft an Bedingungen geknüpft. Diese Bedingungen sind oftmals
            komplex zusammengesetzt, wobei drei Operatoren am häufigsten vorkommen:

            - Nicht (!) : Dreht die Aussage um; aus wahr wird falsch und aus falsch wird wahr .
            - Und (&&) : Beide Aussagen müssen wahr sein, damit die Gesamtaussage wahr wird.
            - Oder (||) : Eine der beiden Aussagen muss wahr sein, damit die Gesamtaussage wahr wird.
         */

        boolean hasRedHair = true;
        boolean hasBlueEyes = false;

        boolean result;

        result = !hasRedHair; // result = false, da hasRedHair den Wert true hat (sh. oben)
        result = hasRedHair && hasBlueEyes;     // result = false, da beide Aussagen wahr sein müssten, um true zu ergeben
        result = hasRedHair && !hasBlueEyes;    // result = true, da hasBlueEyes negiert wird und somit beide Aussagen wahr sind
        result = hasRedHair || hasBlueEyes;     // result = true, da bei || nur eine der beiden Aussagen wahr sein muss
        result = !hasRedHair || hasBlueEyes;    // result = false, das hier durch die Negation von hasRedHair beide Aussagen falsch sind


    }
}
