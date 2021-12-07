package aufgabe1;

public class Actionfilm extends Film {

  private String dimension;

  protected Actionfilm(
    String name,
    int laenge,
    int altersbeschraenkung,
    String dimension
  ) {
    super(name, laenge, altersbeschraenkung);
    this.preis = (dimension.equals("3D") ? preis + 3.00 : preis);
  }

  @Override
  public String getFilmInfo() {
    return (
      "Name: " + name + ", Filmlänge: " + laenge + ", Variante: " + dimension
    );
  }
}
