package session1.IV_controlStructures.loops.whileLoops.examples;

public class WhileLoopExampleNested {
    public static void main(String[] args) {
        int size = 5;

        System.out.println("Ein einfaches Muster mit verschachtelten while-Schleifen:");

        // Zähler für die äußere Schleife
        int i = 1;

        while (i <= size) { // Äußere Schleife steuert die Zeilen
            // Zähler für die innere Schleife
            int j = 1;

            while (j <= i) { // Innere Schleife steuert die Spalten
                System.out.print("* "); // Gibt ein Sternchen aus
                j++; // Erhöht den Zähler der inneren Schleife
            }

            System.out.println(); // Neue Zeile nach der inneren Schleife
            i++; // Erhöht den Zähler der äußeren Schleife
        }
    }
}
