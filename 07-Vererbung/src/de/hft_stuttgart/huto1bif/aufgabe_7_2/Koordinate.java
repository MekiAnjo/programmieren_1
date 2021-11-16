package de.hft_stuttgart.huto1bif.aufgabe_7_2;

/**
 * Koordinate
 */
public class Koordinate {

  private double x;
  private double y;

  public Koordinate(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX() {
    return x;
  }

  public void setX(double x) {
    this.x = x;
  }

  public double getY() {
    return y;
  }

  public void setY(double y) {
    this.y = y;
  }

  public double berechneAbstandzumUrsprung() {
    return Math.round(Math.abs(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2))));
  }

  @Override
  public String toString() {
    return "Koordinate [x=" + x + ", y=" + y + "]";
  }
}
