package session2.arrays.examples;

import java.util.Random;

/**
 *  Erstelle ein Array und fülle es mit beliebigen Werten.
 *  Berechne dann den Durchschnittswert aller Elemente und lass ihn auf der Konsole ausgeben.
 */
public class ArrayExampleAverage {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        //Durchschnitt berechnen:
        double sum = 0; // sum muss double sein, sonst funktioniert die Berechnung des Durchschnitts nicht korrekt :)
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = sum / array.length;

        //Ausgabe:
        String delimiter = "";
        for (int i = 0; i < array.length; i++) {
            System.out.print(delimiter + array[i] + " ");
            delimiter = ", ";
        }

        System.out.println("\nDer Durchschnittswert in diesem Array ist: " + average);
    }
}
