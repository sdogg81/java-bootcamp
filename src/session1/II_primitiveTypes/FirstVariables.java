package session1.II_primitiveTypes;

public class FirstVariables {

    /**
     * Erste Variablen erstellen und verschiedene Arten von Deklaration und Initialisierung aufzeigen:
     */
    public static void main(String[] args) {
        /*
            Variablen werden in Java immer in der camelCase-Schreibweise geschrieben, d.h. der erste Buchstabe
            ist klein und bei zusammengesetzten Wörtern werden die folgenden Wörter immer mit großem Buchstaben
            begonnen.
         */

        //Variablen einzeln deklarieren:
        String name; // Name
        int age; // Alter
        double income; // Einkommen
        char gender; // Geschlecht ('f' oder 'm')
        boolean isPresident; // Ist Präsident (true oder false)
        boolean isVegetarian; // Ist die Person Vegetarier?

        /*
        WICHTIG!
        Die Laufzeitumgebung – bzw. der Compiler – initialisiert lokale Variablen nicht automatisch mit
        einem Nullwert bzw. Wahrheitsvarianten nicht mit false. Vor dem Lesen müssen lokale Variablen von Hand
        initialisiert werden, andernfalls gibt der Compiler eine Fehlermeldung aus!

        System.out.println(age); // diese Zeile würde hier bspw. liefern: "Local variable age may not have been initialized."
        */


        /*
            Ist der Datentyp für mehrere Variablen der gleiche, dann können mehrere Variablen auch gleichzeitig
            deklariert werden:
         */
        int height, weight; // Größe und Gewicht


        //Variablen initalisieren (= mit einem initialen (Start-)Wert befüllen):
        name = "Max Mustermann";
        age = 35;
        income = 4000;
        gender = 'M';
        isPresident = false;
        isVegetarian = true;
        height = 175;
        weight = 75;

        //Variablen deklarieren und initialisieren in einem Schritt:
        String profession = "Biologe";

        //mehrere Variablen vom gleichen Typ gleichzeitig deklarieren und initialisieren:
        String abteilung = "Limnologie", // Limnologie ist die Erforschung von Seen ;)
                vorgesetzter = "Donald Trump";


        /*
         * Wenn der Datentyp durch die Initialisierung eindeutig feststeht, dann kann man den
         * Datentyp auch weglassen und stattdessen "var" schreiben:
         */
        var title = "Doctor"; //title wird hier automatisch zu einem String


        /*
            darf sich eine Variable nach der Initialisierung  im weiteren Programmverlauf nicht mehr verändern,
            dann kann die Variable als "final" deklariert werden. Mann nennt so eine Variable dann auch "Konstante"
            - beachte, dass sich bei Konstanten die Schreibweise von camelCase zu UPPER_SNAKE_CASE ändert.

            Das ist kein Muss, bietet sich aber an, da dadurch sofort erkennbar ist, ob es sich um eine Konstanten handelt
            oder nicht.
         */
        final String EYE_COLOR = "blau"; //die Augenfarbe ist blau und ändert sich nicht mehr

        // Versucht man nun, die Augenfarbe zu ändern, bekommt man einen Fehler:
        //EYE_COLOR = "grün"; // wird diese Zeile einkommentiert, so wirft der Compiler einen Fehler aus

    }
}
