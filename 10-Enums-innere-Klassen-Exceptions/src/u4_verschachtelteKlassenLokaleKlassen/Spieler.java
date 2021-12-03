package u4_verschachtelteKlassenLokaleKlassen;

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
