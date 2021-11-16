package de.hft_stuttgart.huto1bif.aufgabe_7_2;

/**
 * Koordinate
 */
public class Koordinate {

  public static final Koordinate URSPRUNG = new Koordinate(0, 0);

  private final double x;
  private final double y;

  Koordinate(double x, double y) {
    this.x = x;
    this.y = y;
  }

  // Zusatzaufgabe
  public double abstand(Koordinate other) {
    final double dx = x - other.x;
    final double dy = y - other.y;
    return Math.sqrt(dx * dx + dy * dy);
  }

  @Override
  public String toString() {
    return "(" + x + ", " + y + ")";
  }
}
