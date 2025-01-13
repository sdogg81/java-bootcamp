package session2.arrays.examples;

import java.util.Random;

/**
 *  Befülle ein Array mit beliebigen Werten und lass es auf der Konsole ausgeben.
 *  Kehre dann die Reihenfolge der Elemente in dem Array um.
 *  Lass auch das umgekehrte Array auf der Konsole ausgeben.
 */
public class ArrayExampleReverse {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        String delimiter = "";

        //befüllen
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        //Ausgabe in "normaler" Reihenfolge:
        for (int i = 0; i < array.length; i++) {
            System.out.print(delimiter + array[i]);
            delimiter = ", ";
        }

        //Elemente umdrehen:
        for (int i = 0; i < array.length / 2; i++) {
            //Nach der Hälfte der Elemente muss die Schleife abgebrochen werden
            int first = array[i];
            int last = array[array.length - (i + 1)];

            array[i] = last;
            array[array.length - (i + 1)] = first;
        }

        delimiter = "";
        System.out.println(); //Leerzeile einfügen

        //Ausgabe des umgedrehten Arrays:
        for (int i = 0; i < array.length; i++) {
            System.out.print(delimiter + array[i]);
            delimiter = ", ";
        }

        System.out.println();
    }
}
