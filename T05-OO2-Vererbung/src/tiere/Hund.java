package tiere;

public class Hund extends Tier {

  protected Hund(String name) {
    super(name);
  }

  @Override
  protected void geraeuschMachen() {
    System.out.println("Wuff");
  }
}
