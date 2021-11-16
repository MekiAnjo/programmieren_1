package de.hft_stuttgart.huto1bif.aufgabe_7_2;

/**
 * Kreis
 */
public class Kreis extends Figur {

  private final double radius;

  public Kreis(double radius) {
    super("Kreis");
    this.radius = radius;
  }

  public Kreis(double radius, Koordinate anker) {
    super("Kreis", anker);
    this.radius = radius;
  }
}
