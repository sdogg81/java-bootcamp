package session2.arrays.examples;

import java.util.Random;

/**
 *  Befülle ein Array mit zufälligen Werten und finde das Maximum darin.
 *  Gib das Maximum auf der Konsole aus.
 */
public class ArrayExampleMaximum {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        int max = 0;

        //Befüllen
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(1000);
        }

        //Maximum suchen
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }

        //Ausgabe:
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println("Der größte Wert in dem Array ist: " + max);
    }
}
