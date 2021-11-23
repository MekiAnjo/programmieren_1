package de.hft_stuttgart.huto1bif.aufgabe2;

public abstract class Haustier extends Tier implements Fuetterbar {

  public Haustier(String tierart, String name) {
    super(tierart, name);
  }

  @Override
  public abstract void womitFuettern();
}
