package session2.strings;

/**
 * Was sind Strings, wie werden sie verändert und verkettet?
 */
public class Strings {
    public static void main(String[] args) {
        /*
            Strings werden wie andere Variablen auch deklariert und initialisiert.
            Das "S" in dem Datentyp String ist immer großgeschrieben, da es sich bei String um eine Klasse und nicht
            um einen primitiven Datentypen wie int oder boolean handelt.

            Ein String ist im Hintergrund aber nichts anderes als ein Array aus einzelnen Characters (Typ char).

            Zu beachten ist, dass die Befüllung einer Variablen vom Typ char mit einfachen Anführungszeichen
            passieren muss, während Strings in doppelte Anfü+hrungszeichen geschrieben werden.
         */

        char character = 'a';

        String nix; //Ein String ohne Initialwert erhält immer den Wert null
        String text = "Hello World";
        String leerZeichen = " ";
        String leerString = "";


        /*
            Testen, ob ein String überhaupt Zeichen enthält:
         */
        //System.out.println(nix.length()); //liefert eine NullPointerException
        System.out.println(text.length()); //Ausgabe 11 - das Leerzeichen gilt auch als Zeichen :)
        System.out.println(leerString.length()); //Ausgabe 0 - der String enthält keine Zeichen
        System.out.println(leerZeichen.length()); //Ausgabe 1 - sh. oben :)

        //System.out.println(nix.isEmpty()); //auch das liefert eine NullPointerException
        System.out.println(text.isEmpty()); //Ausgabe false
        System.out.println(leerString.isEmpty()); //Ausgabe true
        System.out.println(leerZeichen.isEmpty()); //Ausgabe false

        /*
            Nach enthaltenen Zeichen(-ketten) suchen:
         */
        if (text.contains("Hello")) {
            System.out.println("Der String enthält die Zeichenkette Hello.");
        }

        /*
            Mit contains() kann man zwar nach einzelnen Zeichenketten wie "a" suchen, aber nicht nach dem Character 'a'.
            Mit der Methode indexOf() kann man das tun.
            Sie liefert zudem die Position des ersten Auftretens des gesuchten Zeichens innerhalb des String zurück.
            Sollte das gesuchte Zeichen öfter als einmal vorkommen, wird das von indexOf() ignoriert.
            Wie bei Arrays (String ist ja ein char-Array ;) ) beginnt die Positions-Zählung bei 0.
            Ist das gesuchte Zeichen nicht enthalten, dann liefert indexOf den Wert -1 zurück.
            Mit indexOf() kann man auch nach Zeichenketten suchen.
         */
        System.out.println(text.indexOf('l')); //Ausgabe 2 => Positions-Zählung beginnt bei 0!
        System.out.println(text.indexOf('x')); //Ausgabe -1, x ist nicht in dem String enthalten
        System.out.println(text.indexOf("World")); //Ausgabe 6, World beginnt an Position 6 in unserem String

        /*
            Will man nicht das erste Vorkommen eines Zeichens/ einer Zeichenkette, sondern das letzte, dann ist die Methode
            lastIndexOf() hilfreich - außer, dass sie nach dem letzten Vorkommen des gesuchten Textes sucht, funktioniert
            sie analog zu indexOf().

            Interessant wird es beim 'l' - indexOf() liefert hierfür Position 2 - das erste l im String, lastIndexOf()
            liefert eine 9 - das letzte
         */
        System.out.println(text.lastIndexOf('l'));//Ausgabe 9 - es ist das letzte l im String, also das in World
        System.out.println(text.lastIndexOf('x')); //Ausgabe -1
        System.out.println(text.lastIndexOf("World")); // Ausgabe 6

        /*
            Es gibt mehrere Möglichkeiten, String miteinander zu vergleichen:
         */

        //equals vergleicht jedes einzelne Zeichen der beiden Strings - alles muss passen, dann liefert equals() true:
        System.out.println(text.equals("Hello World")); //Ausgabe true
        System.out.println(text.equals("Hallo Welt")); //Ausgabe false

        String test = "Helo World";
        System.out.println(text.equals(test)); //Ausgabe false - in test fehlt ein l

        test = "Hello World";
        System.out.println(text.equals(test)); //Ausgabe true

        //switch() kann Strings miteinander vergleichen:
        switch (text) {
            case "Hello World":
                System.out.println("Begrüßung");
                break;
            default:
                System.out.println("Keine Ahnung");
        }

        //startsWith() testet, ob ein String mit einer bestimmten Zeichenkette beginnt:
        System.out.println(text.startsWith("Hello")); //Ausgabe true
        System.out.println(text.startsWith("World")); //Ausgabe false

        //endsWith() testet, ob ein String mit einer bestimmten Zeichenkette endet:
        System.out.println(text.endsWith("Hello")); //Ausgabe false
        System.out.println(text.endsWith("World")); //Ausgabe true

        //substring(beginn) liefert die Zeichenkette ab der angegebenen Position
        System.out.println(text.substring(6)); //Ausgabe "World"

        //substring(beginn, ende) liefert die Zeichenkette zwischen den angegebenen Positionen:
        System.out.println(text.substring(3,7));//Ausgabe "lo W"

        /*
            String können mit dem +-Operator zu einer neuen Zeichenkette zusammengefügt (konkateniert) werden.

            Beachte: da Strings char-Arrays sind, wird für jede Verwendung des +-Operators im Hintergund ein neues
            char-Array angelegt (mit der neuen Zeichen-Anzahl) und dann der Inhalt des "alten" Arrays in das neue
            Array kopiert. Auch, wenn man den neuen Text in einem bereits vorhandenen String speichert.
         */
        text = text + " - how are you?";
        System.out.println(text); //Ausgabe "Hello World - how are you?"

        String fine = " I hope fine!";
        text = text + fine;
        System.out.println(text);//Ausgabe "Hello World - how are you? I hope fine!"

        //toUpperCase() überführt alle Kleinbuchstaben innerhalb des Strings in Großbuchstaben
        text = text.toUpperCase();
        System.out.println(text);

        //toLowerCase() überführt alle Großbuchstaben innerhalb des Strings in Kleinbuchstaben
        text = text.toLowerCase();
        System.out.println(text);

        /*
            Mit trim() lassen sich Leerzeichen vor und nach dem eigentlichen Text entfernen - Leerzeichen innerhalb des
            Strings bleiben aber erhalten:
         */
        text = "     Hello World      ";
        text = text.trim();
        text = text + fine;
        System.out.println(text);

        //Mit replace() lassen sich einzelne Characters oder ganze Zeichenketten innerhalb eines Strings ersetzen:
        text = text.replace('e', 'a');
        System.out.println(text); //Ausgabe "Hallo World I hopa fina!"

        text = text.replace("World", "Cat");
        System.out.println(text); //Ausgabe "Hallo Cat I hopa fina!"
    }
}
