package verwaltung;

public abstract class Mitarbeiter {

  private String name;
  private String vorname;
  private int gehalt;

  protected Mitarbeiter(String name, String vorname, int gehalt) {
    this.name = name;
    this.vorname = vorname;
    this.gehalt = gehalt;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getVorname() {
    return this.vorname;
  }

  public void setVorname(String vorname) {
    this.vorname = vorname;
  }

  public int getGehalt() {
    return this.gehalt;
  }

  public void setGehalt(int gehalt) {
    this.gehalt = gehalt;
  }

  @Override
  public String toString() {
    return "Name: " + vorname + " " + name;
  }
}
