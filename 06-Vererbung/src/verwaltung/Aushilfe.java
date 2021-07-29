package verwaltung;

public class Aushilfe extends Mitarbeiter {

  private int arbeitszeit;

  protected Aushilfe(String name, String vorname, int gehalt, int arbeitszeit) {
    super(name, vorname, gehalt);
    this.arbeitszeit = arbeitszeit;
  }

  public int getArbeitszeit() {
    return this.arbeitszeit;
  }

  public void setArbeitszeit(int arbeitszeit) {
    this.arbeitszeit = arbeitszeit;
  }

  @Override
  public String toString() {
    return (
      "Aushilfe[" +
      super.toString() +
      ", Arbeitszeit=" +
      getArbeitszeit() +
      ", Gehalt: " +
      getGehalt() +
      "]"
    );
  }
}
