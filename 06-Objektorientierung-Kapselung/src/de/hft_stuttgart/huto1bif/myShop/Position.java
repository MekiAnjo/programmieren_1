package de.hft_stuttgart.huto1bif.myShop;

public class Position {

  private int anzahl;
  private double gesamtpreis;
  private String printFormat;

  public Position(Artikel artikel, int index) {
    this.anzahl = anzahl;
    this.gesamtpreis = gesamtpreis;
    this.printFormat = printFormat;
  }

  public int getAnzahl() {
    return this.anzahl;
  }

  public double getGesamtpreis() {
    return this.gesamtpreis;
  }

  public void setPrintFormat(String printFormat) {
    this.printFormat = printFormat;
  }

  @Override
  public String toString() {
    return (
      "Position [anzahl=" +
      anzahl +
      ", gesamtpreis=" +
      gesamtpreis +
      ", printFormat=" +
      printFormat +
      "]"
    );
  }
}
