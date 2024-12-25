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
public class DoWhileLoop {
    /*
        Dieser Schleifentyp prüft die Schleifenbedingung erst nach jedem Schleifendurchgang.
        Bevor es zum ersten Test kommt, ist der Rumpf schon einmal durchlaufen worden.
     */

    public static void main(String[] args) {
        int count = 10;
        do{
            System.out.println("Dieser Code wird immer zumindest einmal ausgeführt");
            count--;
        } while(count > 10);

        // Mit break; kann man eine Schleife jederzeit komplett verlassen:
        count = 100;
        do{
            System.out.println(count);
            if(count == 50){
                break;
            }
            count -= 10;
        }
        while(count >= 40);
        System.out.println("Schleife beendet");

        //Mit continue; kann man einen einzelnen Schleifendurchlauf abbrechen und den nächsten Durchlauf triggern:
        count = 100;
        do{
            //wir wollen nur die geraden Zahlen ausgeben lassen, daher bei modulo != 0 überspringen:
            count -= 1;
            if(count % 2 != 0){
                continue;
            }
            System.out.println(count);
        }
        while(count >= 0);
    }


}
