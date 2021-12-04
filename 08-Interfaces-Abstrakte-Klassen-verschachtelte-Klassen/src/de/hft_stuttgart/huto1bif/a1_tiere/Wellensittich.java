package de.hft_stuttgart.huto1bif.a1_tiere;

public class Wellensittich extends Haustier {

  public Wellensittich(String name) {
    super("Wellensittich", name);
  }

  @Override
  public void womitFuettern() {
    System.out.println(
      getName() + ": Ich als Wellensittich darf nur Körner essen."
    );
  }
}
