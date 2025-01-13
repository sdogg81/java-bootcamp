package session2.strings.examples;

import java.util.Scanner;

/**
 *  Prüft, ob ein eingegebenes Wort ein Palindrom ist, das sich von hinten und von vorn lesen lässt.
 *  Beispiel für Palindrome sind "Anna", "Lagerregal", "Reliefpfeiler" oder auch "Die Liebe ist Sieger; stets rege ist sie bei Leid."
 */
public class StringExamplePalindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isPalindrom = true;

        System.out.print("Gib ein Wort oder einen Satz ein: ");
        String s = sc.nextLine().toLowerCase();

        //Alle Leer- und Sonderzeichen entfernen:
        s = s.replaceAll("[^a-zA-Z]+", "");

        for (int i = 0; i < s.length() / 2; i++) {
            char first = s.charAt(i);
            char second = s.charAt(s.length() - (i + 1));

            if (first != second) {
                isPalindrom = false;
            }
        }

        if (isPalindrom) {
            System.out.println("Dein Wort/Satz ist ein Palindrom.");
        }
        else {
            System.out.println("Dein Wort/Satz ist kein Palindrom.");
        }
    }
}
