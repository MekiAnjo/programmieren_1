package de.hft_stuttgart.huto1bif.fotos;

public class FotoApparat {

  public static String MADE_IN = "Deutschland";
  private String marke;
  private int megaPixel;
  private double displayGroesse;
  private boolean bildStabilisiert;
  private Objektiv objektiv;

  FotoApparat(
    String marke,
    int megaPixel,
    double displayGroesse,
    boolean bildStabilisiert,
    Objektiv objektiv
  ) {
    super();
    this.marke = marke;
    this.megaPixel = megaPixel;
    this.displayGroesse = displayGroesse;
    this.bildStabilisiert = bildStabilisiert;
    this.objektiv = objektiv;
  }

  void machFoto() {
    if (objektiv == null) {
      System.out.println("*** Kein Objektiv an Kamera");
    } else {
      System.out.println(
        "Klick mit (" +
        objektiv.getBrennweiteMin() +
        "," +
        objektiv.getBrennweiteMax() +
        ")"
      );
    }
  }

  FotoApparat setObjektiv(Objektiv objektiv) {
    this.objektiv = objektiv;
    return this;
  }

  public Objektiv getObjektiv() {
    return objektiv;
  }

  public Objektiv entferneObjektiv() {
    Objektiv result = objektiv;
    objektiv = null;
    return result;
  }

  @Override
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder
      .append("FotoApparat [marke=")
      .append(marke)
      .append(", megaPixel=")
      .append(megaPixel)
      .append(", displayGroesse=")
      .append(displayGroesse)
      .append(", bildStabilisiert=")
      .append(bildStabilisiert)
      .append(", objektiv=")
      .append(objektiv)
      .append("]");
    return stringBuilder.toString();
  }
}
