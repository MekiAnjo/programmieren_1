public class Matrixen {

  public static void main(String[] args) {
    int[][] matrixA = {
      { 1, 2, 3, 4, 5 },
      { 0, 0, 0, 0, 0 },
      { 1, 1, 1, 1, 1 },
      { 5, 5, 1, 6, 6 },
    };
    int[][] matrixB = {
      { 3, 4, 1, 4, 1 },
      { 1, 5, 4, 6, 5 },
      { 4, 1, 4, 1, 2 },
      { 1, 1, 0, 1, 3 },
    };
    int[][] matrixC = new int[4][5];

    for (int z = 0; z < matrixA.length; z++) {
      for (int s = 0; s < matrixA[z].length; s++) {
        matrixC[z][s] = matrixA[z][s] + matrixB[z][s];
      }
    }

    matrixAusgeben(matrixC);
  }

  static void matrixAusgeben(int[][] matrix) {
    for (int[] zeilen : matrix) {
      for (int spalten : zeilen) {
        System.out.print(spalten + " ");
      }
      System.out.println();
    }
  }
}
