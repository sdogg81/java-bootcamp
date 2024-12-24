package session1.IV_controlStructures.ifElse;

/**
 * Bedingte Anweisungen und Fall-Unterscheidungen
 */
public class IfElse {
    public static void main(String[] args) {
        /*
            Die if -Anweisung besteht aus dem Schlüsselwort if, dem zwingend ein Ausdruck mit dem Typ boolean
            in Klammern folgt. Es folgt eine Anweisung, die oft eine Blockanweisung ist.
         */

        int a = 3;
        int b = 4;

        if (a < b) {
            /*
                alle Anweisungen in diesem Block zwischen den geschweiften Klammern {} werden ausgeführt,
                wenn die Bedingung in den runden Klammern (hier a < b) wahr ist - also wenn a kleiner als b ist.
             */
            System.out.println("a ist kleiner als b");
        }


        /*
            Neben der einseitigen Alternative existiert die zweiseitige Alternative. Das optionale Schlüsselwort
            else mit angehängter Anweisung veranlasst die Ausführung einer Alternative, wenn der if -Test falsch ist.
         */
        if (a < b) {
            System.out.println("a ist kleiner als b");
        } else {
            System.out.println("a ist nicht kleiner als b");
        }


        //if-Anweisungen können auch ineinander verschachtelt werden:
        if (a < b) {
            System.out.println("a ist kleiner als b");
            if (a == 3) {
                System.out.println("3 ist meine Lieblingszahl!"); // Diese Zeile wird nur dann ausgeführt, wenn a < b und a == 3 ist
            }
        } else {
            System.out.println("a ist nicht kleiner als b");
        }

        /*
            Die bisherigen Abfragen waren sehr einfach, doch kommen in der Praxis viel komplexere Bedingungen vor.
            Oft im Einsatz sind die logischen Operatoren && (Und), || (Oder), ! (Nicht).
         */
        if (a < b && b % 2 == 0) {
            System.out.println("a ist kleiner als b und b ist eine gerade Zahl");
        } else {
            System.out.println("Keine Ahnung, was hier passiert :)");
        }


        /*
            if -Anweisungen zur Programmführung kommen sehr häufig in Programmen vor, und noch häufiger werden
            sie genutzt, um eine Variable auf einen bestimmten Wert zu prüfen. Dazu werden if - und
            if - else -Anweisungen gerne verschachtelt (kaskadiert).

            Wenn eine Variable einem Wert entspricht, dann wird eine Anweisung ausgeführt, sonst wird die Variable
            mit einem anderen Wert getestet usw.

            Beispiel:
            Kaskadierte if-Anweisungen sollen uns helfen, die Variable days passend zu dem Monat
            (vorbelegte Variable month) und der Information, ob das Jahr ein Schaltjahr ist
            (vorbelegte boolean - Variable isLeapYear), zu belegen:
         */
        int month = 2;
        boolean isLeapYear = false;
        int days;

        if (month == 4) {
            days = 30;
        } else if (month == 6) {
            days = 30;
        } else if (month == 9) {
            days = 30;
        } else if (month == 11) {
            days = 30;
        } else if (month == 2) {
            if (isLeapYear) {
                // Sonderbehandlung für Februar im Fall eines Schaltjahrs
                days = 29;
            } else {
                days = 28;
            }
        } else {
            days = 31;
        }


        /*
            In Java gibt es einen einzigen Operator, der drei Operanden benutzt: den Bedingungsoperator,
            auch Konditionaloperator genannt. Er erlaubt es, den Wert eines Ausdrucks von einer Bedingung
            abhängig zu machen, ohne dass dazu eine if -Anweisung verwendet werden muss.

            Die Operanden sind durch ? und : voneinander getrennt.

            Die allgemeine Syntax ist: Bedingung ? Ausdruck, wenn Bedingung wahr : Ausdruck, wenn Bedingung falsch
         */
        System.out.println((a < b) ? "a ist kleiner als b" : "a ist nicht kleiner als b");
    }
}
