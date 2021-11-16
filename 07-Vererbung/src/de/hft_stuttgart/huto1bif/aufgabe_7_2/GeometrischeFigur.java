package de.hft_stuttgart.huto1bif.aufgabe_7_2;

/**
 * GeometrischeFigur
 */
public abstract class GeometrischeFigur
  implements Comparable<GeometrischeFigur> {

  protected Koordinate anker;

  protected GeometrischeFigur(Koordinate anker) {
    this.anker = anker;
  }

  protected abstract double berechneUmfang();

  @Override
  public int compareTo(GeometrischeFigur o) {
    return (
        (
          o.anker.berechneAbstandzumUrsprung() -
          this.anker.berechneAbstandzumUrsprung()
        ) >
        0
      )
      ? 1
      : -1;
    // bei 1 bleiben die Werte an ihrer Stelle
    // bei -1 tauschen sollen die Werte
  }

  @Override
  public String toString() {
    String className = this.getClass().getSimpleName();
    return (className + " [anker=" + anker + "]");
  }
}
