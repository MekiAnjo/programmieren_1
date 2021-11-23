package de.hft_stuttgart.huto1bif.aufgabe2;

public abstract class Tier {

  private static int anzahlTiere = 0;

  private int marke;
  private String name;
  private String tierart;

  public Tier(String tierart, String name) {
    anzahlTiere++;
    this.marke = anzahlTiere;

    this.tierart = tierart;
    this.name = name;
  }

  @Override
  public String toString() {
    return tierart + " [name=" + name + ", marke=" + marke + "]";
  }

  public int getMarke() {
    return marke;
  }

  public void setMarke(int marke) {
    this.marke = marke;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTierart() {
    return tierart;
  }

  public void setTierart(String tierart) {
    this.tierart = tierart;
  }
}
