package session1.IV_controlStructures.loops.forLoop;

/**
 *  Schleifen dienen dazu, bestimmte Anweisungen immer wieder abzuarbeiten. Zu einer Schleife gehören die
 *  Schleifenbedingung und der Rumpf.
 *
 *  Die Schleifenbedingung, ein boolescher Ausdruck, entscheidet darüber, unter welcher Bedingung die Wiederholung
 *  ausgeführt wird.
 *
 *  Abhängig von der Schleifenbedingung kann der Rumpf mehrmals ausgeführt werden. Dazu wird bei jedem
 *  Schleifendurchgang die Schleifenbedingung geprüft. Das Ergebnis entscheidet, ob der Rumpf ein weiteres
 *  Mal durchlaufen (true) oder die Schleife beendet wird (false).
 */
public class ForLoop {
    public static void main(String[] args) {
        /*
            Der Kopf einer for-Schleife besteht aus drei Teilen:

            Der erste Teil kann lokale Variablen deklarieren und initialisieren (bspw. int i = 0).
            Diese Zählvariable ist dann außerhalb des Blocks nicht mehr gültig.

            Der mittlere Teil (bspw. i <= 10) wird vor dem Durchlaufen des Schleifenrumpfs – also vor jedem
            Schleifeneintritt – getestet.
            Ergibt der Ausdruck false , wird die Schleife nicht bzw. kein weiteres Mal durchlaufen und beendet.
            Das Ergebnis dieses Tests muss vom Typ boolean sein.
            Ist kein Test angegeben, so ist das Ergebnis automatisch true.

            Der letzte Teil  (bspw. i++) wird immer am Ende jedes Schleifendurchlaufs, aber noch vor dem nächsten
            Schleifeneintritt ausgeführt.

            Ergibt die Bedingung des Tests true, dann befindet sich beim nächsten Betreten des Rumpfs der veränderte
            Wert im Rumpf.
         */

        //for-Schleife, die die Zahlen 0 bis neun auf der Konsole ausgibt:
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        //System.out.println(i); // Die Zählvariable i ist außerhalb der Schleife nicht mehr bekannt, daher gibt es
                                // einen Compiler-Fehler, wenn man versucht, außerhalb der Schleife darauf zuzugreifen

        //verändert man den Test auf i <= 10, dann gibt die Schleife die Zahlen 0 bis 10 aus:
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        //statt des Post-Inkrements i++ kann man auch andere Inkrementoren, wie bspw. das Pre-Inkrement, verwenden:
        for (int i = 0; i <= 10; ++i) {
            System.out.println(i);
        }

        // man kann die Zählvariable auch beliebigen anderen Schritten erhöhen oder verringern:
        for (int i = 0; i < 10; i = i + 2) {
            System.out.println(i); //Ausgabe der Zahlen von 0 bis 8 in 2er-Schritten
        }

        for (int i = 0; i < 100; i = i + 10) {
            System.out.println(i); //Ausgabe der Zahlen von 0 bis 90 in 10er-Schritten
        }

        //Rückwärts geht das Ganze natürlich auch - allerdings muss man die Logik des Test-Ausdrucks entsprechend anpassen!
        for (int i = 100; i >= 0 ; i--) {
            System.out.println(i); //Ausgabe der Zahlen von 100 bis 0, wie bei einem Countdown
        }

        /*
        //Man kann auch mit der for-Schleife eine Endlos-Schleife bauen, wenn man das braucht.
        //Werden die drei benötigten Teile des Schleifen-Kopfes nicht angegeben, dann werden sie automatisch zu true:
        for (;;) {
            System.out.println("Hilfe, ich befinde mich in einer Endlos-Schleife!!!");
        }
        */

        //for-Schleifen können auch ineinander verschachtelt werden:
        for(int x = 0; x < 10; x++){
            for(int y = 0; y < 10; y++){
                int result = x * y;
                System.out.printf("x=%s mal y=%s ergibt %s\n", x, y, result);
            }
        }

        // Mit break; kann man eine Schleife jederzeit komplett verlassen:
        for (int i = 100; i >= 0 ; i--) {
            System.out.println(i); //Ausgabe der Zahlen von 100 bis 0, wie bei einem Countdown
            if(i == 85){
                break; // Ende der Schleife, wenn die Zahl 85 erreicht ist
            }
        }
        System.out.println("Schleife beendet");

        //Mit continue; kann man einen einzelnen Schleifendurchlauf abbrechen und den nächsten Durchlauf triggern:
        for (int i = 10; i >= 0 ; i--) {
            if(i % 2 != 0){
                //es sollen nur gerade Zahlen ausgegeben werden, daher überspringen wir die Ausgabe bei modulo != 0:
                continue;
            }
            System.out.println(i); //Ausgabe der Zahlen von 10 bis 0, wie bei einem Countdown
        }
    }
}
