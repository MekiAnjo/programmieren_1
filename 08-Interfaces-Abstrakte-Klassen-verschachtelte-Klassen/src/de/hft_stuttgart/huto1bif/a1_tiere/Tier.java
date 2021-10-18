package de.hft_stuttgart.huto1bif.a1_tiere;

public abstract class Tier {

  String name;

  public Tier(String name) {
    super();
    this.name = name;
  }

  @Override
  public String toString() {
    return "Tier [name=" + name + "]";
  }
}
