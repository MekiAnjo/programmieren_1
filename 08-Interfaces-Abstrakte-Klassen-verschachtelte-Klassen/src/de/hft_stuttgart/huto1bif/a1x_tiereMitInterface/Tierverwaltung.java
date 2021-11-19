package de.hft_stuttgart.huto1bif.a1x_tiereMitInterface;

public class Tierverwaltung {

  public static void main(String[] args) {
    int ldfNr = 1;
    Tier meineTiere[] = new Tier[] {
      new Hund("Bello"),
      new Hund("Hasso"),
      new Pinguin("Schnappi"),
      new Wellensittich("Fifi"),
    };

    for (Tier tier : meineTiere) {
      if (tier instanceof Haustier haustier) {
        haustier.setMarke(ldfNr++);
      }
      System.out.println(tier);
      if (tier instanceof Fuetterbar haustier) {
        haustier.womitFuettern();
      }
    }
  }
}
