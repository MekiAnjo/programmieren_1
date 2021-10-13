package de.hft_stuttgart.huto1bif.rekursion;

public class BinomialkoeffizentIterativ {

  public static void main(String[] args) {
    int n = 5;
    int k = 3;

    int zaehler = fakultaet(n);
    int nenner = fakultaet(k) * fakultaet(n - k);
    System.out.println(n + " �ber " + k + " = " + zaehler / nenner);
  }

  private static int fakultaet(int n) {
    int ergebnis = 1;
    for (int i = 1; i <= n; i++) {
      ergebnis *= i;
    }
    return ergebnis;
  }
}
