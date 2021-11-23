package de.hft_stuttgart.huto1bif.aufgabe2;

public class Tierverwaltung {

  public static void main(String[] args) {
    Tier meineTiere[] = new Tier[] {
      new Hund("Bello"),
      new Hund("Hasso"),
      new Pinguin("Schnappi"),
      new Wellensittich("Fifi"),
    };

    for (Tier tier : meineTiere) {
      System.out.println(tier);
    }

    System.out.println(); // Leerzeile

    for (Tier tier : meineTiere) {
      if (tier instanceof Haustier) {
        ((Haustier) tier).womitFuettern();
      }
    }
  }
}
