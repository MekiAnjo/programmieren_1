package de.hft_stuttgart.huto1bif;

import java.util.Scanner;

public class Euklid {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(
      "Bitte geben Sie an, für welche Zahlen der ggT berechnet werden soll "
    );

    int a = scanner.nextInt();
    int b = scanner.nextInt();

    scanner.close();

    System.out.println("Der ggT von " + a + " und " + b + " ist " + ggT(a, b));
  }

  public static int ggT(int a, int b) {
    int ergebnis = 0;
    int anzahlRunden = 0;

    if (a == 0) {
      ergebnis = b;
      System.out.println("In einem Schritt wurde " + b + " ermittelt.");
    } else {
      while (b != 0) {
        if (a > b) {
          a = a - b;
        } else {
          b = b - a;
        }
        anzahlRunden++;
      }
      ergebnis = a;
      System.out.println(
        "In " + anzahlRunden + " Schritten wurde " + a + " ermittelt."
      );
    }
    return ergebnis;
  }
}
