package de.hft_stuttgart.huto1bif.a1_tiere;

public class Hund extends Haustier {

  public Hund(String name) {
    super("Hund", name);
  }

  @Override
  public void womitFuettern() {
    System.out.println(getName() + ": Ich als Hund darf nur Wurst essen.");
  }
}
