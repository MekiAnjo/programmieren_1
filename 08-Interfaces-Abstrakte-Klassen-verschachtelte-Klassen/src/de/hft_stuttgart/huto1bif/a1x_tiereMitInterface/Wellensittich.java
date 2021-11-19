package de.hft_stuttgart.huto1bif.a1x_tiereMitInterface;

public class Wellensittich extends Vogel implements Haustier, Fuetterbar {

  private int marke = 0;

  public Wellensittich(String name) {
    super(name);
  }

  @Override
  public String toString() {
    return "Wellensittich [name=" + name + ", marke=" + marke + "] ";
  }

  @Override
  public void setMarke(int marke) {
    this.marke = marke;
  }

  @Override
  public void womitFuettern() {
    System.out.println(name + ": Ich als Wellensittich darf nur Körner essen.");
  }
}
