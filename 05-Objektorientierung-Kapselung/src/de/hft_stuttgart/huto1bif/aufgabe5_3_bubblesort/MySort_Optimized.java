package de.hft_stuttgart.huto1bif.aufgabe5_3_bubblesort;

import java.util.Arrays;

public class MySort_Optimized {

  public static void main(String[] args) {
    int[] intArray = new int[] { 5, 90, 35, 150, 45, 3 };
    int[] intArray2 = new int[] { 3, 5, 35, 45, 90, 150 };
    int[] intArray3 = new int[] { 5, 3, 35, 45, 90, 150 };
    sort(intArray);
    System.out.println(Arrays.toString(intArray));
    System.out.println();
    sort(intArray2);
    System.out.println(Arrays.toString(intArray2));
    System.out.println();
    sort(intArray3);
    System.out.println(Arrays.toString(intArray3));
    System.out.println();
  }

  private static void sort(int[] intArray) {
    // … sortieren und dann auf der Konsole ausgeben
    int cycles = 0;
    int shiftCount = 0;
    for (int i = 0; i < intArray.length - 1; i++) {
      boolean isSwapped = false;
      for (int j = 0; j < intArray.length - 1 - i; j++) {
        int currentElement = intArray[j];
        int nextElement = intArray[j + 1];

        if (currentElement > nextElement) {
          intArray[j] = nextElement;
          intArray[j + 1] = currentElement;
          isSwapped = true;
          shiftCount++;
        }
      }
      cycles++;
      if (!isSwapped) break;
    }
    if (shiftCount == 0) {
      System.out.println("Sortierung unnötig!");
      return;
    }
    System.out.println(
      "Es wurde " +
      shiftCount +
      "-mal getauscht\nund es waren " +
      cycles +
      " Durchgänge"
    );
  }
}
