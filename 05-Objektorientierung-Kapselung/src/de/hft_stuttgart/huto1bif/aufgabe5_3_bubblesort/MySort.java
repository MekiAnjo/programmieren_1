package de.hft_stuttgart.huto1bif.aufgabe5_3_bubblesort;

import java.util.Arrays;

public class MySort {

  public static void main(String[] args) {
    int[] intArray = new int[] { 5, 90, 35, 150, 45, 3 };
    int[] intArray2 = new int[] { 3, 5, 35, 45, 90, 150 };
    sort(intArray);
    System.out.println(Arrays.toString(intArray));
    System.out.println();
    sort(intArray2);
    System.out.println(Arrays.toString(intArray2));
    System.out.println();
  }

  private static void sort(int[] intArray) {
    // … sortieren und dann auf der Konsole ausgeben
    int outerCycle = 0;
    boolean isShift = false;
    int shiftCount = 0;
    do {
      int innerCycle = 0;
      do {
        int currentElement = intArray[innerCycle];
        int nextElement = intArray[innerCycle + 1];

        if (currentElement > nextElement) {
          intArray[innerCycle] = nextElement;
          intArray[innerCycle + 1] = currentElement;
          isShift = true;
          shiftCount++;
          innerCycle++;

          continue;
        }
        innerCycle++;
        isShift = false;
      } while (innerCycle - 1 < intArray.length - 2);
      outerCycle++;
    } while (!isShift && outerCycle < intArray.length - 1);
    if (shiftCount == 0) {
      System.out.println("Sortierung unnötig!");
      return;
    }
    System.out.println("Es wurde " + shiftCount + "-mal geshiftet");
  }
}
