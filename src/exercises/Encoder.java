package exercises;

import java.util.Scanner;

public class Encoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Eingabe vom Benutzer
        System.out.print("Gib den zu verschlüsselnden Text ein: ");
        String input = scanner.nextLine();

        System.out.print("Gib den Schlüssel (Zahl) ein: ");
        int key = scanner.nextInt();
        scanner.nextLine(); // Puffer leeren

        // Caesar-Verschlüsselung mit Verschiebung
        StringBuilder shiftedMessage = new StringBuilder();
        for (char c : input.toCharArray()) {
            shiftedMessage.append((char) (c + key)); // Zeichen um Schlüssel verschieben
        }

        // Umkehren des Strings
        String encryptedMessage = shiftedMessage.reverse().toString();

        // Ausgabe der verschlüsselten Nachricht
        System.out.println("Verschlüsselte Nachricht: " + encryptedMessage);

        scanner.close();
    }
}
