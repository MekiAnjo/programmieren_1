package de.hft_stuttgart.huto1bif.aufgabe5_1;

public class Laptop {

  private String modell;
  private String benutzer;
  private int id;
  private static int gesamtAnzahl = 0;

  Laptop(String modell, String benutzer) {
    this.modell = modell;
    this.benutzer = benutzer;
    gesamtAnzahl++;
    id = gesamtAnzahl;
  }

  public String getModell() {
    return modell;
  }

  public String getBenutzer() {
    return benutzer;
  }

  public int getId() {
    return id;
  }

  public static int getGesamtAnzahl() {
    return gesamtAnzahl;
  }

  public void setModell(String modell) {
    this.modell = modell;
  }

  public void setBenutzer(String benutzer) {
    this.benutzer = benutzer;
  }
}
