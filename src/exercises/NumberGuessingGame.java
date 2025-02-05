package exercises;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int targetNumber = random.nextInt(991) + 10; // Zufallszahl zwischen 10 und 1000
        int attempts = 10;

        System.out.println("Willkommen zum Zahlenratespiel! Versuche die Zahl zwischen 10 und 1000 zu erraten.");

        for (int i = 1; i <= attempts; i++) {
            System.out.print("Versuch " + i + ": Deine Eingabe: ");
            int guess = scanner.nextInt();

            if (guess == targetNumber) {
                System.out.println("Glückwunsch! Du hast die Zahl erraten in " + i + " Versuchen.");
                return;
            } else if (guess < targetNumber) {
                System.out.println("Zu niedrig! Versuche es erneut.");
            } else {
                System.out.println("Zu hoch! Versuche es erneut.");
            }
        }

        System.out.println("Leider hast du die Zahl nicht erraten. Die richtige Zahl war: " + targetNumber);
    }
}