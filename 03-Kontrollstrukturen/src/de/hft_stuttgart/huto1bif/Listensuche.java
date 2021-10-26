package de.hft_stuttgart.huto1bif;

import java.util.Scanner;

/**
 * Listensuche
 */
public class Listensuche {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Bitte geben Sie eine Zahl in Buchstaben an: ");
    String eingabe = scanner.next();

    int ausgabe =
      switch (eingabe) {
        case "null" -> 0;
        case "eins" -> 1;
        case "zwei" -> 2;
        case "drei" -> 3;
        case "vier" -> 4;
        case "fünf" -> 5;
        case "sechs" -> 6;
        case "sieben" -> 7;
        case "acht" -> 8;
        case "neun" -> 9;
        case "zehn" -> 10;
        default -> -1;
      };

    System.out.println("Ausgabe: " + ausgabe);

    scanner.close();
  }
}
