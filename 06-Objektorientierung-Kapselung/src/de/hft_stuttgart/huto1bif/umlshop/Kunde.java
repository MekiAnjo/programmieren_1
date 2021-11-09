package de.hft_stuttgart.huto1bif.umlshop;

public class Kunde implements MyRandom {

  private int kundennummer;
  private Rechnung rechnung;

  public Kunde(Rechnung rechnung) {
    this.kundennummer = randomNumber();
    this.rechnung = rechnung;
  }

  public int getKundennummer() {
    return kundennummer;
  }

  public Rechnung getRechnung() {
    return rechnung;
  }

  public void setRechnung(Rechnung rechnung) {
    this.rechnung = rechnung;
  }
}
