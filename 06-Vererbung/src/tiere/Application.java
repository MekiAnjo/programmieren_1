package tiere;

public class Application {

  public static void main(String[] args) {
    Tier[] meineTiere = new Tier[3];

    meineTiere[0] = new Hund("Sunika");
    meineTiere[1] = new Katze("Sammy");
    meineTiere[2] = new Kuh("MuhKuh");

    for (Tier tier : meineTiere) {
      tier.laufen();
      tier.geraeuschMachen();
    }
  }
}
