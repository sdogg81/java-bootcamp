package session1.IV_controlStructures.loops.forLoop.examples;

public class ForLoopExampleNested {
    public static void main(String[] args) {
        int size = 5;

        System.out.println("Ein einfaches Muster mit verschachtelten for-Schleifen:");

        // Äußere Schleife steuert die Zeilen
        for (int i = 1; i <= size; i++) {
            // Innere Schleife steuert die Spalten
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); // Gibt ein Sternchen aus
            }
            // Nach jeder Zeile eine neue Zeile beginnen
            System.out.println();
        }
    }
}
