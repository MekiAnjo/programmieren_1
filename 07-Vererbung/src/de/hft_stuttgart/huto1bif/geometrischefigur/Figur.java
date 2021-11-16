package de.hft_stuttgart.huto1bif.geometrischefigur;

/**
 * GeometrischeFigur
 */
public class Figur {

  private final String name;
  private final Koordinate anker;

  public Figur(String name) {
    this.name = name;
    this.anker = Koordinate.URSPRUNG;
  }

  public Figur(String name, Koordinate anker) {
    this.name = name;
    this.anker = anker;
  }

  public String getName() {
    return name;
  }

  public Koordinate getAnker() {
    return anker;
  }
}
