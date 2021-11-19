package de.hft_stuttgart.huto1bif.a1x_tiereMitInterface;

public class Hund extends Tier implements Haustier, Fuetterbar {

  private int marke = 0;

  public Hund(String name) {
    super(name);
  }

  @Override
  public void setMarke(int marke) {
    this.marke = marke;
  }

  @Override
  public String toString() {
    return "Hund [name=" + name + ", marke=" + marke + "]";
  }

  @Override
  public void womitFuettern() {
    System.out.println(name + ": Ich als Hund darf nur Wurst essen.");
  }
}
