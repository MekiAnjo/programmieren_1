package de.hft_stuttgart.huto1bif.wiederholung_arrays.kleiderschrank;

public class Hose extends Kleidung {

  protected Hose(Color color, int size) {
    super(color, size);
  }

  @Override
  public String toString() {
    return (
      "Hose [color: " + super.getColor() + " | size: " + super.getSize() + "]"
    );
  }
}
