package de.hft_stuttgart.huto1bif.myShop;

public class Kunde {

  private int nummer;
  private String name;
  private Adresse adresse;

  public Kunde(int nummer, String name, Adresse adresse) {
    this.nummer = nummer;
    this.name = name;
    this.adresse = adresse;
  }

  public int getNummer() {
    return this.nummer;
  }

  public String getName() {
    return this.name;
  }

  public Adresse getAdresse() {
    return this.adresse;
  }
}
