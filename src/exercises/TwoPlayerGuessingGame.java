package exercises;

import java.util.Random;
import java.util.Scanner;

public class TwoPlayerGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int targetNumber = random.nextInt(991) + 10; // Zufallszahl zwischen 10 und 1000
        int attempts = 10;

        System.out.println("Willkommen zum Zahlenratespiel für 2 Spieler! Versucht die Zahl zwischen 10 und 1000 zu erraten.");

        for (int i = 1; i <= attempts; i++) {
            int player = (i % 2 == 1) ? 1 : 2;
            System.out.print("Spieler " + player + ", dein Versuch: ");
            int guess = scanner.nextInt();

            if (guess == targetNumber) {
                System.out.println("Glückwunsch, Spieler " + player + "! Du hast die Zahl erraten in " + i + " Versuchen.");
                return;
            } else if (guess < targetNumber) {
                System.out.println("Zu niedrig! Spieler " + player + ", versuche es erneut.");
            } else {
                System.out.println("Zu hoch! Spieler " + player + ", versuche es erneut.");
            }
        }

        System.out.println("Keiner hat die Zahl erraten. Die richtige Zahl war: " + targetNumber);
    }
}