package u5_verschachtelteKlassenAnonymeKlassen;

public class Spieler {

  private String name;

  public Spieler(String name) {
    this.name = name;
  }

  public String calculate() {
    // ZufallsZahl rand = new ZufallsZahl() {
    //   @Override
    //   public int random() {
    //     return (int) (Math.random() * 6) + 1;
    //   }
    // };
    ZufallsZahl rand = () -> (int) (Math.random() * 6) + 1;

    return (name + ": " + rand.random());
  }
}
