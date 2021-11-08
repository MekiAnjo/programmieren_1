package de.hft_stuttgart.huto1bif.aufgabe5_3_bubblesort;

import java.util.Arrays;

/**
 * MySort_recursive
 */
public class MySort_recursive {

  public static void main(String[] args) {
    int[] intArray = new int[] { 5, 90, 35, 150, 45, 3 };
    int[] intArray2 = new int[] { 3, 5, 35, 45, 90, 150 };
    int[] intArray3 = new int[] { 5, 3, 35, 45, 90, 150 };
    sort(intArray, intArray.length);
    System.out.println(Arrays.toString(intArray));
    System.out.println();
    sort(intArray2, intArray2.length);
    System.out.println(Arrays.toString(intArray2));
    System.out.println();
    sort(intArray3, intArray3.length);
    System.out.println(Arrays.toString(intArray3));
    System.out.println();
  }

  private static void sort(int[] intArray, int n) {
    if (n == 1) return;

    for (int i = 0; i < n - 1; i++) {
      if (intArray[i] > intArray[i + 1]) {
        int temp = intArray[i];
        intArray[i] = intArray[i + 1];
        intArray[i + 1] = temp;
      }
    }
    sort(intArray, n - 1);
  }
}
