package session1.IV_controlStructures.switchCase.examples;

/**
 * Ein einfacher Taschenrechner für vier binäre Operatoren ist mit switch schnell implementiert
 * (und wir nutzen die Methode charAt(0), mit der wir von der String-Eingabe auf das erste
 * Zeichen zugreifen, um ein char zu bekommen)
 */
public class SwitchCaseExample {
    public static void main(String[] args) {

        System.out.print("Bitte gib eine (Fließkomma-)Zahl ein: ");
        double x = new java.util.Scanner(System.in).nextDouble();
        System.out.print("Bitte gib einen Operator (+, -, *, /) ein: ");
        char operator = new java.util.Scanner(System.in).nextLine().charAt(0);
        System.out.print("Bitte gib noche eine zweite (Fließkomma-)Zahl ein: ");
        double y = new java.util.Scanner(System.in).nextDouble();

        switch (operator) {
            case '+':
                System.out.println(x + y);
                break;
            case '-':
                System.out.println(x - y);
                break;
            case '*':
                System.out.println(x * y);
                break;
            case '/':
                System.out.println(x / y);
                break;
        }
    }
}
