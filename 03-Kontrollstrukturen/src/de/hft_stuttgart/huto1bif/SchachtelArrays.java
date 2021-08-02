package de.hft_stuttgart.huto1bif;

public class SchachtelArrays {

  public static void main(String[] args) {
    // 1. Version der Deklaration & Initialisierung auf feste Werte zur Compile-Zeit
    int[][] mymatrixA = { { 10, 11, 12 }, { 20, 21, 22 }, { 30, 31, 33 } };

    // 2. Version der Deklaration und Zeilenweise initialisieren zur Laufzeit
    int[][] mymatrixB = new int[3][3];
    mymatrixB[0] = new int[] { 10, 11, 12 };
    mymatrixB[1] = new int[] { 20, 21, 22 };
    mymatrixB[2] = new int[] { 30, 31, 32 };

    // 3. Version der Deklaration und elementweise initialisieren zur Laufzeit
    int[][] mymatrixC = new int[3][3];
    mymatrixC[0][0] = 10;
    mymatrixC[0][1] = 11;
    mymatrixC[0][2] = 12;
    mymatrixC[1][0] = 20;
    mymatrixC[1][1] = 21;
    mymatrixC[1][2] = 22;
    mymatrixC[2][0] = 30;
    mymatrixC[2][1] = 31;
    mymatrixC[2][2] = 32;

    // 4. Version der Deklaration und programmatischen Initialisierung:
    int[][] mymatrixD = new int[3][3];
    for (int i = 0; i < mymatrixD.length; i++) {
      for (int j = 0; j < mymatrixD[i].length; j++) mymatrixD[i][j] =
        10 * i + j;
    }

    int i = 0, j = 0;
    while (i < mymatrixA.length) {
      j = 0;
      // System.out.print("Zeile " + i + ": ");
      while (j < mymatrixA[i].length) {
        // Man beachte den Unterschied print vs. println (fuer line)
        System.out.print(mymatrixA[i][j] + "   ");
        j++;
      }
      System.out.println();
      i++;
    }
  }
}
