package animals;

public abstract class Insect extends Animal {

  private int legCount;

  Insect(String name, int age, int legCount) {
    super(name, age);
    this.legCount = legCount;
  }

  public abstract void attack();

  public int getLegCount() {
    return legCount;
  }
}
