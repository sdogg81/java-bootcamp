package session1.IV_controlStructures.switchCase;

import java.util.Scanner;

/**
 * Die JVM kann switch nur auf Ausdrücken vom Datentyp int ausführen.
 * Elemente der Datentypen byte, char und short sind somit erlaubt, da der Compiler den Typ
 * automatisch an int anpasst. Ebenso sind die Aufzählungen und die Wrapper-Objekte Character, Byte,
 * Short, Integer möglich, da Java automatisch die Werte entnimmt.
 * <p>
 * Die Datentypen boolean, long, float und double können nicht benutzt werden.
 * <p>
 * Zwar sind auch Aufzählungen und Strings als switch - Ausdruckstypen möglich, doch intern werden sie
 * auf Ganzzahlen abgebildet. Allgemeine Objekte sind sonst nicht erlaubt.
 * <p>
 * Es sind keine Bereichsangaben möglich.
 */
public class SwitchCase {
    public static void main(String[] args) {

        char inputChar;
        String inputString;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Gib einen Operator an (+, -, *, /): ");
        inputChar = scanner.next().charAt(0);
        inputString = scanner.nextLine();

        switch (inputChar) { // Der Character wird in seinen ASCII-Wert umgewandelt, daher kann er mit switch benutzt werden
            case '+':
                System.out.println("Der Plus-Operator addiert zwei Werte miteinander.");
                break;  // wird am Ende einer case-Anweisung kein break gesetzt, macht der Compiler einfach mit der
                        // nächsten case-Anweisung weiter, was manchmal sinnvoll ist, aber auch zu unerwünschtem
                        // Verhalten führen kann, wenn man nicht aufpasst...
            case '-':
                System.out.println("Der Minus-Operator subtrahiert zwei Werte voneinander.");
                break;
            case '*':
                System.out.println("Der Mal-Operator multipliziert zwei Werte miteinander.");
                break;
            case '/':
                System.out.println("Der Teilen-Operator dividiert einen Wert durch einen anderen.");
        }

        /*
            Soll ein Programmteil in genau dem Fall abgearbeitet werden, in dem es keine Übereinstimmung
            mit irgendeiner case -Konstanten gibt, so lässt sich die besondere Sprungmarke default einsetzen.
         */
        switch (inputChar) { // Der Character wird in seinen ASCII-Wert (eine Ganzzahl) umgewandelt, daher kann er mit switch benutzt werden
            case '+':
                System.out.println("Der Plus-Operator addiert zwei Werte miteinander.");
                break;
            case '-':
                System.out.println("Der Minus-Operator subtrahiert zwei Werte voneinander.");
                break;
            case '*':
                System.out.println("Der Mal-Operator multipliziert zwei Werte miteinander.");
                break;
            case '/':
                System.out.println("Der Teilen-Operator dividiert einen Wert durch einen anderen.");
                break;
            default:
                System.out.println("Der eingegebene Operator ist kein gültiger Wert.");
        }

        /*
            Neben der Möglichkeit, ein switch bei Ganzzahlen zu verwenden, ist eine switch -Anweisung auch
            auf String -Objekten möglich:
         */

        System.out.print("Bitte gib dein Lieblingsessen ein: ");
        inputString = scanner.nextLine();

        switch (inputString.toLowerCase()) {
            case "kekse":
                System.out.println("Ich mag Keeeekse");
                break;
            case "kuchen":
                System.out.println("Ich mag Kuchen");
                break;
            case "schokolade":  // Fällt durch => das machen wir hier jetzt mal absichtlich
                                // => wir finden halt Schokolade und Lakritze lecker :)
            case "lakritze":
                System.out.println("Hm. Lecker");
                break;
            default:
                System.out.printf("Kann man \"%s\" essen?%n", inputString);
        }
    }
}
