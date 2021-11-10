package de.hft_stuttgart.huto1bif.myShop;

/**
 * Auftrag
 */
public class Auftrag {

  private static final double MwSt = 0.19;
  private Kunde kunde;
  private Position[] positionen;
  private int last_position;
  private int nummer;
  private String bestelldatum;
  private String rechnungsdatum;
  private double gesamtbetrag;

  public Auftrag(
    Kunde kunde,
    int nummer,
    String bestelldatum,
    String rechnungsdatum,
    int numOfPositions
  ) {
    this.kunde = kunde;
    this.positionen = new Position[numOfPositions];
    this.last_position = 0;
    this.nummer = nummer;
    this.bestelldatum = bestelldatum;
    this.rechnungsdatum = rechnungsdatum;
    this.gesamtbetrag = 0.0;
  }

  public static double getMwSt() {
    return MwSt;
  }

  public void positionHinzufuegen(Position pos) {
    positionen[last_position] = pos;
    last_position++;
    gesamtbetrag += pos.getGesamtpreis();
  }

  public Kunde getKunde() {
    return kunde;
  }

  public String getBestelldatum() {
    return bestelldatum;
  }

  public double getEnthalteneMwSt() {
    return gesamtbetrag - gesamtbetrag / (MwSt + 1);
  }

  public double getGesamtbetrag() {
    return gesamtbetrag;
  }

  public int getNummer() {
    return nummer;
  }

  public String getRechnungsdatum() {
    return rechnungsdatum;
  }

  public Position[] getPositionen() {
    return positionen;
  }

  public void drucken() {
    System.out.println(
      "============================================================="
    );
    //System.out.println(kunde);

    System.out.printf("%-20s %s\n", "Rechnung vom:", rechnungsdatum);
    System.out.printf("%-20s %s\n", "Ihre Kunden-Nr:", kunde.getNummer());
    System.out.printf("%-20s %s\n", "Rechnungs-Nr:", nummer + "\n");
    System.out.printf("%-20s %s\n", "Bestelldatum:", bestelldatum);

    String myTableFormat = "%-10s %-20s %-6s %-11s %-11s";
    String myLineFormat = "%-10s %-20s %6d %11.2f %11.2f";

    //System.out.println("\nArtikel-Nr.\t Artikelbezeichnung\tAnzahl\tEinzelpreis\tGesamtpreis");
    System.out.printf(
      myTableFormat,
      "Artikelnr.",
      "Artikelbezeichnung",
      "Anzahl",
      "Einzelpreis",
      "Gesamtpreis"
    );
    System.out.println("");

    for (int i = 0; i < positionen.length; i++) {
      positionen[i].setPrintFormat(myLineFormat);
      System.out.println(positionen[i]);
    }

    System.out.printf("\n%s %11.2f\n\n", "Gesamtbetrag EUR:", gesamtbetrag);

    System.out.print("Der Rechnungsbetrag enth�lt ");
    System.out.printf(
      "%d %s %.2f EUR\n",
      (int) (MwSt * 100),
      "% Mehrwertsteuer = ",
      this.getEnthalteneMwSt()
    );

    System.out.println("Wir danken f�r Ihren Auftrag.");
    System.out.println(
      "============================================================="
    );
  }
}
