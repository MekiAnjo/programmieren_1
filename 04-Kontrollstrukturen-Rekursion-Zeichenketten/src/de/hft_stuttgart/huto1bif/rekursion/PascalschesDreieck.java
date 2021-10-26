package de.hft_stuttgart.huto1bif.rekursion;

import java.util.Scanner;

public class PascalschesDreieck {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(
      "Bis zu welcher Zeile soll das Pascalsche Dreieck ausgegeben werden?"
    );
    System.out.print("n = ");
    int n = scanner.nextInt();
    System.out.println();

    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i ; j++) {
        System.out.print(binKoeff(i, j) + " ");
      }
      System.out.println();
    }
    scanner.close();
  }

  private static int binKoeff(int n, int k) {
    return (k == 0)
      ? 1
      : (k == n) ? 1 : binKoeff(n - 1, k - 1) + binKoeff(n - 1, k);
  }
}
