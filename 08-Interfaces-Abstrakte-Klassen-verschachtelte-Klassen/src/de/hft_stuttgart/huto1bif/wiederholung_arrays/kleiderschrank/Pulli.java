package de.hft_stuttgart.huto1bif.wiederholung_arrays.kleiderschrank;

public class Pulli extends Kleidung {

  protected Pulli(Color color, int size) {
    super(color, size);
  }

  @Override
  public String toString() {
    return (
      "Pulli [color: " + super.getColor() + " | size: " + super.getSize() + "]"
    );
  }
}
