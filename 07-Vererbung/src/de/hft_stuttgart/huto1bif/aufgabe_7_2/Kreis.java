package de.hft_stuttgart.huto1bif.aufgabe_7_2;

/**
 * Kreis
 */
public class Kreis extends GeometrischeFigur {

  private double r;

  public Kreis(Koordinate anker, double r) {
    super(anker);
    this.r = r;
  }

  @Override
  public double berechneUmfang() {
    return 2 * Math.PI * r;
  }

  @Override
  public String toString() {
    return (
      super.toString() +
      " [r=" +
      r +
      "]" +
      " d=" +
      anker.berechneAbstandzumUrsprung()
    );
  }
}
