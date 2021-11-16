package tiere;

public class Katze extends Tier {

  protected Katze(String name) {
    super(name);
  }

  @Override
  protected void geraeuschMachen() {
    System.out.println("Miau");
  }
}
