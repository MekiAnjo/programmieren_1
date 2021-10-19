package de.hft_stuttgart.huto1bif;

import java.util.Scanner;

/**
 * AnlageRechner
 */
public class AnlageRechner {

  private static double anlage;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Bitte Betrag eingeben: ");
    anlage = scanner.nextDouble();
    System.out.println("1. Jahr: " + zinsen(anlage, 0.5));
    System.out.println("2. Jahr: " + zinsen(anlage, 0.6));
    System.out.println("3. Jahr: " + zinsen(anlage, 0.7));
    System.out.println("4. Jahr: " + zinsen(anlage, 0.9));
    System.out.println("5. Jahr: " + zinsen(anlage, 1.3));
    System.out.println("6. Jahr: " + zinsen(anlage, 1.8));

    scanner.close();
  }

  private static double zinsen(double betrag, double zinssatz) {
    double zins = betrag * zinssatz / 100;
    anlage += zins;
    return anlage;
  }
}
