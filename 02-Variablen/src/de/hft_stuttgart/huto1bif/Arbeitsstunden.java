package de.hft_stuttgart.huto1bif;

import java.util.Scanner;

public class Arbeitsstunden {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Meine Arbeitszeit in Minuten beträgt ");
    int minuten = scanner.nextInt();
    scanner.close();

    System.out.println(
      minuten +
      " min Arbeit entspricht " +
      berechneArbeitsstunden(minuten) +
      "h."
    );
  }

  public static double berechneArbeitsstunden(int minuten) {
    return minuten / 60.0;
    // Ein Ergebnis auf 2 Nachkommastellen gerundet erhalten wir mit folgender
    // Rückgabe:
    // return Math.round((minuten/60.0)*100)/100.0;
  }
}
