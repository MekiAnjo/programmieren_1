package u1_verschachtelteKlassengetrennteKlassen;

public class Spieler {

  private String name;

  public Spieler(String name) {
    this.name = name;
  }

  public String calculate() {
    Wuerfel wuerfel = new Wuerfel();
    return name + ": " + wuerfel.calculate();
  }
}
