package de.hft_stuttgart.huto1bif.myShop;

/**
 * Auftrag
 */
public class Auftrag {

  private static final double MwSt = 0.19;
  private int last_position;
  private int nummer;
  private String bestelldatum;
  private String rechnungsdatum;
  private double gesamtbetrag;
  private Kunde kunde;
  private Position[] positionen;

  public Auftrag(
    Kunde kunde,
    int nummer,
    String bestelldatum,
    String rechnungsdatum,
    int numOfPositionen
  ) {
    this.kunde = kunde;
    this.nummer = nummer;
    this.bestelldatum = bestelldatum;
    this.rechnungsdatum = rechnungsdatum;
    this.positionen = new Position[numOfPositionen];
  }

  public void positionHinzufuegen(Position pos) {
    positionen[last_position] = pos;
    last_position++;
    gesamtbetrag += pos.getGesamtpreis();
  }

  public void drucken() {}

  public Kunde getKunde() {
    return this.kunde;
  }

  public Position[] getPosition() {
    return positionen;
  }

  public int getNummer() {
    return this.nummer;
  }

  public String getBestelldatum() {
    return this.bestelldatum;
  }

  public String getRechnungsdatum() {
    return this.rechnungsdatum;
  }

  public double getGesamtbetrag() {
    return this.gesamtbetrag;
  }

  public double getEnthalteneMwSt() {
    return (gesamtbetrag / 100 + MwSt) * MwSt * 100;
  }
}
