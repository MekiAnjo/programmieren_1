package de.hft_stuttgart.huto1bif.aufgabe_7_2;

/**
 * Dreieck
 */
public class Dreieck extends Figur {

  private final double seitenlaenge;

  Dreieck(double seitenlaenge) {
    super("Dreieck");
    this.seitenlaenge = seitenlaenge;
  }

  Dreieck(double seitenlaenge, Koordinate anker) {
    super("Dreieck", anker);
    this.seitenlaenge = seitenlaenge;
  }
}
