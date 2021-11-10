package de.hft_stuttgart.huto1bif.myShop;

public class Position {

  private Artikel mArtikel;
  private int anzahl;
  private double gesamtpreis;
  private String printFormat;

  public Position(Artikel artikel, int anzahl) {
    this.mArtikel = artikel;
    this.anzahl = anzahl;
    this.gesamtpreis = anzahl * this.getArtikel().getPreis();
  }

  public int getAnzahl() {
    return this.anzahl;
  }

  public double getGesamtpreis() {
    return this.gesamtpreis;
  }

  public Artikel getArtikel() {
    return mArtikel;
  }

  @Override
  public String toString() {
    String ret;
    if (printFormat == null) {
      ret =
        mArtikel.getNummer() +
        "\t\t" +
        mArtikel.getBezeichnung() +
        "\t\t" +
        anzahl +
        "\t\t" +
        mArtikel.getPreis() +
        "\t\t" +
        gesamtpreis;
    } else {
      ret =
        String.format(
          printFormat,
          mArtikel.getNummer(),
          mArtikel.getBezeichnung(),
          anzahl,
          mArtikel.getPreis(),
          gesamtpreis
        );
    }

    return ret;
    //        return mArtikel.getNummer() + "\t\t" + mArtikel.getBezeichnung()
    //                + "\t\t" + anzahl + "\t\t" + mArtikel.getPreis() + "\t\t"
    //                + gesamtpreis;
  }

  public void setPrintFormat(String printFormat) {
    this.printFormat = printFormat;
  }
}
