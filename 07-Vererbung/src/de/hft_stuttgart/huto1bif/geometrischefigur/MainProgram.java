package de.hft_stuttgart.huto1bif.geometrischefigur;

/**
 * Main
 */
public class MainProgram {

  public static void main(String[] args) {
    Figur[] f = new Figur[3];

    f[0] = new Kreis(4.0, new Koordinate(10, 10));
    f[1] = new Dreieck(2.0, new Koordinate(5, 5));
    f[2] = new Quadrat(2.0, new Koordinate(5, 5));

    for (Figur teil : f) {
      System.out.println(
        "Name: " + teil.getName() + "\nKoordinate: " + teil.getAnker()
      );

      // Zusatzaufgabe
      System.out.println(
        " Abstand zum Ursprung: " + teil.getAnker().abstand(Koordinate.URSPRUNG)
      );
    }
  }
}
