package bibliothekssoftware;

/**
 * Buch
 */
public class Buch {

  private final String name;
  private final int ID;
  private boolean istAusgeliehen;

  public Buch(String name, int iD) {
    this.name = name;
    ID = iD;
    istAusgeliehen = false;
  }

  public String getName() {
    return this.name;
  }

  public int getID() {
    return this.ID;
  }

  public void setIstAusgeliehen(boolean istAusgeliehen) {
    this.istAusgeliehen = istAusgeliehen;
  }

  @Override
  public String toString() {
    return ("Buch{" + " name='" + name + "'" + ", ID='" + ID + "'" + "}");
  }
}
