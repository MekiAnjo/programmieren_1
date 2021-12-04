package de.hft_stuttgart.huto1bif.a1_tiere;

public abstract class Haustier extends Tier implements Fuetterbar {

  protected Haustier(String tierart, String name) {
    super(tierart, name);
  }

  @Override
  public abstract void womitFuettern();
}
