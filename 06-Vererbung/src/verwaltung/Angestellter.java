package verwaltung;

public class Angestellter extends Mitarbeiter {

  private int einstellungsjahr;
  private int urlaubstage;

  protected Angestellter(
    String name,
    String vorname,
    int gehalt,
    int einstellungsjahr,
    int urlaubstage
  ) {
    super(name, vorname, gehalt);
    this.einstellungsjahr = einstellungsjahr;
    this.urlaubstage = urlaubstage;
  }

  public int getEinstellungsjahr() {
    return this.einstellungsjahr;
  }

  public void setEinstellungsjahr(int einstellungsjahr) {
    this.einstellungsjahr = einstellungsjahr;
  }

  public int getUrlaubstage() {
    return this.urlaubstage;
  }

  public void setUrlaubstage(int urlaubstage) {
    this.urlaubstage = urlaubstage;
  }

  @Override
  public String toString() {
    return (
      "Angestellter[" +
      super.toString() +
      ", Einstellungsjahr=" +
      getEinstellungsjahr() +
      ", Urlaubstage=" +
      getUrlaubstage() +
      ", Gehalt: " +
      getGehalt() +
      "]"
    );
  }
}
