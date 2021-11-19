package de.hft_stuttgart.huto1bif.a1x_tiereMitInterface;

public abstract class Tier {

  String name;

  protected Tier(String name) {
    super();
    this.name = name;
  }

  @Override
  public String toString() {
    return "Tier [name=" + name + "]";
  }
}
