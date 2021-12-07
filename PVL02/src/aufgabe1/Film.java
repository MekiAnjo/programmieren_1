package aufgabe1;

public abstract class Film {

  protected String name;
  protected int laenge;
  protected int altersbeschraenkung;
  protected double preis;

  protected Film(String name, int laenge, int altersbeschraenkung) {
    this.name = name;
    this.laenge = laenge;
    this.altersbeschraenkung = altersbeschraenkung;
    this.preis = 7.50;
  }

  public String getName() {
    return this.name;
  }

  public int getLaenge() {
    return this.laenge;
  }

  public int getAltersbeschraenkung() {
    return this.altersbeschraenkung;
  }

  public double getPreis() {
    return this.preis;
  }

  public abstract String getFilmInfo();

  @Override
  public String toString() {
    return (
      "Film [name=" +
      name +
      ", laenge=" +
      laenge +
      ", altersbeschraenkung=" +
      altersbeschraenkung +
      ", preis=" +
      preis +
      "]"
    );
  }
}
