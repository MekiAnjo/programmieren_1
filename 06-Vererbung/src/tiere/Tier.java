package tiere;

public abstract class Tier {

  private String name;

  protected Tier(String name) {
    this.name = name;
  }

  protected abstract void geraeuschMachen();

  protected void laufen() {
    System.out.println(name + " läuft");
  }
}
