package tiere;

public class Kuh extends Tier {

  protected Kuh(String name) {
    super(name);
  }

  @Override
  protected void geraeuschMachen() {
    System.err.println("Muh");
  }
}
