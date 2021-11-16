package de.hft_stuttgart.huto1bif.aufgabe_7_2;

/**
 * Dreieck
 */
public class Dreieck extends GeometrischeFigur {

  private double a, b, c;

  public Dreieck(Koordinate anker, double a, double b, double c) {
    super(anker);
    this.a = a;
    this.b = b;
    this.c = c;
  }

  @Override
  public double berechneUmfang() {
    return a + b + c;
  }

  @Override
  public String toString() {
    return (
      super.toString() +
      " [a=" +
      a +
      ", b=" +
      b +
      ", c=" +
      c +
      "]" +
      " d=" +
      anker.berechneAbstandzumUrsprung()
    );
  }
}
