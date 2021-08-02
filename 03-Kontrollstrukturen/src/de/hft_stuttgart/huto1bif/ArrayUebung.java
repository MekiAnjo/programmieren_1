package de.hft_stuttgart.huto1bif;

/**
 * ArrayUebung
 */
public class ArrayUebung {

  public static void main(String[] args) {
    int[] myArray = new int[15];

    int i = 0;
    while (i < 15) {
      myArray[i] = i;
      i++; // Schleifeninkrement nicht vergessen
    }

    i = 0; // Re-Initialisierung der Schleifenvariablen nicht vergessen
    while (i < myArray.length) { // Noch besser, statt fester Werte (15)
      System.out.println(
        "Aktueller Wert: " +
        myArray[i] +
        ", Rest beim Teilen durch 2: " +
        myArray[i] %
        2
      );

      i++;
    }
  }
}
