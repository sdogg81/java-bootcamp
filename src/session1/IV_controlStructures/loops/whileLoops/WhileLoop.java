package session1.IV_controlStructures.loops.whileLoops;

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
public class WhileLoop {
    public static void main(String[] args) {
        /*
            Die while-Schleife ist eine abweisende Schleife, die vor jedem Schleifeneintritt die Schleifenbedingung prüft.

            Ist die Bedingung wahr, führt sie den Rumpf aus, andernfalls beendet sie die Schleife.
            Wie bei if muss auch bei den while-Schleifen der Typ der Bedingung boolean sein.

            Ist die Bedingung schon vor dem ersten Eintritt in den Rumpf nicht wahr, so wird der Rumpf erst gar nicht durchlaufen.

            Anders als bei den For-Schleifen gibt es bei den while-Schleifen nicht automatisch eine Zählvariable.
            Man muss sich also selbst darum kümmern, dass der Schleifenabbruch zum richtigen Zeitpunkt erfolgt.
         */

        int count = 100;
        while(count >= 40){
            System.out.println(count);
            count -= 10;
        }

        // Dadurch, dass die Variable count außerhalb der Schleife deklariert wurde, kann sie auch nach der Schleife
        // noch verwendet werden:

        System.out.println("Der Wert von count ist jetzt " + count);

        /*
        // Eine Endlos-Schleife lässt sich mit einer while-Schleife ganz leicht erzeugen:
        while(true){
            System.out.println("Hilfe, ich bin in einer Endlos-Schleife gefangen!");
        }
         */

        //auch while-Schleifen können ineinander verschachtelt werden:
        int a = 5;
        int b = 10;
        while(a > 0){
            while(b > 0){
                System.out.println(a + b);
                a--;
                b = b - 2;
            }
        }

        // Mit break; kann man eine Schleife jederzeit komplett verlassen:
        count = 100;
        while(count >= 40){
            System.out.println(count);
            if(count == 50){
                break;
            }
            count -= 10;
        }
        System.out.println("Schleife beendet");

        //Mit continue; kann man einen einzelnen Schleifendurchlauf abbrechen und den nächsten Durchlauf triggern:
        count = 100;
        while(count >= 0){
            //wir wollen nur die geraden Zahlen ausgeben lassen, daher bei modulo != 0 überspringen:
            count -= 1;
            if(count % 2 != 0){
                continue;
            }
            System.out.println(count);
        }
    }
}
