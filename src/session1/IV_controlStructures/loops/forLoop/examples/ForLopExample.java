package session1.IV_controlStructures.loops.forLoop.examples;

public class ForLopExample {
    final static int MAX_VERSUCHE = 10; //Der Spieler hat 10 Versuche, die Zahl zu erraten

    public static void main(String[] args) {
        int number = (int) (Math.random() * 100 + 1);
        System.out.println("Welche Zahl denke ich mir zwischen 1 und 100?");

        for (int versuch = 1; versuch <= MAX_VERSUCHE; versuch++) {
            System.out.println("Versuch " + versuch + " von " + MAX_VERSUCHE + ": ");

            int guess = new java.util.Scanner(System.in).nextInt();

            if (number == guess) {
                System.out.println("Super getippt!");
                System.out.println("Dafür hast du " + versuch + " Versuche benötigt!");
                break; // Ende der Schleife
            } else if (number > guess) {
                System.out.println("Nee, meine Zahl ist größer als deine!");
            } else if (number < guess) {
                System.out.println("Nee, meine Zahl ist kleiner als deine!");
            }
        }
    }
}