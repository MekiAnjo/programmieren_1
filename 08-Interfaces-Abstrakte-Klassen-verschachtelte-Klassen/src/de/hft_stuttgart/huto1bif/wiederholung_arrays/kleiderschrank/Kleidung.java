package de.hft_stuttgart.huto1bif.wiederholung_arrays.kleiderschrank;

/**
 * Kleider
 */
public abstract class Kleidung {

  private Color color;
  private int size;

  protected Kleidung(Color color, int size) {
    this.color = color;
    this.size = size;
  }

  public Color getColor() {
    return this.color;
  }

  public int getSize() {
    return this.size;
  }

  public enum Color {
    RED,
    PINK,
    BLUE,
    INDIGO,
    CYAN,
    GREEN,
    YELLOW,
    ORANGE,
    PURPLE,
    WHITE,
    GRAY,
    BLACK,
  }

  @Override
  public String toString() {
    return "Kleidung [color=" + color + ", size=" + size + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((color == null) ? 0 : color.hashCode());
    result = prime * result + size;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Kleidung other = (Kleidung) obj;
    if (color != other.color) {
      return false;
    }
    if (size != other.size) {
      return false;
    }
    return true;
  }
}
