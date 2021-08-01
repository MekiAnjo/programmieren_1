package de.hft_stuttgart.huto1bif;
import java.util.Scanner;

public class Pizzarezept {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(
      "Bitte geben Sie an, wie viele Pizzen gebacken werden sollen: "
    );
    int anzahlPizzen = scanner.nextInt();

    String[] produktBezeichnung = new String[5];
    produktBezeichnung[0] = "Mehl";
    produktBezeichnung[1] = "Salz";
    produktBezeichnung[2] = "Öl";
    produktBezeichnung[3] = "Zucker";
    produktBezeichnung[4] = "Hefe";

    double[] produktMenge = new double[5];
    produktMenge[0] = 500;
    produktMenge[1] = 1;
    produktMenge[2] = 2;
    produktMenge[3] = 0.25;
    produktMenge[4] = 1;

    System.out.println(
      "|------ REZEPT für " + anzahlPizzen + " Pizzen -------|"
    );
    for (int i = 0; i < produktBezeichnung.length; i++) {
      System.out.printf("| %-20s ", produktBezeichnung[i]);

      String str = "%5.0f %-6s|";
      switch (i) {
        case 0 -> System.out.printf(str, (produktMenge[i] * anzahlPizzen), "g");
        case 1 -> System.out.printf(
          str,
          (produktMenge[i] * anzahlPizzen),
          "TL"
        );
        case 2 -> System.out.printf(
          str,
          (produktMenge[i] * anzahlPizzen),
          "EL"
        );
        case 3 -> System.out.printf(
          "%5.2f %-6s|",
          (produktMenge[i] * anzahlPizzen),
          "EL"
        );
        case 4 -> System.out.printf(
          str,
          (produktMenge[i] * anzahlPizzen),
          "Würfel"
        );
        default -> System.err.println("Something went wrong");
      }
      System.out.println();
    }
    System.out.println("|----------------------------------|");

    scanner.close();
  }
}
