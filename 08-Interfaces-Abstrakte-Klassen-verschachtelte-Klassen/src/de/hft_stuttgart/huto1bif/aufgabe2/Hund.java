package de.hft_stuttgart.huto1bif.aufgabe2;

public class Hund extends Haustier {

  public Hund(String name) {
    super("Hund", name);
  }

  @Override
  public void womitFuettern() {
    System.out.println(getName() + ": Ich als Hund darf nur Wurst essen.");
  }
}
