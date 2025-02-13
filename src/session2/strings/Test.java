package session2.strings;

public class Test {
    public static void main(String[] args) {
        String test = "Hello Wörld123;";

        String suchtext = "Hello";

        if (test.contains(suchtext)) {
            System.out.println("Der String enthält die Zeichenkette " + suchtext);
        }
    }
}
