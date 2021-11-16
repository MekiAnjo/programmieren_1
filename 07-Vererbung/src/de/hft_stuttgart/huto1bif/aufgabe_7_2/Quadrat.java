package de.hft_stuttgart.huto1bif.aufgabe_7_2;

/**
 * Quadrat
 */
public class Quadrat extends GeometrischeFigur {

  private double a;

  public Quadrat(Koordinate anker, double a) {
    super(anker);
    this.a = a;
  }

  @Override
  public double berechneUmfang() {
    return 4 * a;
  }

  @Override
  public String toString() {
    return (
      super.toString() +
      " [a=" +
      a +
      "]" +
      " d=" +
      anker.berechneAbstandzumUrsprung()
    );
  }
}
