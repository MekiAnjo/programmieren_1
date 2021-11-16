package de.hft_stuttgart.huto1bif.geometrischefigur;

/**
 * Quadrat
 */
public class Quadrat extends Figur {

  private final double seitenlaenge;

  Quadrat(double seitenlaenge) {
    super("Quadrat");
    this.seitenlaenge = seitenlaenge;
  }

  Quadrat(double seitenlaenge, Koordinate anker) {
    super("Quadrat", anker);
    this.seitenlaenge = seitenlaenge;
  }
}
