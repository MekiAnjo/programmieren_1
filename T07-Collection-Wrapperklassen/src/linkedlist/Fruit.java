package linkedlist;

public class Fruit {

  private String name;
  private String colour;

  public Fruit(String name, String colour) {
    this.name = name;
    this.colour = colour;
  }

  public String getName() {
    return this.name;
  }

  public String getColour() {
    return this.colour;
  }

  @Override
  public String toString() {
    return "Fruit [name=" + name + ", colour=" + colour + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((colour == null) ? 0 : colour.hashCode());
    result = prime * result + ((name == null) ? 0 : name.hashCode());
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
    Fruit other = (Fruit) obj;
    if (colour == null) {
      if (other.colour != null) {
        return false;
      }
    } else if (!colour.equals(other.colour)) {
      return false;
    }
    if (name == null) {
      if (other.name != null) {
        return false;
      }
    } else if (!name.equals(other.name)) {
      return false;
    }
    return true;
  }
}
