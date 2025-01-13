package session2.arrays;

/**
 *  Arrays erzeugen, befüllen und ihre Inhalte ausgeben lassen.
 */
public class Arrays {
    public static void main(String[] args) {
        //Arrays werden wie ganz normale Variablen deklariert, allerdings mit der Array-Markierung []
        int[] ganzeZahlen;
        double[] fliesskommaZahlen;
        String[] strings;

        /*
            Die Initialisierung eines leeren Arrays erfolgt über das Schlüsselwort new.
            Besonderheit in Java: Arrays haben eine fest definierte Größe, die bei der Initialisierung
            mit angegeben werden muss:
         */
        ganzeZahlen = new int[10];
        fliesskommaZahlen = new double[5];
        strings = new String[17];

        //Deklaration und Initialisierung von Arrays kann wie bei normalen Variablen in einer Anweisung erfolgen:
        int[] jahre = new int[10];

        /*
            Kennt man zum Zeitpunkt der Erstellung bereits den Inhalt des Arrays, dann kann man die Werte
            direkt zum Zeitpunkt der Initialisierung in das Array schreiben:
         */
        double[] preise = {27.5, 89.29, 17.45, 9.99};

        /*
            Auf die einzelnen Elemente innerhalb eines Arrays kann man über den Index zugreifen.
            ACHTUNG! Der Index bei Arrays in Java beginnt immer bei 0!
            Das heißt, das erste Element innerhalb eines Arrays hat den Index 0.
         */
        System.out.println(preise[0]); //Ausgabe ist 27.5

        //Genauso befüllt man einzelne Positionen in einem Array mit neuen Elementen:
        jahre[0] = 1987;
        jahre[1] = 1989;
        jahre[2] = 2000;

        //Aufpassen auf den Index => greift man auf einen Index zu, den es nicht gibt, dann bekommt man eine ArrayIndexOutOfBoundsException
        //jahre[89] = 8888;

        /*
            Die Anzahl der Elemente innerhalb eines Arrays bekommt man über die Eigenschaft length heraus:
         */
        System.out.println(preise.length); // Ausgabe ist 4

        /*
            über eine for-Schleife kann man sich die einzelnen Elemente eines Arrays nacheinander ausgeben lassen.
            ACHTUNG! Da der Index im Array ja bei 0 beginnt, ist der höchste Index, der verwendet werden darf
                        array.length - 1

            Beachtet man dies nicht, bekommt man beim Zugriff auf das Element array[array.length] eine ArrayIndexOutOfBoundsException!
         */

        //Variante 1: array.length wird nicht erreicht, weil die Schleife nur läuft, solange i < array.length ist:
        for(int i = 0; i < preise.length; i++){
            System.out.println(preise[i]);
        }

        //Variante 2: array.length wird nicht erreicht, weil die Schleife nur bis array.length - 1 läuft:
        for(int i = 0; i <= preise.length - 1; i++){
            System.out.println(preise[i]);
        }

        //Variante 3: array.length wird erreicht und löst eine ArrayIndexOutOfBoundsExcpetion aus:
//        for(int i = 0; i <= preise.length; i++){
//            System.out.println(preise[i]);
//        }

        /*
            Da man den Index bei einer for-Schleife greifbar hat, kann man ih benutzen, um Dinge zu tun.
            Bspw. könnte man sehr einfach statt des Elements an Position 3 etwas anderes ausgeben lassen:
         */
        for(int i = 0; i <= preise.length - 1; i++){
            if(i != 2){
                System.out.println(preise[i]); //Element an der dritten Stelle im Array (0, 1, 2) ;) wird nicht ausgegeben
            }
            else{
                System.out.println("Dieser Preis ist geheim :)");
            }
        }

        /*
            Mit einer sog. forEach-Schleife kann man ohne sich Gedanken über den Index machen zu müssen
            über ein Array iterieren.

            Nachteil: man kann nicht auf den Index reagieren, weil man ihn nicht zur Verfügung hat.
         */
        for(double preis: preise){
            System.out.println(preis); //Hier braucht man keinen Index, um die Elemente ausgeben zu lassen
        }

        /*
            Über eine for-Schleife lassen sich Arrays natürlich auch befüllen:
         */
        for(int i = 0; i < ganzeZahlen.length; i++){
            ganzeZahlen[i] = i * 3;
        }

        /*
            Benötigt man ein größeres Array, dann gibt es in Java keine Möglichkeit, ein bestehendes Array zu vergrößern.
            Man muss dann ein neues Array mit der gewünschten Größe erzeugen und die Elemente aus dem ursprünglichen Array
            in das neue Array kopieren:
         */
        double[] preiseNeu = new double[10];
        for (int i = 0; i < preise.length; i++){
            preiseNeu[i] = preise[i];
        }
        //das Array preise hat 4 Elemente, das Array preiseNeu hat 10 - die bisherigen Elemente wurden übertragen
    }
}
