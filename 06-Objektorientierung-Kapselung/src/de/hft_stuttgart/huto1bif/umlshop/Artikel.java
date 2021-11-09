package de.hft_stuttgart.huto1bif.umlshop;

public class Artikel implements MyRandom {

  private String bezeichnung;
  private int nummer;
  private double preis;

  public Artikel(String bezeichnung, double preis) {
    this.bezeichnung = bezeichnung;
    this.nummer = randomNumber();
    this.preis = preis;
  }

  public String getBezeichnung() {
    return bezeichnung;
  }

  public void setBezeichnung(String bezeichnung) {
    this.bezeichnung = bezeichnung;
  }

  public int getNummer() {
    return nummer;
  }

  public double getPreis() {
    return preis;
  }

  public void setPreis(double preis) {
    this.preis = preis;
  }
}
