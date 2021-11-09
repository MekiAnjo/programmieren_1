package de.hft_stuttgart.huto1bif.myShop;

public class Artikel {

  private int nummer;
  private String bezeichnung;
  private double preis;

  public Artikel(int nummer, String bezeichnung, double preis) {
    this.nummer = nummer;
    this.bezeichnung = bezeichnung;
    this.preis = preis;
  }

  public int getNummer() {
    return this.nummer;
  }

  public String getBezeichnung() {
    return this.bezeichnung;
  }

  public double getPreis() {
    return this.preis;
  }
}
