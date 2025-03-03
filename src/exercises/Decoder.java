package exercises;

import java.util.Scanner;

public class Decoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Eingabe der verschlüsselten Nachricht
        System.out.print("Gib die verschlüsselte Nachricht ein: ");
        String encryptedInput = scanner.nextLine();

        System.out.print("Gib den Schlüssel (Zahl) ein: ");
        int key = scanner.nextInt();
        scanner.nextLine(); // Puffer leeren

        // Umkehren der Zeichenfolge
        String reversedMessage = new StringBuilder(encryptedInput).reverse().toString();

        // Caesar-Entschlüsselung
        StringBuilder originalMessage = new StringBuilder();
        for (char c : reversedMessage.toCharArray()) {
            originalMessage.append((char) (c - key)); // Zeichen zurückverschieben
        }

        // Ausgabe der entschlüsselten Nachricht
        System.out.println("Entschlüsselte Nachricht: " + originalMessage.toString());

        scanner.close();
    }
}
